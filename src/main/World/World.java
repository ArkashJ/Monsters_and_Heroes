package main.World;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import main.Characters.Heroes.Heroes;
import main.Teams.TeamHeroes;
import main.World.Cell.Cell;
/*
The world of the game is represented by a fixed, square grid of spaces. The grid contains three types of spaces:
• Inaccessible spaces, which the heroes cannot enter
• Market spaces, where items can be bought or sold
• Common spaces, where battles can occur

 Every time the heroes visit a space, we "roll a die," and, if they are unlucky, then the monsters are created and the battle begins immediately.
 An example world size is 8 spaces by 8 spaces. In this size our suggestion is to have 20% inaccessible spaces, 30% market spaces, and 50% common spaces.
 */

import main.Colors.colors;

import static main.Colors.colors.colorText;

public class World {
    private Cell[][] world;
    private TeamHeroes teamHeroes;
    private int size;

    public World(int size){
        this.size = size;
        world = new Cell[size][size];
        generateRandomBoard();
    }

    public Cell[][] getWorld() {
        return world;
    }

    public void setWorld(Cell[][] world) {
        this.world = world;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void generateRandomBoard(){
        int numCells = size * size;
        int numInaccessible = (int) (numCells * 0.2);
        int numMarket = (int) (numCells * 0.3);
        int numCommon = numCells - numInaccessible - numMarket;

        ArrayList<String> board = new ArrayList<>();

        for (int i = 0; i < numInaccessible; i++){
            board.add("inaccessible");
        }
        for (int i = 0; i < numMarket; i++){
            board.add("market");
        }
        for (int i = 0; i < numCommon; i++){
            board.add("common");
        }

        Collections.shuffle(board);
        int cellIndex = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                world[i][j] = new Cell(board.get(cellIndex));
                cellIndex++;
            }
        }
    }

    public void printWorld() {
        String separator = "|";
        String cellFormat = " %s ";

        // Print the top border
        for (int i = 0; i < size; i++) {
            System.out.print("+---");
        }
        System.out.println("+");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String cellType = world[i][j].getType();
                String cellRepresentation;
                String color = "gray";
                switch (cellType) {
                    case "inaccessible":
                        cellRepresentation = "x";
                        color = "red";
                        break;
                    case "market":
                        cellRepresentation = "M";
                        color = "yellow";
                        break;
                    case "common":
                        cellRepresentation = " ";
                        break;
                    default:
                        cellRepresentation = "?";
                        break;
                }
                System.out.print(separator + colorText(String.format(cellFormat, cellRepresentation), color));
            }
            System.out.println(separator);

            // Print the bottom border
            for (int j = 0; j < size; j++) {
                System.out.print("+---");
            }
            System.out.println("+");
        }
    }



    public void enterCell(int x, int y) {
        if (world[x][y].getType().equals("inaccessible")){
            System.out.println("You can't enter this cell");
            return;
        }
        if (teamHeroes.getHeroes().get(0) == null) {
            System.out.println("You don't have any heroes");
            return;
        } // Check if the first hero is null
        Heroes firstHero = teamHeroes.getHeroes().get(0); // Get the first hero from the team
        world[x][y].enterCell(firstHero); // Call the enterCell method of the Cell class with the first hero
    }

    public void moveHeroes(int x, int y){
        Heroes firstHero = teamHeroes.getHeroes().get(0); // Get the first hero from the team
        firstHero.getPosition().setPos(x, y); // Set the position of the first hero to the new position
        enterCell(x, y); // Call the enterCell method of the World class with the new position
    }


    public static void main(String[] args){
        World world = new World(8);
        world.printWorld();
    }

}

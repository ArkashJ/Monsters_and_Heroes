package main.Battle;
/*
 The class defines the rules of battle in this game
 The user is asked to choose a team of heroes, maximum being 3. The heroes are then placed in a random order and they
 move around the world in the World class. At a common space, every cell the user enter is either inaccessible, a market
 or a common space. If the user enters a common space, a probability generator is used to determine if a battle will occur which is
 handled by the cell class. If the battle begins, use the following rule to spawn the level of monsters
 sum of HP of Heroes / 100 * number of heroes = probability, the higher the probability, the higher the level of monsters
 */
import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;
import main.Market.Market;
import main.Positions.Positions;
import main.Teams.TeamHeroes;
import main.Teams.TeamMonsters;
import main.World.World;
import main.StoryLine;
import main.controls;

import java.util.Scanner;
import static main.StoryLine.startStory;

public class Battle {

    private World world;
    private TeamHeroes teamHeroes;
    private Market market;
    private Scanner scanner;
    public Battle() {
        scanner = new Scanner(System.in);
        createNewGame();
    }

    public void createNewGame() {
        startStory();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Welcome to the Monsters and Heroes game!");
        System.out.println("Enter the size of the world (e.g., 8 for an 8x8 world):");
        int worldSize = scanner.nextInt();
        world = new World(worldSize);
        world.printWorld();

        while (true) {
            System.out.println("Do you want to change the world (y/n)?");
            String answer = scanner.next();
            if (answer.equals("n")) {
                break;
            }
            resetWorld();
        }
        market = new Market(); // Initialize the market
        // Load the items for the market here
        selectHeroes();
    }

    public void selectHeroes() {
        System.out.println("Select your team of heroes (maximum 3 heroes):");
        // Implement hero selection logic here
    }

    public void resetWorld() {
        world.generateRandomBoard();
        world.printWorld();
    }

    public void mainGameLoop() {
        controls control = new controls();
        Scanner scanner = new Scanner(System.in);
        char input;
        while (true) {
            // Implement main game loop logic here
            System.out.println("Enter your command (WASD for movement, Q to quit, I for info, M to enter market): ");
            input = scanner.next().charAt(0);

            if (input == control.getQuit()) {
                System.out.println("Quitting the game...");
                break;
            }

            // Move the hero based on user input
            Positions currentPosition = teamHeroes.getHeroes().get(0).getPosition();
            Positions newPosition = control.move(currentPosition, input);

            // Check if the new position is within the bounds of the world
            if (newPosition.getX_pos() >= 0 && newPosition.getX_pos() < world.getSize() &&
                    newPosition.getY_pos() >= 0 && newPosition.getY_pos() < world.getSize()) {

                teamHeroes.getHeroes().get(0).getPosition().setPos(newPosition.getX_pos(), newPosition.getY_pos());
//                enterCell(newPosition.getX_pos(), newPosition.getY_pos());
            } else {
                System.out.println("You cannot move outside the world!");
            }

            if (input == control.getI()) {
                // Implement the display information method
                System.out.println("Display information about the heroes: ");
                for (Heroes hero : teamHeroes.getHeroes()) {
                    hero.printStats();
                }
            }
        }
    }

    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.mainGameLoop();
    }

    public void battle(TeamHeroes teamHeroes, TeamMonsters teamMonsters) {
        // Implement battle logic here
    }
}

package main;

import main.Positions.Positions;

import static main.Colors.colors.colorText;

public class controls {
    // W/w = up
    // S/s = down
    // D/d = right
    // A/a = left
    // Q/q = quit
    // I/i = display information
    // M/m = enter market
    private char up;
    private char down;
    private char right;
    private char left;
    private char quit;
    private char i;
    private char enterMarket;

    public controls() {
        this.up = 'w' | 'W';
        this.down = 's' | 'S';
        this.right = 'd' | 'D';
        this.left = 'a' | 'A';
        this.quit = 'q' | 'Q';
        this.i = 'i' | 'I';
        this.enterMarket = 'm' | 'M';
    }
    // ------------------ Getters ------------------
    public Positions moveUp(Positions pos){
        return new Positions(pos.getX_pos() - 1, pos.getY_pos());
    }

    public Positions moveDown(Positions pos){
        return new Positions(pos.getX_pos() + 1, pos.getY_pos());
    }

    public Positions moveRight(Positions pos){
        return new Positions(pos.getX_pos(), pos.getY_pos() + 1);
    }

    public Positions moveLeft(Positions pos){
        return new Positions(pos.getX_pos(), pos.getY_pos() - 1);
    }

    public char getQuit(){
        return quit;
    }

    public char getI(){
        return i;
    }

    public char getEnterMarket(){
        return enterMarket;
    }


    // ------------------ Move function to move around the world ------------------
    public Positions move(Positions pos, char input){
        return switch (input) {
            case 'w', 'W' -> moveUp(pos);
            case 's', 'S' -> moveDown(pos);
            case 'd', 'D' -> moveRight(pos);
            case 'a', 'A' -> moveLeft(pos);
            default -> pos;
        };
    }

    // ------------------ Functions dealing with printing information and entering the market------------------
    public void printControlInfo(){
        System.out.println(colorText("W | w", "red") + " - Move up");
        System.out.println(colorText("S | s", "blue") + " - Move down");
        System.out.println(colorText("D | d", "green") + " - Move right");
        System.out.println(colorText("A | a", "yellow") + " - Move left");
        System.out.println(colorText("Q | q", "black") + " - Quit the game");
        System.out.println(colorText("I | i", "gray") + " - Display information about the heroes");
        System.out.println(colorText("M | m", "cyan") + " - Enter the market");
    }
}

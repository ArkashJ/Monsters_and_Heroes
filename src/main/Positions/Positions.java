package main.Positions;

/*
 *This class takes in a player and returns their position in the board
 * x_pos = row
 * y_pos = column
 */
public class Positions {
    private int x_pos;
    private int y_pos;

    public Positions(){
        this.x_pos = 0;
        this.y_pos = 0;
    }

    public Positions(int x_pos, int y_pos){
        this.x_pos = x_pos;
        this.y_pos = y_pos;
    }

    public int getX_pos(){
        return x_pos;
    }

    public int getY_pos(){
        return y_pos;
    }

    public void setPos(int x_pos, int y_pos){
        this.x_pos = x_pos;
        this.y_pos = y_pos;
    }

    public int getPreviousX_pos(){
        return x_pos - 1;
    }

    public int getPreviousY_pos(){
        return y_pos - 1;
    }
}

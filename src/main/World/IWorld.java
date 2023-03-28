package main.World;

import main.World.Cell.Cell;

public interface IWorld {
    Cell[][] getWorld();
    void setWorld(Cell[][] world);
    int getSize();
    void setSize(int size);
    void generateRandomBoard();
    void printWorld();
    void enterCell(int x, int y);
    void moveHeroes(int x, int y);
    void printWorldInfo();
}

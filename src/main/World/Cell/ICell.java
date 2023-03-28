package main.World.Cell;

import main.Characters.Heroes.Heroes;

public interface ICell {
    String getType();
    boolean getBattle();
    void setType(String type);
    void setBattle(boolean battle);
    void enterCell(Heroes hero);
    boolean isMarket();
}

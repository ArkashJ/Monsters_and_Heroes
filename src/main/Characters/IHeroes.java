package main.Characters;

import main.Positions.Positions;

public interface IHeroes {
    Positions getPosition();
    double getDexterity();
    double getStrength();
    double getAgility();
    double getMP();
    int getGold();
    int getLevel();
    double getHP();
    void setStrength(double strength);
    void setAgility(double agility);
    void setDexterity(double dexterity);
    void setMP(double MP);

}

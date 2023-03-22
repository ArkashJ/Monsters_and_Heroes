package main.Characters;

import main.Positions.Positions;
import main.Colors.colors;

/*
A hero has several attributes:
• A name
• A level with an amount of experience points
• HP (hit points, the hero’s in battle)
• MP (mana or magic points, for casting spells)
• A strength value
• A dexterity value
• An agility value
• An amount of gold
• An inventory of items
 */
public class Heroes extends Characters implements IHeroes {
    private String name;
    private int level;
    private double HP;
    private double MP;
    private double strength;
    private double agility;
    private double dexterity;
    private final int gold;
    private Positions position;

    //-------------------------------------------------------------------------------------------------------------------
    public Heroes(String name, int level, double HP, double MP, double strength, double agility,
                  double dexterity, int gold, Positions position){
        super(name, level, HP);
        this.MP = MP;
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.gold = gold;
        this.position = position;
    }
    //-------------------------------------------------------------------------------------------------------------------
    //getters to get player statistics
    public Positions getPosition(){
        return position;
    }
    public double getDexterity(){
        return dexterity;
    }
    public double getMP(){
        return MP;
    }
    public double getStrength(){
        return strength;
    }

    public double getAgility() {
        return agility;
    }

    public int getGold(){
        return gold;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public double getHP() {
        return super.getHP();
    }
    //-------------------------------------------------------------------------------------------------------------------
    // Setters to get player statistics
    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }

    public void setMP(double MP) {
        this.MP = MP;
    }
    //------------------------------------------------------------------------------------------------------------------------
    //print player statistics before the game starts
    public void printStats(){
        System.out.println("The stats for this player are as follows: ");
        System.out.printf("Name: %s  |  Level: %d  |  HP:%,.3f  |  MP:%,.3f  |  dexterity:%,.3f  |  Agility:%,.3f  |  Strength%,.3f  |  Gold:%d :",
                name, level, HP, MP, dexterity, agility, strength, gold);
//        System.out.printf("The inventory currently is: %s", inventory);
    }
    //------------------------------------------------------------------------------------------------------------------------
}

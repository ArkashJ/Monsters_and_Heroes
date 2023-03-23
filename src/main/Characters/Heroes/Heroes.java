package main.Characters.Heroes;

import main.Characters.Characters;
import main.Positions.Positions;

import static main.Colors.colors.colorText;
/*
 * This is a heroes class that uses the characters abstract class and IHeroes interface to create a hero
 * The monster has the following attributes:
 * • A name
 * • A level with an amount of experience points
 * • HP (hit points, the monster’s in battle)
 * • MP (mana or magic points, for casting spells)
 * • A strength value
 * • A dexterity value
 * • An agility value
 * • An amount of gold
 * • An inventory of items

 * The heroes class has getters and setters defined as follows:

 * Getters:
 * • getHP() - returns the hero’s HP
 * • getMP() - returns the hero’s MP
 * • getStrength() - returns the hero’s strength value
 * • getDexterity() - returns the hero’s dexterity value
 * • getAgility() - returns the hero’s agility value
 * • getGold() - returns the hero’s gold
 * • getLevel() - returns the hero’s level
 * • getPosition() - returns the hero’s position

 * Setters:
 * • setStrength() - sets the hero’s strength value
 * • setDexterity() - sets the hero’s dexterity value
 * • setAgility() - sets the hero’s agility value
 * • setMP() - sets the hero’s MP

 * printStats() - prints the heroes stats
 */
public class Heroes extends Characters implements IHeroes {
    private String name;
    private int level;
    private int experience;
    private double HP;
    private double MP;
    private double strength;
    private double agility;
    private double dexterity;
    private int gold;
    private Positions position;

    //-------------------------------------------------------------------------------------------------------------------
    public Heroes(String name, int level, int experience, double HP, double MP, double strength, double agility,
                  double dexterity, int gold, Positions position){
        super(name, level, HP);
        this.MP = MP;
        this.experience = experience;
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.gold = gold;
        this.position = position;
    }
    //-------------------------------------------------------------------------------------------------------------------
    //getters to get player statistics
    public Positions getPosition(){ return position; }

    public double getMP(){
        return MP;
    }

    public double getDexterity(){
        return dexterity;
    }
    public double getStrength(){
        return strength;
    }

    public double getAgility() { return agility; }

    public int getExperience() { return experience;}
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

    public void setGold(int gold) { this.gold = gold;}

    public void setExperience(int experience) { this.experience = experience; }
    //------------------------------------------------------------------------------------------------------------------------
    //print player statistics before the game starts
    public void printStats(){
        System.out.println("The stats for this player are as follows: ");
        String tempName = colorText(String.format("Name: %s", name), "black");
        String tempLevel = colorText(String.format("Level: %d", level), "red");
        String tempHP = colorText(String.format("HP: %,.3f", HP), "green");
        String tempMP = colorText(String.format("MP: %,.3f", MP), "blue");
        String tempDexterity = colorText(String.format("Dexterity: %,.3f", dexterity), "black");
        String tempAgility = colorText(String.format("Agility: %,.3f", agility), "purple");
        String tempStrength = colorText(String.format("Strength: %,.3f", strength), "cyan");
        String tempGold = colorText(String.format("Gold: %d", gold), "yellow");

        System.out.println(tempName + "  |  " + tempLevel + "  |  " + tempHP + "  |  " + tempMP + "  |  " + tempDexterity +
                "  |  " + tempAgility + "  |  " + tempStrength + "  |  " + tempGold + "  |  ");
        // System.out.printf("The inventory currently is: %s", inventory);
    }
    //------------------------------------------------------------------------------------------------------------------------
}

package main.Characters.Monsters;

import main.Characters.Characters;

import static main.Colors.colors.colorText;
/*
    * This is a monsters class that uses the characters abstract class and IMonsters interface to create a monster
    * The monster has the following attributes:
    * • A name
    * • A level with an amount of experience points
    * • HP (hit points, the monster’s in battle)
    * • A base damage value
    * • A defence value
    * • A dodge agility value

    * The monster class has getters and setters defined as follows:
    * Getters:
    * • getHP() - returns the monster’s HP
    * • getBaseDamage() - returns the monster’s base damage
    * • getDefenseValue() - returns the monster’s defence value

    * Setters:
    * • setBaseDamage() - sets the monster’s base damage
    * • setDefenceValue() - sets the monster’s defence value
    * • setDodgeAgility() - sets the monster’s dodge agility value

    * printStats() - prints the monster’s stats
 */

public class Monsters extends Characters implements IMonsters {
//    private double HP;
//    private int level;
    private double baseDamage;
    private double defenceValue;
    private double dodgeAgility;

    public Monsters(String name, int level, double baseDamage, double defenceValue, double dodgeAgility, double HP){
        super(name, level, HP);
        this.baseDamage = baseDamage;
        this.defenceValue = defenceValue;
        this.dodgeAgility = dodgeAgility;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
//    @Override
//    public double getHP() {
//        return super.getHP();
//    }
    //---------------------------------------------------------------------------------------------------------------------------------------

    public double getBaseDamage(){
        return baseDamage;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------

    public double getDefenseValue(){
        return defenceValue;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------

    public double getDodge(){
        return dodgeAgility;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public void setBaseDamage(double baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void setDefenceValue(double defenceValue) {
        this.defenceValue = defenceValue;
    }

    public void setDodgeAgility(double dodgeAgility) {
        this.dodgeAgility = dodgeAgility;
    }

    public void takeDamage(double damage) {
        double damageTaken = Math.max(0, damage - this.defenceValue*0.1);
        this.HP = Math.max(0, this.HP - damageTaken);
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
    public void printStats(){
        System.out.println("The stats for this monster are as follows: ");
        String tempName = colorText(String.format("Name: %s", name),  "red");
        String tempLevel = colorText(String.format("Level: %d", level), "black");
        String tempHP = colorText(String.format("HP: %,.3f", HP), "green");
        String tempBaseDamage = colorText(String.format("Base-Damage: %,.3f", baseDamage), "blue");
        String tempDefenceValue = colorText(String.format("Defence-Value: %,.3f", defenceValue), "yellow");
        String tempDodgeAgility = colorText(String.format("Dodge-Agility: %,.3f", dodgeAgility), "purple");

        System.out.println(tempName + "  |  " + tempLevel + "  |  " + tempHP + "  |  " + tempBaseDamage +
                "  |  " + tempDefenceValue + "  |  " + tempDodgeAgility + "  |  ");
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
}

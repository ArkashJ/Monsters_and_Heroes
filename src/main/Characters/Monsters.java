package main.Characters;

import main.Characters.Characters;
import main.Characters.IMonsters;

public class Monsters extends Characters implements IMonsters {
    private double HP;
    private final double baseDamage;
    private final double defenceValue;
    private final double dodgeAgility;

    public Monsters(String name, int level, double HP, double baseDamage, double defenceValue, double dodgeAgility){
        super(name, level, HP);
        this.baseDamage = baseDamage;
        this.defenceValue = defenceValue;
        this.dodgeAgility = dodgeAgility;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------


    @Override
    public double getHP() {
        return super.getHP();
    }

    public void attack(){
        // attack condition for the monsters
    }
    //---------------------------------------------------------------------------------------------------------------------------------------


    public void dodge(){
        //dodge condition
    }
    //---------------------------------------------------------------------------------------------------------------------------------------

    public void defence(){
        //defence condition
    }
    //---------------------------------------------------------------------------------------------------------------------------------------

    public double getBaseDamage(){
        return baseDamage;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------

    public double getDefenseValue(){
        return defenceValue;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------

    public double getDodgeAgility(){
        return dodgeAgility;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------

    public void printStats(){
        System.out.println("The stats for this monster are as follows: ");
        System.out.printf("Name: %s Level: %d HP:%,.3f Base-Damage:%,.3f Defence-Value:%,.3f Dodge-Agility:%,.3f", name, level, HP, baseDamage, defenceValue, dodgeAgility);
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
}

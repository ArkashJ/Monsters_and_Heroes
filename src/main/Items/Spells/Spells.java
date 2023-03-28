package main.Items.Spells;

import main.Items.Items;

import static main.Colors.colors.colorText;

public class Spells extends Items {
    // A spell has a name, a price, a level, a damage value, a mana cost, and a spell type.
    // A hero will require at least the mana cost amount of MP to cast the spell.
    // Therefore, if a hero has no MP, that hero cannot cast any spells
    // ----------------------------------------------- Variables -----------------------------------------------
    protected double damage;
    protected int manaCost;
    protected String spellType;

    // ----------------------------------------------- Getters -----------------------------------------------
    public double getDamage() {
        return damage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getSpellType() {
        return spellType;
    }
    // ----------------------------------------------- Setters -----------------------------------------------

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public void setSpellType(String spellType) {
        this.spellType = spellType;
    }

    // ----------------------------------------------- Constructors -----------------------------------------------
    public Spells(String name, int price, int level, double damage, int manaCost ) {
        super(name, price, level);
        this.damage = damage;
        this.manaCost = manaCost;
//        this.spellType = spellType;
    }
    // ----------------------------------------------- Methods -----------------------------------------------
    public void printStats(){
        System.out.println("The stats for this spell are as follows: ");
        String tempName = colorText(String.format("Name: %s", name), "red");
        String tempLevel = colorText(String.format("Level: %d", level), "green");
        String tempPrice = colorText(String.format("HP: %d", price), "blue");
        String tempDamage = colorText(String.format("MP: %,.3f", damage), "purple");
        String tempManaCost = colorText(String.format("MP: %d", manaCost), "yellow");
//        String tempSpellType = colorText(String.format("MP: %s", spellType), "black");
        System.out.println(tempName + "  |  " + tempLevel + "  |  " + tempPrice + "  |  " + tempDamage + "  |  " +
                tempManaCost + "  |  ");
    }

}

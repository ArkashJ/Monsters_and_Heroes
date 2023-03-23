package main.Items;

import static main.Colors.colors.colorText;

public abstract class Spells {
    // A spell has a name, a price, a level, a damage value, a mana cost, and a spell type.
    // A hero will require at least the mana cost amount of MP to cast the spell.
    // Therefore, if a hero has no MP, that hero cannot cast any spells
    // ----------------------------------------------- Variables -----------------------------------------------
    private String name;
    private int price;
    private int level;
    private double damage;
    private int manaCost;
    private String spellType;

    // ----------------------------------------------- Getters -----------------------------------------------
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getLevel() {
        return level;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLevel(int level) {
        this.level = level;
    }

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
    public Spells(String name, int price, int level, double damage, int manaCost, String spellType) {
        this.name = name;
        this.price = price;
        this.level = level;
        this.damage = damage;
        this.manaCost = manaCost;
        this.spellType = spellType;
    }

    // ----------------------------------------------- Methods -----------------------------------------------
    public void printStats(){
        System.out.println("The stats for this armor are as follows: ");
        String tempName = colorText(String.format("Name: %s", name), "red");
        String tempLevel = colorText(String.format("Level: %d", level), "green");
        String tempPrice = colorText(String.format("HP: %d", price), "blue");
        String tempDamage = colorText(String.format("MP: %,.3f", damage), "purple");
        String tempManaCost = colorText(String.format("MP: %d", manaCost), "yellow");
        String tempSpellType = colorText(String.format("MP: %s", spellType), "black");
        System.out.println(tempName + "  |  " + tempLevel + "  |  " + tempPrice + "  |  " + tempDamage + "  |  " +
                tempManaCost + "  |  " + tempSpellType + "  |  ");
    }

}

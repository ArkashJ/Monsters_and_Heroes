package main.Items;

import static main.Colors.colors.colorText;

public class Weapons {
    // A weapon has a name, a price, a level, a damage value, and the number of hands required to use it
    // ----------------------------------------  Variables  ----------------------------------------
    private String name;
    private int price;
    private int level;
    private double damage;
    private int hands;
    // ----------------------------------------  Getters  ----------------------------------------
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
    public int getHands() {
        return hands;
    }
    // ----------------------------------------  Setters  ----------------------------------------
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

    public void setHands(int hands) {
        this.hands = hands;
    }
    // ----------------------------------------  Constructors  ----------------------------------------
    public Weapons(String name, int price, int level, double damage, int hands) {
        this.name = name;
        this.price = price;
        this.level = level;
        this.damage = damage;
        this.hands = hands;
    }
    // ----------------------------------------  Methods  ----------------------------------------
    public void printStats(){
        System.out.println("The stats for this weapon are as follows: ");
        String tempName = colorText(String.format("Name: %s", name), "red");
        String tempLevel = colorText(String.format("Level: %d", level), "green");
        String tempPrice = colorText(String.format("HP: %d", price), "blue");
        String tempDamage = colorText(String.format("MP: %,.3f", damage), "purple");
        String tempHands = colorText(String.format("Dexterity: %d", hands), "yellow");
        System.out.println(tempName + "  |  " + tempLevel + "  |  " + tempPrice + "  |  " + tempDamage + "  |  " + tempHands +  "  |  ");
    }


}

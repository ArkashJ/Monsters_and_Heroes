package main.Items;

import static main.Colors.colors.colorText;

public class Armors {
    //  piece of armor has a name, a price, a level, and a damage reduction value.
    // ----------------------------------------  Variables  ----------------------------------------
    private String name;
    private int price;
    private int level;
    private double damageReduction;

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

    public double getDamageReduction() {
        return damageReduction;
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

    public void setDamageReduction(double damageReduction) {
        this.damageReduction = damageReduction;
    }

    // ----------------------------------------  Constructors  ----------------------------------------
    public Armors(String name, int price, int level, double damageReduction) {
        this.name = name;
        this.price = price;
        this.level = level;
        this.damageReduction = damageReduction;
    }

    // ----------------------------------------  Methods  ----------------------------------------
    public void printStats(){
        System.out.println("The stats for this armor are as follows: ");
        String tempName = colorText(String.format("Name: %s", name), "red");
        String tempLevel = colorText(String.format("Level: %d", level), "green");
        String tempPrice = colorText(String.format("HP: %d", price), "blue");
        String tempDamageReduction = colorText(String.format("MP: %,.3f", damageReduction), "purple");
        System.out.println(tempName + "  |  " + tempLevel + "  |  " + tempPrice + "  |  " + tempDamageReduction + "  |  " );
    }

}

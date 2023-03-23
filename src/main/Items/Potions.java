package main.Items;

import static main.Colors.colors.colorText;

public class Potions {
    // Potions are single-use items: once they are used, potions cannot be reused. Potions have a name, a price, a level, and an effect amount
    // -------------------------------------------  Variables  ---------------------------------------------------------------
    private String name;
    private int price;
    private int level;
    private int effectAmount;
    // -------------------------------------------  Getters  ---------------------------------------------------------------
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getLevel() {
        return level;
    }

    public int getEffectAmount() {
        return effectAmount;
    }

    // -------------------------------------------  Setters  ---------------------------------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setEffectAmount(int effectAmount) {
        this.effectAmount = effectAmount;
    }

    // -------------------------------------------  Constructors  ---------------------------------------------------------------
    public Potions(String name, int price, int level, int effectAmount){
        this.name = name;
        this.price = price;
        this.level = level;
        this.effectAmount = effectAmount;
    }

    // -------------------------------------------  Methods  ---------------------------------------------------------------
    public void printStats(){
        System.out.println("The stats for this potion are as follows: ");
        String tempName = colorText(String.format("Name: %s", name), "red");
        String tempLevel = colorText(String.format("Level: %d", level), "green");
        String tempPrice = colorText(String.format("HP: %d", price), "blue");
        String tempEffectAmount = colorText(String.format("Effect Amount: %d", effectAmount), "yellow");
        System.out.println(tempName + "  |  " + tempLevel + "  |  " + tempPrice + "  |  " + tempEffectAmount + "  |  " );
    }


}

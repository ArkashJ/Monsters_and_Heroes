package main.Items;

import static main.Colors.colors.colorText;

public class Potions extends Items{
    // Potions are single-use items: once they are used, potions cannot be reused. Potions have a name, a price, a level, and an effect amount
    // -------------------------------------------  Variables  ---------------------------------------------------------------
    private int effectAmount;
    // -------------------------------------------  Getters  ---------------------------------------------------------------
    public int getEffectAmount() {
        return effectAmount;
    }
    // -------------------------------------------  Setters  ---------------------------------------------------------------
    public void setEffectAmount(int effectAmount) {
        this.effectAmount = effectAmount;
    }

    // -------------------------------------------  Constructors  ---------------------------------------------------------------
    public Potions(String name, int price, int level, int effectAmount){
        super(name, price, level);
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

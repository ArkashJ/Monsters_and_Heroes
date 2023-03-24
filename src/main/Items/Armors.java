package main.Items;

import static main.Colors.colors.colorText;

public class Armors extends Items{
    //  piece of armor has a name, a price, a level, and a damage reduction value.
    // ----------------------------------------  Variables  ----------------------------------------
    private double damageReduction;

    // ----------------------------------------  Getters  ----------------------------------------
    public double getDamageReduction() {
        return damageReduction;
    }

    // ----------------------------------------  Setters  ----------------------------------------
    public void setDamageReduction(double damageReduction) {
        this.damageReduction = damageReduction;
    }

    // ----------------------------------------  Constructors  ----------------------------------------
    public Armors(String name, int price, int level, double damageReduction) {
        super(name , price, level);
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

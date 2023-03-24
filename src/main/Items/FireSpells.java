package main.Items;

public class FireSpells extends Spells{
    private double extraDefenseReduction;
    public FireSpells(String name, int price, int level, double damage, int manaCost, String spellType, double extraDefenseReduction) {
        super(name, price, level, damage, manaCost, "FireSpell");
        this.extraDefenseReduction = 0.05;   // reduction of 5% of the enemy's defense
    }
    public double getExtraDefenseReduction() {
        return extraDefenseReduction;
    }
    public void setExtraDamage(double extraDamage) {
        this.extraDefenseReduction = extraDamage;
    }
}

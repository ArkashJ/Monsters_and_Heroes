package main.Items.Spells;

import main.Items.Spells.Spells;

public class FireSpells extends Spells {
    private double extraDefenseReduction;
    String spellType = "FireSpell";
    public FireSpells(String name, int price, int level, double damage, int manaCost) {
        super(name, price, level, damage, manaCost);
        this.spellType = "FireSpell";
        this.extraDefenseReduction = 0.05;   // reduction of 5% of the enemy's defense
    }
    public double getExtraDefenseReduction() {
        return extraDefenseReduction;
    }
    public void setExtraDamage(double extraDamage) {
        this.extraDefenseReduction = extraDamage;
    }
}

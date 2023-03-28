package main.Items.Spells;

import main.Items.Spells.Spells;

public class LightningSpells extends Spells {
    private double extraDodgeChance;
    String spellType = "LightningSpell";
    public LightningSpells(String name, int price, int level, double damage, int manaCost) {
        super(name, price, level, damage, manaCost);
        this.spellType = "LightningSpell";
        this.extraDodgeChance = 0.05;    // increases dodge chance by 5%
    }
    public double getExtraDodgeChance() {
        return extraDodgeChance;
    }
    public void setExtraDodgeChance(double extraDodgeChance) {
        this.extraDodgeChance = extraDodgeChance;
    }
}

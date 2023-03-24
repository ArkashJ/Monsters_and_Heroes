package main.Items.Spells;

import main.Items.Spells.Spells;

public class LightningSpells extends Spells {
    private double extraDodgeChance;
    public LightningSpells(String name, int price, int level, double damage, int manaCost, String spellType, double extraDodgeChance) {
        super(name, price, level, damage, manaCost, "LightningSpell");
        this.extraDodgeChance = 0.05;    // increases dodge chance by 5%
    }
    public double getExtraDodgeChance() {
        return extraDodgeChance;
    }
    public void setExtraDodgeChance(double extraDodgeChance) {
        this.extraDodgeChance = extraDodgeChance;
    }
}

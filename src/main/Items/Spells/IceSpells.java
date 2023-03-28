package main.Items.Spells;

import main.Items.Spells.Spells;

public class IceSpells extends Spells {
    private double extraDamage;
    String spellType = "IceSpell";
    public IceSpells(String name, int price, int level, double damage, int manaCost) {
        super(name, price, level, damage, manaCost);
        this.spellType = "IceSpell";
        this.extraDamage = damage + (damage * 0.5);
    }
    public double getExtraDamage() {
        return extraDamage;
    }
    public void setExtraDamage(double extraDamage) {
        this.extraDamage = extraDamage;
    }
}

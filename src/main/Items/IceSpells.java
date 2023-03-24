package main.Items;

public class IceSpells extends Spells{
    private double extraDamage;
    public IceSpells(String name, int price, int level, double damage, int manaCost, String spellType) {
        super(name, price, level, damage, manaCost, "IceSpell");
        this.extraDamage = damage + (damage * 0.5);
    }
    public double getExtraDamage() {
        return extraDamage;
    }
    public void setExtraDamage(double extraDamage) {
        this.extraDamage = extraDamage;
    }

}

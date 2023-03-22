package main.Game;
import main.Characters.Heroes;
import main.Characters.Monsters;

public class FightRules implements IFightRules {

    // rules to find spell damage based on the spell the hero has in their inventory
    // Hero dexterity and spell base damage are used to calculate the spell damage
    public double spellDamage(Heroes hero){
        // spell damage calculation
        Inventory spell = hero.getInventory().getSpell();
        double spellBaseDamage = spell.getBaseDamage();
        double heroDexterity = hero.getDexterity();
        return (spellBaseDamage + heroDexterity /10000 * spellBaseDamage);
    }
    // rules to find hero's attack damage if they have a weapon in their inventory

    public double attackDamage(Heroes hero){
        // attack damage calculation
        Inventory weapon = hero.getInventory().getWeapon();
        double weaponDamage = weapon.getDamage();
        double heroStrength = hero.getStrength();
        return ((heroStrength + weaponDamage) * 0.05);
    }
    @Override
    public double getHP(Heroes hero) {
        int heroLevel = hero.getLevel();
        return heroLevel*100;
    }

    @Override
    public double getHP(Monsters monster) {
        int monsterLevel = monster.getLevel();
        return monsterLevel*100;
    }

    // dodge chance for heroes

    @Override
    public double getDodgeChance(Heroes hero) {
        double heroAgility = hero.getAgility();
        return heroAgility * 0.002;
    }

    @Override
    public double getDodgeChance(Monsters monsters) {
        double dodgeChance = monsters.getDodgeChance();
        return dodgeChance*0.01;
    }

    public void updateManaAtLevelUP(Heroes hero){
        double heroMP = hero.getMP();
        hero.setMP(heroMP*1.1);
    }


    public int expToNextLevel(Heroes hero){
        int heroLevel = hero.getLevel();
        return heroLevel*10;
    }

    public static void heroSkillsUpgrade(Heroes hero){
        double heroStrength = hero.getStrength();
        double heroAgility = hero.getAgility();
        double heroDexterity = hero.getDexterity();
        hero.setStrength(heroStrength + (heroStrength * 0.05));
        hero.setAgility(heroAgility + (heroAgility * 0.05));
        hero.setDexterity(heroDexterity + (heroDexterity * 0.05));
    }

    public void recoverFromBattle(Heroes hero){
        double heroHP = hero.getHP();
        double heroMP = hero.getMP();
        hero.setHP(heroHP*1.1);
        hero.setMP(heroMP*1.1);
    }
}

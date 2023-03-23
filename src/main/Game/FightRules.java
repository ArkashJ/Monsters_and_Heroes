package main.Game;
import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;

import java.util.ArrayList;

public class FightRules implements IFightRules {
    //---------------------------------------------------------------------------------------------------------
    // rules to find spell damage based on the spell the hero has in their inventory
    // Hero dexterity and spell base damage are used to calculate the spell damage
    public double spellDamage(Heroes hero){
        // spell damage calculation
        Inventory spell = hero.getInventory().getSpell();
        double spellBaseDamage = spell.getBaseDamage();
        double heroDexterity = hero.getDexterity();
        return (spellBaseDamage + heroDexterity /10000 * spellBaseDamage);
    }
    //---------------------------------------------------------------------------------------------------------
    // Find the hero's and monster's HP based on their level
    // For heroes, this value is used to reset HP on level up
    @Override
    public double getHP(Heroes hero) {
        int heroLevel = hero.getLevel();
        return heroLevel*100;
    }
    //---------------------------------------------------------------------------------------------------------
    @Override
    public double getHP(Monsters monster) {
        int monsterLevel = monster.getLevel();
        return monsterLevel*100;
    }
    //---------------------------------------------------------------------------------------------------------
    // update the MP for the hero when they level up
    public void updateManaAtLevelUP(Heroes hero){
        double heroMP = hero.getMP();
        hero.setMP(heroMP*1.1);
    }
    //---------------------------------------------------------------------------------------------------------
    // rules to find hero's attack damage if they have a weapon in their inventory
    public double attackDamage(Heroes hero){
        // attack damage calculation
        Inventory weapon = hero.getInventory().getWeapon();
        double weaponDamage = weapon.getDamage();
        double heroStrength = hero.getStrength();
        return ((heroStrength + weaponDamage) * 0.05);
    }
    //---------------------------------------------------------------------------------------------------------
    // dodge chance for heroes and monsters
    @Override
    public double getDodgeChance(Heroes hero) {
        double heroAgility = hero.getAgility();
        return heroAgility * 0.002;
    }
    //---------------------------------------------------------------------------------------------------------
    @Override
    public double getDodgeChance(Monsters monsters) {
        double dodgeChance = monsters.getDodge();
        return dodgeChance*0.01;
    }
    //---------------------------------------------------------------------------------------------------------
    // Experience points needed by the hero to level up
    public int expToNextLevel(Heroes hero){
        int heroLevel = hero.getLevel();
        return heroLevel*10;
    }
    //---------------------------------------------------------------------------------------------------------
    // Upgrade the hero's skills by 5% every time they level up
    public static void heroSkillsUpgrade(Heroes hero){
        double heroStrength = hero.getStrength();
        double heroAgility = hero.getAgility();
        double heroDexterity = hero.getDexterity();
        hero.setStrength(heroStrength + (heroStrength * 0.05));
        hero.setAgility(heroAgility + (heroAgility * 0.05));
        hero.setDexterity(heroDexterity + (heroDexterity * 0.05));
    }
    //---------------------------------------------------------------------------------------------------------
    // Rules to reset Hero HP and MP after a battle
    public void recoverFromBattle(Heroes hero){
        double heroHP = hero.getHP();
        double heroMP = hero.getMP();
        hero.setHP(heroHP*1.1);
        hero.setMP(heroMP*1.1);
    }
    //---------------------------------------------------------------------------------------------------------
    // amount of gold hero gains after beating a monster
    public void goldGain(Heroes hero, Monsters monster){
        int monsterLevel = monster.getLevel();
        hero.setGold(monsterLevel*100);
    }
    //---------------------------------------------------------------------------------------------------------
    // Hero experience gain
    public void expGain(Heroes hero, Monsters monster){
        int monsterLevel = monster.getLevel();
        hero.setExperience(monsterLevel*2);
    }
    //---------------------------------------------------------------------------------------------------------
    // The monster's level is equal to the highest level of the heroes in the team
    public void determineMonsterLevel(ArrayList<Heroes> heroesList, Monsters monsters){
        int maxLevel = 0;
        for(int i = 0; i < heroesList.size(); i++){
            int heroLevel = heroesList.get(i).getLevel();
            if (heroLevel > maxLevel){
                maxLevel = heroLevel;
            }
        }

        if (maxLevel > 0){
            monsters.setLevel(maxLevel);
        }
    }

    //---------------------------------------------------------------------------------------------------------
    // gold gained by selling an item
    public int goldSellingItem(Heroes hero, Inventory item){
        int itemPrice = item.getPrice();
        return itemPrice/2;
    }

    //---------------------------------------------------------------------------------------------------------
    // Rules to set the total number of heroes in the game = monsters in the game
    public static int setNumHeroes(int numHeroes){
        boolean b = numHeroes >= 1 && numHeroes <= 3;
        if (b){
            return numHeroes;
        }
        return 0;
    }
    //---------------------------------------------------------------------------------------------------------
}

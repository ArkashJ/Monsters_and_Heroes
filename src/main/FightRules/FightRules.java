package main.FightRules;
import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;
import main.Inventory.Inventory;
import main.Items.Items;
import main.Items.Spells.Spells;
import main.Items.Weapons;

import java.util.ArrayList;

public class FightRules implements IFightRules {
    //---------------------------------------------------------------------------------------------------------
    // rules to find spell damage based on the spell the hero has in their inventory
    // Hero dexterity and spell base damage are used to calculate the spell damage
    public double spellDamage(Heroes hero, String spellName){
        // spell damage calculation
        Spells spell = (Spells) hero.getInventory().getItem(spellName);
        double spellBaseDamage = spell.getDamage();
        double heroDexterity = hero.getDexterity();
        return (spellBaseDamage + heroDexterity / 10000 * spellBaseDamage);
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

    public void updateHPAtLevelUP(Heroes hero){
        double heroHP = hero.getHP();
        hero.setHP(heroHP*1.1);
    }

    public void levelUp(Heroes hero){
        int heroLevel = hero.getLevel();
        hero.setLevel(heroLevel+1);
    }
    //---------------------------------------------------------------------------------------------------------
    // rules to find hero's attack damage if they have a weapon in their inventory
    public double attackDamage(Heroes hero){
        // attack damage calculation
        Weapons weapon = (Weapons) hero.getInventory().getItem("Weapon");
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
        int heroGold = hero.getGold();
        hero.setGold(heroGold + monsterLevel*100);
    }
    //---------------------------------------------------------------------------------------------------------
    // Hero experience gain
    public void expGain(Heroes hero, Monsters monster){
        int monsterLevel = monster.getLevel();
        int heroExp = hero.getExperience();
        hero.setExperience(heroExp + monsterLevel*2);
    }
    //---------------------------------------------------------------------------------------------------------
    // The monster's level is equal to the highest level of the heroes in the team
    public void determineMonsterLevel(ArrayList<Heroes> heroesList, Monsters monsters){
        int maxLevel = 0;
        int sumOfHP = 0;
        int numHeroes = heroesList.size();

        for (Heroes heroes : heroesList) {
            int heroLevel = heroes.getLevel();
            sumOfHP += heroes.getHP();
            if (heroLevel > maxLevel) {
                maxLevel = heroLevel;
            }
        }
        // Lower the level of you Hero, lower the level of the monsters
        if (maxLevel > 0) {
            // sum of HP of Heroes / 100 * number of heroes = probability, the higher the probability, the higher the level of monsters
            double probability = (((double) sumOfHP) / 100 * numHeroes);
            // calculate the monster's level as a proportion of maxLevel and probability
            int monsterLevel = (int) Math.round(maxLevel * probability);
            // Make sure monsterLevel is at least 1 and at most maxLevel
            monsterLevel = Math.max(1, Math.min(monsterLevel, maxLevel));

            if (monsterLevel > 1){
                monsterLevel = monsterLevel - 1;
            }

            monsters.setLevel(monsterLevel);
        }
    }

    //---------------------------------------------------------------------------------------------------------
//     gold gained by selling an item
    public int goldSellingItem(Heroes hero, String itemName){
        Items item = hero.getInventory().getItem(itemName);
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

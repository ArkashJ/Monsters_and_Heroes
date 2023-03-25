package main;
import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.IMonsters;
import main.Characters.Monsters.Monsters;
import main.Items.Armors;
import main.Items.Potions;
import main.Items.Spells.Spells;
import main.Items.Weapons;
import main.Positions.Positions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static main.LoadFile.readFile;

// Class that reads the txt files in the instructions folder, iterates over them and returns a list of arrays
public class fileReader {
    // Functions to call the readFile function and make Lists of arrays for heroes, monsters, spells, and items
    // ---------------------------------------------------------------------------------------------------------------
    public static List<String[]> getPaladinsList() {
        return readFile("src/Instructions/Paladins.txt");
    }

    public static List<String[]> getSorcerersList() {
        System.out
        return readFile("src/Instructions/Sorcerers.txt");
    }

    public static List<String[]> getWarriorsList() {
        return readFile("src/Instructions/Warriors.txt");
    }

    public static List<String[]> getDragonsList() {
        return readFile("src/Instructions/Dragons.txt");
    }

    public static List<String[]> getSpiritsList() {
        return readFile("src/Instructions/Spirits.txt");
    }

    public static List<String[]> getExoskeletonsList() {
        return readFile("src/Instructions/Exoskeletons.txt");
    }

    public static List<String[]> getFireSpellsList() {
        return readFile("src/Instructions/FireSpells.txt");
    }

    public static List<String[]> getIceSpellsList() {
        return readFile("src/Instructions/IceSpells.txt");
    }

    public static List<String[]> getLightningSpellsList() {
        return readFile("src/Instructions/LightningSpells.txt");
    }

    public static List<String[]> getPotionsList() {
        return readFile("src/Instructions/Potions.txt");
    }

    public static List<String[]> getArmorsList() {
        return readFile("src/Instructions/Armors.txt");
    }

    public static List<String[]> getWeaponsList() {
        return readFile("src/Instructions/Weapons.txt");
    }
    // ---------------------------------------------------------------------------------------------------------------

    // Function that loads and stores the heroes
    public static void storeHeroes(ArrayList<Heroes> paladins, ArrayList<Heroes> sorcerers, ArrayList<Heroes> warriors) {
        // Format of txt: Name/mana/strength/agility/dexterity/starting money/starting experience
        // Format of constructor:
        // Heroes(String name, double MP, double strength, double agility, double dexterity,
        //                  int gold, int level, double HP, Positions position)
        // Format of array: [0] = name, [1] = mana, [2] = strength, [3] = agility, [4] = dexterity, [5] = gold, [6] = level,
        // For 7, 8 we have HP and position. Position will be 0, 0 by default and HP will be 100*level
        paladins = loadHeroes(getPaladinsList());
        sorcerers = loadHeroes(getSorcerersList());
        warriors = loadHeroes(getWarriorsList());
    }

    public static ArrayList<Heroes> loadHeroes(List<String[]> list) {
        ArrayList<Heroes> HeroList = new ArrayList<>();
        // loop from index to 1 to skip the first line of the txt file
        for (String[] arr : list){
            Heroes hero = new Heroes(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                    Double.parseDouble(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6]),
                    Double.parseDouble(arr[6])*100, new Positions(0, 0));
            System.out.println(hero);
            HeroList.add(hero);
        }
        return HeroList;
    }
    // ---------------------------------------------------------------------------------------------------------------
    // Function that loads and stores the monsters
    public static void storeMonsters(ArrayList<Monsters> dragons, ArrayList<Monsters> spirits, ArrayList<Monsters> exoskeletons){
        // Format of txt: Name/level/damage/defense/dodge chance
        // Format of constructor:
        // Monsters(String name, int level, double baseDamage, double defenceValue, double dodgeAgility, double HP)
        // Format of array: [0] = name, [1] = level, [2] = damage, [3] = defense, [4] = dodge chance
        // 5 = HP. HP will be 100*level
        dragons = loadMonsters(getDragonsList());
        spirits = loadMonsters(getSpiritsList());
        exoskeletons = loadMonsters(getExoskeletonsList());
    }

    public static ArrayList<Monsters> loadMonsters(List<String[]> list) {
        ArrayList<Monsters> MonsterList = new ArrayList<>();
        for (String[] arr : list){
            Monsters monster = new Monsters(arr[0], Integer.parseInt(arr[1]), Double.parseDouble(arr[2]),
                    Double.parseDouble(arr[3]), Double.parseDouble(arr[4]), Double.parseDouble(arr[1])*100);
            System.out.println(monster);
            MonsterList.add(monster);
        }
        return MonsterList;
    }
    // ---------------------------------------------------------------------------------------------------------------
    // Function that loads and stores the spells
    public static void storeSpells(ArrayList<Spells> fireSpells, ArrayList<Spells> iceSpells, ArrayList<Spells> lightningSpells) {
        // Format of txt: Name/cost/required level/damage/mana cost
        // Format of constructor:
        // FireSpells(String name, int price, int level, double damage, int manaCost, String spellType, double extraDefenseReduction)
        // Format of array: [0] = name, [1] = cost, [2] = required level, [3] = damage, [4] = mana cost
        // 5 = spell type, 6 = extra defense reduction

        fireSpells = loadSpells(getFireSpellsList(), "FireSpell");
        iceSpells = loadSpells(getIceSpellsList(), "IceSpell");
        lightningSpells = loadSpells(getLightningSpellsList(), "LightningSpell");
    }

    public static ArrayList<Spells> loadSpells(List<String[]> list, String spellType) {
        ArrayList<Spells> SpellList = new ArrayList<>();
        for (String[] arr : list){
            Spells spell = new Spells(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
                    Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), spellType);
            System.out.println(spell);
            SpellList.add(spell);
        }
        return SpellList;
    }
    // ---------------------------------------------------------------------------------------------------------------
    // Function that loads and stores the Armor, Weapons and Potions
    public static void storeArmors(ArrayList<Armors> armors){
        // Format of txt: Name/cost/required level/damage reduction
        // Format of constructor:
        // Armors(String name, int price, int level, double damageReduction)
        // Format of array: [0] = name, [1] = cost, [2] = required level, [3] = damage reduction
        List<String[]> armorsList = getArmorsList();
        armors = new ArrayList<>();

        for (String [] arr : armorsList){
            Armors armor = new Armors(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
            System.out.println(armor);
            armors.add(armor);
        }
    }
    // ---------------------------------------------------------------------------------------------------------------
    public static void storePotions(ArrayList<Potions> potions){
        // Format of txt: Name/cost/required level/attribute increase/attribute affected
        // Format of constructor:
        // Potions(String name, int price, int level, int effectAmount)
        // Format of array: [0] = name, [1] = cost, [2] = required level, [3] = effect amount
        List<String[]> potionsList = getPotionsList();
        potions = new ArrayList<>();

        for (String [] arr : potionsList){
            Potions potion = new Potions(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
            System.out.println(potion);
            potions.add(potion);
        }
    }
    // ---------------------------------------------------------------------------------------------------------------
    public static void storeWeapons(ArrayList<Weapons> weapons){
        // Format of txt: Name/cost/required level/attribute increase/attribute affected
        // Format of constructor:
        // Weapons(String name, int price, int level, double damage, int hands)
        // Format of array: [0] = name, [1] = cost, [2] = required level, [3] = effect amount
        List<String[]> weaponsList = getWeaponsList();
        weapons = new ArrayList<>();

        for (String [] arr : weaponsList){
            Weapons weapon = new Weapons(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]));
            System.out.println(weapon);
            weapons.add(weapon);
        }
    }
    // ---------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        // Store all the heroes, monsters, spells, armors, potions and weapons
        ArrayList<Heroes> paladins = new ArrayList<>();
        ArrayList<Heroes> sorcerers = new ArrayList<>();
        ArrayList<Heroes> warriors = new ArrayList<>();
        storeHeroes(paladins, sorcerers, warriors);
        ArrayList<Monsters> dragons = new ArrayList<>();
        ArrayList<Monsters> spirits = new ArrayList<>();
        ArrayList<Monsters> exoskeletons = new ArrayList<>();
        storeMonsters(dragons, spirits, exoskeletons);
        ArrayList<Weapons> weapons = new ArrayList<>();
        storeWeapons(weapons);
        ArrayList<Armors> armors = new ArrayList<>();
        storeArmors(armors);
        ArrayList<Potions> potions = new ArrayList<>();
        storePotions(potions);
        ArrayList<Spells> fireSpells = new ArrayList<>();
        ArrayList<Spells> iceSpells = new ArrayList<>();
        ArrayList<Spells> lightningSpells = new ArrayList<>();
        storeSpells(fireSpells, iceSpells, lightningSpells);
    }
}

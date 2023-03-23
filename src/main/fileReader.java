package main;
import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.IMonsters;
import main.Characters.Monsters.Monsters;
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
    public static void storeHeroes(){
        // Format of txt: Name/mana/strength/agility/dexterity/starting money/starting experience
        // Format of constructor:
        // Heroes(String name, double MP, double strength, double agility, double dexterity,
        //                  int gold, int level, double HP, Positions position)
        // Format of array: [0] = name, [1] = mana, [2] = strength, [3] = agility, [4] = dexterity, [5] = gold, [6] = level,
        // For 7, 8 we have HP and position. Position will be 0, 0 by default and HP will be 100*level
        ArrayList<Heroes> paladins = loadHeroes(getPaladinsList());
        ArrayList<Heroes> sorcerers = loadHeroes(getSorcerersList());
        ArrayList<Heroes> warriors = loadHeroes(getWarriorsList());
    }

    public static ArrayList<Heroes> loadHeroes(List<String[]> list) {
        ArrayList<Heroes> HeroList = new ArrayList<>();
        for (String[] arr : list){
            Heroes hero = new Heroes(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Double.parseDouble(arr[3]),
                    Double.parseDouble(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6]),
                    Double.parseDouble(arr[6])*100, new Positions(0, 0));
            System.out.println(hero);
            HeroList.add(hero);
        }
        return HeroList;
    }
    // ---------------------------------------------------------------------------------------------------------------
    public static void storeMonsters(){
        // Format of txt: Name/level/damage/defense/dodge chance
        // Format of constructor:
        // Monsters(String name, int level, double baseDamage, double defenceValue, double dodgeAgility, double HP)
        // Format of array: [0] = name, [1] = level, [2] = damage, [3] = defense, [4] = dodge chance
        // 5 = HP. HP will be 100*level
        ArrayList<Monsters> dragons = loadMonsters(getDragonsList());
        ArrayList<Monsters> spirits = loadMonsters(getSpiritsList());
        ArrayList<Monsters> exoskeletons = loadMonsters(getExoskeletonsList());
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
}

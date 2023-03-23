package main;
import main.Characters.Heroes.Heroes;
import main.Positions.Positions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    // The readFile function returns a list containing the array of strings read from the txt files
    public static List<String[]> readFile(String fileName){
        List<Object> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null){
                list.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String[]> myList = new ArrayList<String[]>(); // list of arrays

        for (Object o : list){
            String[] arr = o.toString().split("\\s+");
            myList.add(arr);
        }

        for (String[] arr : myList){
            System.out.println(Arrays.toString(arr));
        }

        return myList;
    }
    // ---------------------------------------------------------------------------------------------------------------
    //    // Main function to test whether the files have been read or not
    //    public static void main(String[] args) {
    //        makeLists();
    //    }
    // ---------------------------------------------------------------------------------------------------------------
}

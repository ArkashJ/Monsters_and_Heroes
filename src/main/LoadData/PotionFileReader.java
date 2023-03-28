package main.LoadData;



import main.Characters.Monsters.Monsters;
import main.Items.Potions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PotionFileReader implements Loadable<Potions> {

    @Override
    public List<Potions> loadFromFile(String filePath) {
        List<Potions> potionsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip the first line (header line)
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+|\\t");
                Potions potion = new Potions(
                        data[0],
                        Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3]),
                        data[4]
                );
                potionsList.add(potion);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return potionsList;
    }

    public static void main(String[] args) {
        PotionFileReader potionFileReader = new PotionFileReader();
        List<Potions> potions = potionFileReader.loadFromFile("src/Instructions/Potions.txt");

//        List<Heroes> Paladins = heroFileReader.loadFromFile("src/Instructions/Paladins.txt");
//        List<Heroes> Sorcerers = heroFileReader.loadFromFile("src/Instructions/Sorcerers.txt");
//        List<Heroes> Warriors = heroFileReader.loadFromFile("src/Instructions/Warriors.txt");
        // Similarly, create instances of the other file readers and call their loadFromFile methods with the appropriate file paths

        for (Potions potion : potions) {
            potion.printStats();
        }
        System.out.println("--------------------");

    }

}

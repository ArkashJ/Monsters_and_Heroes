package main.LoadData;



import main.Characters.Monsters.Monsters;
import main.Items.Armors;
import main.Items.Potions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArmorFileReader implements Loadable<Armors> {

    @Override
    public List<Armors> loadFromFile(String filePath) {
        List<Armors> armorsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip the first line (header line)
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+|\\t");
                Armors armor = new Armors(
                        data[0],
                        Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]),
                        Double.parseDouble(data[3])
                );
                armorsList.add(armor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return armorsList;
    }

//    public static void main(String[] args) {
//        ArmorFileReader armorFileReader = new ArmorFileReader();
//        List<Armors> armors = armorFileReader.loadFromFile("src/Instructions/Armory.txt");
//        for (Armors armor : armors) {
//            armor.printStats();
//        }
//        System.out.println("--------------------");
//    }

}

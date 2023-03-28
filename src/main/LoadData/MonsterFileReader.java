package main.LoadData;



import main.Characters.Monsters.Monsters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MonsterFileReader implements Loadable<Monsters> {

    @Override
    public List<Monsters> loadFromFile(String filePath) {
        List<Monsters> monstersList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip the first line (header line)
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+|\\t");
                Monsters monster = new Monsters(
                        data[0],
                        Integer.parseInt(data[1]),
                        Double.parseDouble(data[2]),
                        Double.parseDouble(data[3]),
                        Double.parseDouble(data[4]),
                        100 * Integer.parseInt(data[4])
                );
                monstersList.add(monster);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return monstersList;
    }

    public static void main(String[] args) {
        MonsterFileReader MonsterFileReader = new MonsterFileReader();
        List<Monsters> Exoskeletons = MonsterFileReader.loadFromFile("src/Instructions/Exoskeletons.txt");
        List<Monsters> Spirits = MonsterFileReader.loadFromFile("src/Instructions/Spirits.txt");
        List<Monsters> Dragons = MonsterFileReader.loadFromFile("src/Instructions/Dragons.txt");

//        List<Heroes> Paladins = heroFileReader.loadFromFile("src/Instructions/Paladins.txt");
//        List<Heroes> Sorcerers = heroFileReader.loadFromFile("src/Instructions/Sorcerers.txt");
//        List<Heroes> Warriors = heroFileReader.loadFromFile("src/Instructions/Warriors.txt");
        // Similarly, create instances of the other file readers and call their loadFromFile methods with the appropriate file paths

        for (Monsters monster : Exoskeletons) {
            monster.printStats();
        }
        System.out.println("--------------------");

        for (Monsters monster : Spirits) {
            monster.printStats();
        }
        System.out.println("--------------------");

        for (Monsters monster : Dragons) {
            monster.printStats();
        }
        System.out.println("--------------------");

    }

}
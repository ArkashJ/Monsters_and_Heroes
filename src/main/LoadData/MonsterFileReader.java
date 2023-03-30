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
                // Monsters(String name, int level, double baseDamage, double defenceValue, double dodgeAgility, double HP)
                Monsters monster = new Monsters(
                        data[0],
                        Integer.parseInt(data[1]),
                        Double.parseDouble(data[2]),
                        Double.parseDouble(data[3]),
                        Double.parseDouble(data[4]),
                        100 * Integer.parseInt(data[1])
                );
                monstersList.add(monster);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return monstersList;
    }

}

package main.LoadData;



import main.Characters.Monsters.Monsters;
import main.Items.Armors;
import main.Items.Potions;
import main.Items.Weapons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeaponFileReader implements Loadable<Weapons> {

    @Override
    public List<Weapons> loadFromFile(String filePath) {
        List<Weapons> weaponsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip the first line (header line)
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+|\\t");
                Weapons weapons = new Weapons(
                        data[0],
                        Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]),
                        Double.parseDouble(data[3]),
                        Integer.parseInt(data[4])
                );
                weaponsList.add(weapons);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weaponsList;
    }

}

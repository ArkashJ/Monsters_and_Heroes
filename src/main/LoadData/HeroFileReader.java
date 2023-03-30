package main.LoadData;

import main.LoadData.*;
import main.Characters.Heroes.Heroes;
import main.Inventory.Inventory;
import main.Positions.Positions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HeroFileReader implements Loadable<Heroes> {

    @Override
    public List<Heroes> loadFromFile(String filePath) {
        List<Heroes> heroesList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip the first line (header line)
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+|\\t");
                Heroes hero = new Heroes(
                        data[0],
                        Double.parseDouble(data[1]),
                        Double.parseDouble(data[2]),
                        Double.parseDouble(data[3]),
                        Double.parseDouble(data[4]),
                        Integer.parseInt(data[5]),
                        Integer.parseInt(data[6]),
                        100 * Integer.parseInt(data[6]),
                        new Positions(0, 0),
                        new Inventory()
                );
                heroesList.add(hero);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return heroesList;
    }

}

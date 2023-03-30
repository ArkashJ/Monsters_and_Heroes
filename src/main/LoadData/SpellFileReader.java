package main.LoadData;

import main.Characters.Monsters.Monsters;
import main.Items.Armors;
import main.Items.Potions;
import main.Items.Spells.Spells;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpellFileReader implements Loadable<Spells> {

    @Override
    public List<Spells> loadFromFile(String filePath) {
        List<Spells> spellsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip the first line (header line)
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+|\\t");
                Spells spell = new Spells(
                        data[0],
                        Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]),
                        Double.parseDouble(data[3]),
                        Integer.parseInt(data[4])
                );
                spellsList.add(spell);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return spellsList;
    }


}

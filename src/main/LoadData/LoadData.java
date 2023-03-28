package main.LoadData;

import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;
import main.Items.Armors;
import main.Items.Potions;
import main.Items.Spells.Spells;
import main.Items.Weapons;

import java.util.List;

public class LoadData {
    public static void main(String[] args) {
        SpellFileReader spellFileReader = new SpellFileReader();
        List<Spells> fireSpells = spellFileReader.loadFromFile("src/Instructions/FireSpells.txt");
        List<Spells> iceSpells = spellFileReader.loadFromFile("src/Instructions/IceSpells.txt");
        List<Spells> lightningSpells = spellFileReader.loadFromFile("src/Instructions/LightningSpells.txt");

        for (Spells spell : fireSpells) {
            spell.printStats();
        }
        System.out.println("--------------------");

        for (Spells spell : iceSpells) {
            spell.printStats();
        }
        System.out.println("--------------------");

        for (Spells spell : lightningSpells) {
            spell.printStats();
        }
        System.out.println("--------------------");
        //--------------------------------------------------------------------------------

        ArmorFileReader armorFileReader = new ArmorFileReader();
        List<Armors> armors = armorFileReader.loadFromFile("src/Instructions/Armory.txt");
        for (Armors armor : armors) {
            armor.printStats();
        }
        System.out.println("--------------------");
        //--------------------------------------------------------------------------------
        HeroFileReader heroFileReader = new HeroFileReader();
        List<Heroes> Paladins = heroFileReader.loadFromFile("src/Instructions/Paladins.txt");
        List<Heroes> Sorcerers = heroFileReader.loadFromFile("src/Instructions/Sorcerers.txt");
        List<Heroes> Warriors = heroFileReader.loadFromFile("src/Instructions/Warriors.txt");

        for (Heroes hero : Paladins) {
            hero.printStats();
        }
        System.out.println("--------------------");

        for (Heroes hero : Sorcerers) {
            hero.printStats();
        }
        System.out.println("--------------------");

        for (Heroes hero : Warriors) {
            hero.printStats();
        }
        System.out.println("--------------------");
        //--------------------------------------------------------------------------------
        MonsterFileReader MonsterFileReader = new MonsterFileReader();
        List<Monsters> Exoskeletons = MonsterFileReader.loadFromFile("src/Instructions/Exoskeletons.txt");
        List<Monsters> Spirits = MonsterFileReader.loadFromFile("src/Instructions/Spirits.txt");
        List<Monsters> Dragons = MonsterFileReader.loadFromFile("src/Instructions/Dragons.txt");

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
        //--------------------------------------------------------------------------------
        WeaponFileReader weaponFileReader = new WeaponFileReader();
        List<Weapons> weapons = weaponFileReader.loadFromFile("src/Instructions/Weaponry.txt");

        for (Weapons weapon : weapons) {
            weapon.printStats();
        }
        System.out.println("--------------------");
        //--------------------------------------------------------------------------------
        PotionFileReader potionFileReader = new PotionFileReader();
        List<Potions> potions = potionFileReader.loadFromFile("src/Instructions/Potions.txt");

        for (Potions potion : potions) {
            potion.printStats();
        }
        System.out.println("--------------------");
    }
}

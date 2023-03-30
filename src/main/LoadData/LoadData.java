package main.LoadData;

import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;
import main.Items.Armors;
import main.Items.Potions;
import main.Items.Spells.Spells;
import main.Items.Weapons;

import java.util.List;

public class LoadData {
    private List<Spells> fireSpells;
    private List<Spells> iceSpells;
    private List<Spells> lightningSpells;
    private List<Armors> armors;
    private List<Heroes> paladins;
    private List<Heroes> sorcerers;
    private List<Heroes> warriors;
    private List<Monsters> Exoskeletons;
    private List<Monsters> Spirits;
    private List<Monsters> Dragons;
    private List<Potions> Potions;
    private List<Weapons> weapons;
    // --------------------------------------------------------------------------------------------------

    public LoadData() {
        SpellFileReader spellFileReader = new SpellFileReader();
        fireSpells = spellFileReader.loadFromFile("src/Instructions/FireSpells.txt");
        iceSpells = spellFileReader.loadFromFile("src/Instructions/IceSpells.txt");
        lightningSpells = spellFileReader.loadFromFile("src/Instructions/LightningSpells.txt");
        // --------------------------------------------------------------------------------------------------
        ArmorFileReader armorFileReader = new ArmorFileReader();
        armors = armorFileReader.loadFromFile("src/Instructions/Armory.txt");
        // --------------------------------------------------------------------------------------------------
        HeroFileReader heroFileReader = new HeroFileReader();
        paladins = heroFileReader.loadFromFile("src/Instructions/Paladins.txt");
        sorcerers = heroFileReader.loadFromFile("src/Instructions/Sorcerers.txt");
        warriors = heroFileReader.loadFromFile("src/Instructions/Warriors.txt");
        // --------------------------------------------------------------------------------------------------
        MonsterFileReader monsterFileReader = new MonsterFileReader();
        Exoskeletons = monsterFileReader.loadFromFile("src/Instructions/Exoskeletons.txt");
        Spirits = monsterFileReader.loadFromFile("src/Instructions/Spirits.txt");
        Dragons = monsterFileReader.loadFromFile("src/Instructions/Dragons.txt");
        // --------------------------------------------------------------------------------------------------
        PotionFileReader potionFileReader = new PotionFileReader();
        Potions = potionFileReader.loadFromFile("src/Instructions/Potions.txt");
        // --------------------------------------------------------------------------------------------------
        WeaponFileReader weaponFileReader = new WeaponFileReader();
        weapons = weaponFileReader.loadFromFile("src/Instructions/Weaponry.txt");
    }

    public List<Spells> getFireSpells() {
        for (Spells spell : fireSpells) {
            spell.printStats();
        }
        return fireSpells;
    }

    public List<Spells> getIceSpells() {
        for (Spells spell : iceSpells) {
            spell.printStats();
        }
        return iceSpells;
    }

    public List<Spells> getLightningSpells() {
        for (Spells spell : lightningSpells) {
            spell.printStats();
        }
        return lightningSpells;
    }

    public List<Armors> getArmors() {
        for (Armors armor : armors) {
            armor.printStats();
        }
        return armors;
    }

    public List<Heroes> getPaladins() {
        for (Heroes hero : paladins) {
            hero.printStats();
        }
        return paladins;
    }

    public List<Heroes> getSorcerers() {
        for (Heroes hero : sorcerers) {
            hero.printStats();
        }
        return sorcerers;
    }

    public List<Heroes> getWarriors() {
        for (Heroes hero : warriors) {
            hero.printStats();
        }
        return warriors;
    }

    public List<Monsters> getExoskeletons() {
        for (Monsters monster : Exoskeletons) {
            monster.printStats();
        }
        return Exoskeletons;
    }

    public List<Monsters> getSpirits() {
        for (Monsters monster : Spirits) {
            monster.printStats();
        }
        return Spirits;
    }

    public List<Monsters> getDragons() {
        for (Monsters monster : Dragons) {
            monster.printStats();
        }
        return Dragons;
    }

    public List<Potions> getPotions() {
        for (Potions potion : Potions) {
            potion.printStats();
        }
        return Potions;
    }

    public List<Weapons> getWeapons() {
        for (Weapons weapon : weapons) {
            weapon.printStats();
        }
        return weapons;
    }

//    public static void main(String[] args) {
//        SpellFileReader spellFileReader = new SpellFileReader();
//        List<Spells> fireSpells = spellFileReader.loadFromFile("src/Instructions/FireSpells.txt");
//        List<Spells> iceSpells = spellFileReader.loadFromFile("src/Instructions/IceSpells.txt");
//        List<Spells> lightningSpells = spellFileReader.loadFromFile("src/Instructions/LightningSpells.txt");
//
//        for (Spells spell : fireSpells) {
//            spell.printStats();
//        }
//        System.out.println("--------------------");
//
//        for (Spells spell : iceSpells) {
//            spell.printStats();
//        }
//        System.out.println("--------------------");
//
//        for (Spells spell : lightningSpells) {
//            spell.printStats();
//        }
//        System.out.println("--------------------");
//        //--------------------------------------------------------------------------------
//
//        ArmorFileReader armorFileReader = new ArmorFileReader();
//        List<Armors> armors = armorFileReader.loadFromFile("src/Instructions/Armory.txt");
//        for (Armors armor : armors) {
//            armor.printStats();
//        }
//        System.out.println("--------------------");
//        //--------------------------------------------------------------------------------
//        HeroFileReader heroFileReader = new HeroFileReader();
//        List<Heroes> Paladins = heroFileReader.loadFromFile("src/Instructions/Paladins.txt");
//        List<Heroes> Sorcerers = heroFileReader.loadFromFile("src/Instructions/Sorcerers.txt");
//        List<Heroes> Warriors = heroFileReader.loadFromFile("src/Instructions/Warriors.txt");
//
//        for (Heroes hero : Paladins) {
//            hero.printStats();
//        }
//        System.out.println("--------------------");
//
//        for (Heroes hero : Sorcerers) {
//            hero.printStats();
//        }
//        System.out.println("--------------------");
//
//        for (Heroes hero : Warriors) {
//            hero.printStats();
//        }
//        System.out.println("--------------------");
//        //--------------------------------------------------------------------------------
//        MonsterFileReader MonsterFileReader = new MonsterFileReader();
//        List<Monsters> Exoskeletons = MonsterFileReader.loadFromFile("src/Instructions/Exoskeletons.txt");
//        List<Monsters> Spirits = MonsterFileReader.loadFromFile("src/Instructions/Spirits.txt");
//        List<Monsters> Dragons = MonsterFileReader.loadFromFile("src/Instructions/Dragons.txt");
//
//        for (Monsters monster : Exoskeletons) {
//            monster.printStats();
//        }
//        System.out.println("--------------------");
//
//        for (Monsters monster : Spirits) {
//            monster.printStats();
//        }
//        System.out.println("--------------------");
//
//        for (Monsters monster : Dragons) {
//            monster.printStats();
//        }
//        System.out.println("--------------------");
//        //--------------------------------------------------------------------------------
//        WeaponFileReader weaponFileReader = new WeaponFileReader();
//        List<Weapons> weapons = weaponFileReader.loadFromFile("src/Instructions/Weaponry.txt");
//
//        for (Weapons weapon : weapons) {
//            weapon.printStats();
//        }
//        System.out.println("--------------------");
//        //--------------------------------------------------------------------------------
//        PotionFileReader potionFileReader = new PotionFileReader();
//        List<Potions> potions = potionFileReader.loadFromFile("src/Instructions/Potions.txt");
//
//        for (Potions potion : potions) {
//            potion.printStats();
//        }
//        System.out.println("--------------------");
//    }
}

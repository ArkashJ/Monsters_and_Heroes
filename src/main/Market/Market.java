package main.Market;

import main.Items.Armors;
import main.Items.Items;
import main.Items.Potions;
import main.Items.Spells.Spells;
import main.Items.Weapons;

import java.lang.reflect.Array;
import java.util.ArrayList;
import main.fileReader;
import static main.fileReader.*;

public class Market {
    // The market initializes a list of items: 3 Armors of each type, 3 weapons of each type and 5 spells and 5 potions per type
    // The market has a list of items that are available for sale
    // The market has a list of items that are sold out

    private ArrayList<Items> itemsForSale = new ArrayList<>();
    private ArrayList<Items> soldOutItems = new ArrayList<>();

    public Market(){
        // Initialize arraylist of spells and add them to the items for sale list
//        fileReader fileReader = new fileReader();
//        fileReader.

        ArrayList<Spells> fireSpells = new ArrayList<>();
        ArrayList<Spells> iceSpells = new ArrayList<>();
        ArrayList<Spells> lightningSpells = new ArrayList<>();
        storeSpells(fireSpells, iceSpells, lightningSpells);
        itemsForSale.addAll(fireSpells);
        itemsForSale.addAll(iceSpells);
        itemsForSale.addAll(lightningSpells);

        // Initialize arraylist of potions and add them to the items for sale list
        ArrayList<Potions> potions = new ArrayList<>();
        storePotions(potions);
        itemsForSale.addAll(potions);

        // Initialize arraylist of weapons and add them to the items for sale list
        ArrayList<Weapons> weapons = new ArrayList<>();
        storeWeapons(weapons);
        itemsForSale.addAll(weapons);

        // Initialize arraylist of armors and add them to the items for sale list
        ArrayList<Armors> armors = new ArrayList<>();
        storeArmors(armors);
        itemsForSale.addAll(armors);
    }

    public ArrayList<Items> getItemsForSale() {
        return itemsForSale;
    }

    public static void main(String[] args){
        Market market = new Market();
        System.out.println(market.getItemsForSale());
    }


    public void buyItem(){
        // buyItems from the market and store them in the inventory
    }
    public void sellItem(){
        // sellItems from the inventory and store them in the market
    }

    public void showItems(){
        // show the items that are available for sale
    }

    public void showSoldOutItems(){
        // show the items that are sold out
    }

    public void showInventory(){
        // show the items that are in the inventory
    }

    public void showMarket(){
        // show the items that are in the market

    }
}

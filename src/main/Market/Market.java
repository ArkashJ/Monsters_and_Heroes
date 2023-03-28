package main.Market;
import main.Items.Armors;
import main.Items.Items;
import main.Characters.Heroes.Heroes;
import main.Items.Potions;
import main.Items.Spells.Spells;
import main.Items.Weapons;
import main.LoadData.LoadData;
import main.Teams.TeamHeroes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.Colors.colors.colorText;

// The market initializes a list of items: 3 Armors of each type, 3 weapons of each type and 5 spells and 5 potions per type
// It has a list of items that are for sale and sold out
// When you want to buy an item, the item is removed from the list of items for sale and added to the list of sold out items
// When you want to sell an item, the item is removed from the list of sold out items and added to the list of items for sale

public class Market {
    private ArrayList<Items> itemsForSale = new ArrayList<>();
    private ArrayList<Items> soldOutItems = new ArrayList<>();
    LoadData loadData = new LoadData();
    Scanner scanner = new Scanner(System.in);

    // --------------------------------------------------------------------------------------------------
    public Market(){
// initialize the items for sale
        List<Armors> armors = loadData.getArmors();
        List<Potions> Potions = loadData.getPotions();
        List<Weapons> weapons = loadData.getWeapons();
        List<Spells> fireSpells = loadData.getFireSpells();
        List<Spells> iceSpells = loadData.getIceSpells();
        List<Spells> lightningSpells = loadData.getLightningSpells();

        for (int i = 0; i < 3; i++) {
            itemsForSale.addAll(armors);
            itemsForSale.addAll(Potions);
            itemsForSale.addAll(weapons);
            itemsForSale.addAll(fireSpells);
            itemsForSale.addAll(iceSpells);
            itemsForSale.addAll(lightningSpells);
        }
    }
    // --------------------------------------------------------------------------------------------------
    public ArrayList<Items> getItemsForSale() {
        return itemsForSale;
    }
    // --------------------------------------------------------------------------------------------------
    public void buyItem(Heroes hero, Items item){
        // buyItems from the market and store them in the inventory
        int gold = hero.getGold();
        int level = hero.getLevel();
        int price = item.getPrice();

        // To implement: Add item to the hero's inventory
        if (gold >= price && level >= item.getLevel()){
            itemsForSale.remove(item);
            soldOutItems.add(item);
            hero.setGold(gold - price);
            hero.getInventory().addItem(item);
            System.out.println("You bought " + item.getName() + " for " + price + " gold");
        } else if (gold < price){
            System.out.println(colorText("You don't have enough gold to buy this item", "red"));
        } else if (level < item.getLevel()){
            System.out.println(colorText("You don't have enough level to buy this item", "red"));
        }
    }
    // --------------------------------------------------------------------------------------------------
    public void sellItem(Heroes hero, Items item){
        // sellItems from the inventory and store them in the market
        // To implement: Remove item from the hero's inventory
        int price = item.getPrice();
        hero.setGold(hero.getGold() + price/2);
        hero.getInventory().removeItem(item.getName());
        itemsForSale.add(item);
        System.out.println(colorText("$$$Cha-Ching:You sold " + item.getName() + " for " + price/2 + " gold", "yellow"));
        System.out.println("Your inventory is: " );
        hero.getInventory().printInventory();
    }
    // --------------------------------------------------------------------------------------------------
    public void showItems(){
        // show the items that are available for sale
        System.out.println("These are the items for sale");
        for (Items item : itemsForSale){
            System.out.println(colorText( " | " + item.getName(), "blue" )+ colorText( " | " + item.getPrice() + " gold", "yellow") + colorText( " | " + item.getLevel() + " level", "green"));
        }
    }
    // --------------------------------------------------------------------------------------------------
    public void showSoldOutItems(){
        // show the items that are sold out
        System.out.println("These are the items that are sold out");
        for (Items item : soldOutItems){
            System.out.println(colorText( " | " + item.getName() + " | " + item.getPrice() + " gold | " + item.getLevel() + " level", "gray"));
        }
    }
    // --------------------------------------------------------------------------------------------------

    public boolean enterMarket(TeamHeroes teamHeroes){
        // enter the market and buy or sell items
        System.out.println(colorText("Welcome to the market", "black"));
        System.out.println(colorText("You can buy or sell items here", "black"));
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------- BUY/SELL/EXIT -----------------------------------------------");
        System.out.println("To buy items, enter 'buy' | To sell items, enter 'sell' | To exit the market, enter 'exit'");
        String input = scanner.nextLine();
        // ------------------------------------------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------
        while (!input.equalsIgnoreCase("buy") && !input.equalsIgnoreCase("sell") && !input.equalsIgnoreCase("exit")){
            System.out.println("Please enter a valid input");
            input = scanner.nextLine();
            System.out.println("----------------------------------- BUY/SELL/EXIT --------------------------------------------");
        }

        // ------------------------------------------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------
        while (!input.equalsIgnoreCase("exit")) {
            // ------------------------------------------------------------------------------------------------------
            // ------------------------------------------------------------------------------------------------------
            System.out.println("Select Hero:");
            teamHeroes.printHeroes();
            String heroName = scanner.nextLine();

            while (!teamHeroes.checkHeroes(heroName)){
                System.out.println("Please enter a valid hero name");
                heroName = scanner.nextLine();
                System.out.println("-------------------------------- HERO NAME ----------------------------------------------------");

            }

            Heroes hero = teamHeroes.getHero(heroName);
            System.out.println("You chose:");
            hero.printStats();
            System.out.println("");
            System.out.println("");
            // ------------------------------------------------------------------------------------------------------

            if (input.equalsIgnoreCase("buy")){
                System.out.println("----------------------------------- BUY ITEMS ----------------------------------------------------");
                showItems();
                boolean itemAvailable = false;
                System.out.println("Enter the name of the item you want to buy");
                String itemName = scanner.nextLine();
                for (Items item : itemsForSale){
                    if (item.getName().equals(itemName)){
                        buyItem(hero, item);
                        itemAvailable = true;
                    }
                }
                if (!itemAvailable){
                    System.out.println(colorText("This item is not available for sale", "red"));
                    System.out.println("");
                }
                System.out.println("Want to buy another item? Enter 'buy' | To exit the market, enter 'exit'");
                input = scanner.nextLine();
                while (!input.equalsIgnoreCase("buy") && !input.equalsIgnoreCase("exit")){
                    System.out.println("Please enter a valid input");
                    input = scanner.nextLine();
                }
                if (input.equalsIgnoreCase("exit")) {
                    input = "exit";
                }
            } else if (input.equalsIgnoreCase("sell")){
                showSoldOutItems();
                System.out.println("Enter the name of the item you want to sell");
                String itemName = scanner.nextLine();
                boolean itemAvailable = false;
                for (Items item : soldOutItems){
                    if (item.getName().equals(itemName)){
                        sellItem(hero, item);
                        itemAvailable = true;
                    }
                }
                if (!itemAvailable){
                    System.out.println(colorText("This item is not available for sale", "red"));
                    System.out.println("");
                }
                while (!input.equalsIgnoreCase("buy") && !input.equalsIgnoreCase("exit")){
                    System.out.println("Please enter a valid input");
                    input = scanner.nextLine();
                }
                if (input.equalsIgnoreCase("exit")) {
                    input = "exit";
                }
            }
        }

        System.out.println("Exiting the Market!!!");
        return false;
    }
}

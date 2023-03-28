package main.Inventory;
import java.util.HashMap;

import main.Items.Armors;
import main.Items.Items;
import main.Inventory.IInventory;
import main.Items.Spells.Spells;
import main.Items.Weapons;

public class Inventory implements IInventory{
    // The inventory will be a HashMap with no maximum length
    // with the key being the item name and the value being the item
    private HashMap<String, Items> inventory;
    private int size;

    // ----------------------------------------  Constructors  ----------------------------------------
    public Inventory() {
        this.inventory = new HashMap<>();
        this.size = 0;
    }

    // ----------------------------------------  Methods  ----------------------------------------

    // Method to add an item to the inventory
    public void addItem(Items item) {
        inventory.put(item.getName(), item);
        size++;
    }
    // -------------------------------------------------------------------------------------------
    // Method to remove an item from the inventory
    public Items removeItem(String itemName) {
        Items item = inventory.remove(itemName);
        if (item != null) {
            size--;
        }
        return item;
    }
    // -------------------------------------------------------------------------------------------
    // Method to get an item from the inventory
    public Items getItem(String itemName) {
        Items item = inventory.get(itemName);
        if (item instanceof Spells) {
            return (Spells) item;
        }

        if (item instanceof Weapons) {
            return (Weapons) item;
        }

        if (item instanceof Armors) {
            return (Armors) item;
        }
        // Add similar conditions for other subclasses if necessary
        if (item != null) {
            size--;
        }

        return item;
    }

    public int getPrice(String itemName) {
        return inventory.get(itemName).getPrice();
    }
    // -------------------------------------------------------------------------------------------
    // Method to get the current inventory size
    public int getSize() {
        return size;
    }
    // -------------------------------------------------------------------------------------------
    // Method to check if the inventory is empty
    public boolean isEmpty() {
        return size == 0;
    }
    // -------------------------------------------------------------------------------------------
    // printing out the inventory
    public void printInventory() {
        for (String key : inventory.keySet()) {
            System.out.println(key);
        }
    }
    // -------------------------------------------------------------------------------------------
}

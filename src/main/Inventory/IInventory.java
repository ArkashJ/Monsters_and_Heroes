package main.Inventory;

import main.Items.Items;

public interface IInventory {
    void addItem(Items item);
    Items removeItem(String itemName);
    Items getItem(String itemName);
    int getSize();
    boolean isEmpty();
    void printInventory();

    boolean contains(Items item);
}

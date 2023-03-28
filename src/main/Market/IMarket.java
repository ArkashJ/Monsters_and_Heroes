package main.Market;

import main.Characters.Heroes.Heroes;
import main.Items.Items;
import main.Teams.TeamHeroes;

import java.util.ArrayList;

public interface IMarket {
    ArrayList<Items> getItemsForSale();
    void buyItem(Heroes hero, Items item);
    void sellItem(Heroes hero, Items item);
    void showItems();
    void showSoldOutItems();
    boolean enterMarket(TeamHeroes teamHeroes);
}

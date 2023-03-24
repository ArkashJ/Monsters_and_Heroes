package main.Items;

public class Items {
    // An item has a name, price and level
    // ----------------------------------------  Variables  ----------------------------------------
    protected String name;
    protected int price;
    protected int level;
    // ----------------------------------------  Getters  ----------------------------------------
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getLevel() {
        return level;
    }
    // ----------------------------------------  Setters  ----------------------------------------
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    // ----------------------------------------  Constructors  ----------------------------------------
    public Items(String name, int price, int level) {
        this.name = name;
        this.price = price;
        this.level = level;
    }
}

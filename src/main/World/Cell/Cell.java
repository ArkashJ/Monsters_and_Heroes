package main.World.Cell;
import main.Characters.Heroes.Heroes;
import main.Market.Market;
import main.Positions.Positions;
import static main.Colors.colors.colorText;
import java.util.Random;
import main.Teams.TeamHeroes;
import main.World.Cell.ICell;

/*
The world of the game is represented by a fixed, square grid of spaces. The grid contains three types of spaces:
• Inaccessible spaces, which the heroes cannot enter
• Market spaces, where items can be bought or sold
• Common spaces, where battles can occur

 Every time the heroes visit a space, we "roll a die," and, if they are unlucky, then the monsters are created and the battle begins immediately.
 An example world size is 8 spaces by 8 spaces. In this size our suggestion is to have 20% inaccessible spaces, 30% market spaces, and 50% common spaces.
 */

// If the cell is inaccessible, tell the hero they can't go here and set their positions to the previous position
// If the cell is a market, the hero can enter it and the sold out/for sale items are shown
// If the cell is a common space, a probability generator is used to determine if a battle will occur or not
public class Cell implements ICell{
    private Cell cell;
    private Market market;
    private String type;
    private boolean battle = false;
    public Cell(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public boolean getBattle() {
        return battle;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cell getCell() {
        return cell;
    }

    public boolean isAccessible(){
        return !type.equals("inaccessible");
    }

    public boolean isBattle() {
        return battle;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void setBattle(boolean battle) {
        this.battle = battle;
    }
    public boolean isMarket(){
        return type.equals("market");
    }

    public void enterCell(Heroes hero){
        Positions heroPosition = hero.getPosition();
        int currentX = heroPosition.getX_pos();
        int currentY = heroPosition.getY_pos();
        int previousX = heroPosition.getPreviousY_pos();
        int previousY = heroPosition.getPreviousY_pos();

        if (type.equals("inaccessible")){
            System.out.println(colorText("You can't go here", "red"));
            heroPosition.setPos(previousX, previousY);
        } else if (type.equals("market")){
            System.out.println("You entered the market: ");
//            market.showItems();
//            market.showSoldOutItems();
        } else if (type.equals("common")){
            int battleThreshold = 3;
            Random random = new Random();
            int dieRoll = random.nextInt(6) + 1;

            if (dieRoll <= battleThreshold) {
                System.out.println("A battle begins!");
                setBattle(true);
                // Start the battle here
            } else {
                System.out.println("No battle this time.");
                setBattle(false);
            }
        }
    }


}

package main.Battle;
/*
 The class defines the rules of battle in this game
 The user is asked to choose a team of heroes, maximum being 3. The heroes are then placed in a random order and they
 move around the world in the World class. At a common space, every cell the user enter is either inaccessible, a market
 or a common space. If the user enters a common space, a probability generator is used to determine if a battle will occur which is
 handled by the cell class. If the battle begins, use the following rule to spawn the level of monsters
 sum of HP of Heroes / 100 * number of heroes = probability, the higher the probability, the higher the level of monsters
 */
import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;
import main.Market.Market;
import main.Teams.TeamHeroes;
import main.Teams.TeamMonsters;
import main.World.World;
import main.StoryLine;
import java.util.Scanner;
import static main.StoryLine.startStory;

public class Battle {

    private World world;
    private TeamHeroes teamHeroes;
    private Market market;
    private Scanner scanner;
    public Battle() {
        scanner = new Scanner(System.in);
        market = new Market();
        createNewGame();
    }

    public void createNewGame() {
        startStory();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Welcome to the Monsters and Heroes game!");
        System.out.println("Enter the size of the world (e.g., 8 for an 8x8 world):");
        int worldSize = scanner.nextInt();
        world = new World(worldSize);
        world.printWorld();
        market = new Market(); // Initialize the market
        // Load the items for the market here

        selectHeroes();
    }

    public void selectHeroes() {
        System.out.println("Select your team of heroes (maximum 3 heroes):");
        // Implement hero selection logic here
    }

    public void resetWorld() {
        world.generateRandomBoard();
        world.printWorld();
    }

    public void mainGameLoop() {
        while (true) {
            // Implement main game loop logic here
        }
    }

    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.mainGameLoop();
    }

    public void battle(TeamHeroes teamHeroes, TeamMonsters teamMonsters) {
        // Implement battle logic here
    }
}

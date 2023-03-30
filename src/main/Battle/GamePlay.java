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
import main.Market.Market;
import main.Positions.Positions;
import main.Teams.TeamHeroes;
import main.World.Cell.Cell;
import main.World.World;
import main.controls;

import java.util.List;
import java.util.Scanner;
import main.LoadData.LoadData;

import static main.StoryLine.*;

public class GamePlay {
    private LoadData loadData = new LoadData();
    private List<Heroes> Paladins = loadData.getPaladins();
    private List<Heroes> Sorcerers = loadData.getSorcerers();
    private List<Heroes> Warriors = loadData.getWarriors();
    private World world;
    private Fight fight;
    private TeamHeroes teamHeroes;
    private Market market;
    private Scanner scanner;
    //----------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------
    // constructor to start the game
    public GamePlay() {
        scanner = new Scanner(System.in);
        createNewGame();
    }
    // --------------------------------------------------------------------------------------------------------------
    // making the game
    public void createNewGame() {
//        startStory();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Welcome to the Monsters and Heroes game!");
        System.out.println("Enter the size of the world (e.g., 8 for an 8x8 world):");
        int worldSize = scanner.nextInt();
        world = new World(worldSize);
        world.printWorld();

        while (true) {
            System.out.println("Do you want to change the world (y/n)?");
            String answer = scanner.next();
            if (answer.equals("n")) {
                break;
            }
            resetWorld();
        }
        market = new Market(); // Initialize the market
        selectHeroes();
    }
    // --------------------------------------------------------------------------------------------------------------
    // Resetting the world to a new random world
    public void resetWorld() {
        world.generateRandomBoard();
        world.printWorld();
    }
    // --------------------------------------------------------------------------------------------------------------
    // Selecting Heroes for the game
    public void selectHeroes() {
        System.out.println("Here's a list of heroes you can choose from. Select your team of heroes (maximum 3 heroes):");
        // Implement hero selection logic here
        System.out.println("Paladins: ");
        Paladins = loadData.getPaladins();
        System.out.println("----------------------------------------");
        System.out.println("Sorcerers: ");
        Sorcerers = loadData.getSorcerers();
        System.out.println("----------------------------------------");
        System.out.println("Warriors: ");
        Warriors = loadData.getWarriors();
        System.out.println("----------------------------------------");

        // make a team of heroes
        System.out.println("Enter you team name: ");
        String teamName = scanner.next();
        int teamSize = 0;
        while(true){
            System.out.println("Enter you team size (cannot be greater than 3): ");
            teamSize = scanner.nextInt();
            if(teamSize > 3){
                System.out.println("Team size cannot be greater than 3");
            }else{
                break;
            }
        }

        // Enter the x and y position you want to start from, if the position is not valid, ask the user to enter again
        System.out.println("Enter the x position you want to start from: ");
        int x = scanner.nextInt();
        System.out.println("Enter the y position you want to start from: ");
        int y = scanner.nextInt();

        while(true){
            if(world.getCell(x, y).isAccessible()){
                break;
            }else{
                System.out.println("The position you entered is not accessible, please enter again");
                System.out.println("Enter the x position you want to start from: ");
                x = scanner.nextInt();
                System.out.println("Enter the y position you want to start from: ");
                y = scanner.nextInt();
            }
        }


        teamHeroes = new TeamHeroes(teamName, teamSize, x, y);

        while (teamHeroes.getHeroes().size() < teamSize) {
            // The new code above should be placed here.
            boolean heroFound = false;
            while (!heroFound) {
                System.out.println("Enter the name of the hero you want to select: ");
                String heroName = scanner.next();
                Heroes hero = null;

                for (Heroes paladin : Paladins) {
                    if (paladin.getName().equalsIgnoreCase(heroName)) {
                        hero = paladin;
                        teamHeroes.addHero(hero);
                        heroFound = true;
                        hero.setPosition(new Positions(x, y));
                        break;
                    }
                }
                if (!heroFound) {
                    for (Heroes sorcerer : Sorcerers) {
                        if (sorcerer.getName().equalsIgnoreCase(heroName)) {
                            hero = sorcerer;
                            teamHeroes.addHero(hero);
                            heroFound = true;
                            hero.setPosition(new Positions(x, y));
                            break;
                        }
                    }
                }
                if (!heroFound) {
                    for (Heroes warrior : Warriors) {
                        if (warrior.getName().equalsIgnoreCase(heroName)) {
                            hero = warrior;
                            teamHeroes.addHero(hero);
                            heroFound = true;
                            hero.setPosition(new Positions(x, y));
                            break;
                        }
                    }
                }
                if (!heroFound) {
                    System.out.println("Invalid hero name! Please enter a valid hero name: ");
                }
            }
        }

    }
    // --------------------------------------------------------------------------------------------------------------
    // Main game function
    public void mainGameLoop() {
        controls control = new controls();
        Scanner scanner = new Scanner(System.in);
        char input;
        while (true) {
            control.printControlInfo();
            world.printWorld();
            System.out.println("Enter your command (WASD for movement, Q to quit, I for info, M to enter market): ");
            input = scanner.next().charAt(0);
            // ------------------------- QUIT THE GAME -------------------------
            if (input == control.getQuit()) { QuitGame();   break; }
            // ------------------------- PRINT GAME INFORMATION --------------------------------
            if (input == control.getI()) {
                PrintInformation(world, teamHeroes, market, control);
                continue;
            }
            // ------------------------- MOVE THE HERO --------------------------------
//            Positions currentPosition = teamHeroes.getHeroes().get(0).getPosition();
//            Positions newPosition = control.move(currentPosition, input);
//            while (!(newPosition.getX_pos() >= 0 && newPosition.getX_pos() < world.getSize() &&
//                    newPosition.getY_pos() >= 0 && newPosition.getY_pos() < world.getSize())){
//                System.out.println("You cannot move outside the world!");
//                System.out.println("Enter your command (WASD for movement, Q to quit): ");
//                input = scanner.next().charAt(0);
//                if (input == control.getQuit()) {
//                    System.out.println("Quitting the game...");
//                    endStory();
//                    break;
//                }
//                newPosition = control.move(currentPosition, input);
//            }
//            teamHeroes.getHeroes().get(0).getPosition().setPos(newPosition.getX_pos(), newPosition.getY_pos());
//            teamHeroes.setTeamPosition(teamHeroes.getHero(0));
//            // check if getBattle is true or not for this cell in the world, if it is true, then we need to start the battle
//            Cell thisCell = world.getWorld()[newPosition.getX_pos()][newPosition.getY_pos()];
//            if (thisCell.getBattle()) {
//                // Start the battle
//                fight.battle((List<Heroes>) teamHeroes);
//            }
            Heroes hero = teamHeroes.getHeroes().get(0);
            Positions currentPosition = hero.getPosition();
            Positions newPosition = control.move(currentPosition, input);
            while (!(newPosition.getX_pos() >= 0 && newPosition.getX_pos() < world.getSize() &&
                    newPosition.getY_pos() >= 0 && newPosition.getY_pos() < world.getSize())){
                System.out.println("You cannot move outside the world!");
                System.out.println("Enter your command (WASD for movement, Q to quit): ");
                input = scanner.next().charAt(0);
                if (input == control.getQuit()) {
                    System.out.println("Quitting the game...");
                    endStory();
                    break;
                }
                newPosition = control.move(currentPosition, input);
            }
            hero.getPosition().setPos(newPosition.getX_pos(), newPosition.getY_pos());
            teamHeroes.setTeamPosition(teamHeroes.getHero(0));

            // Use enterCell function to handle the cell logic
            Cell thisCell = world.getWorld()[newPosition.getX_pos()][newPosition.getY_pos()];
            thisCell.enterCell(hero);

            if (thisCell.getBattle()) {
                // Start the battle
                fight.battle((List<Heroes>) teamHeroes);
            }
            // ------------------------- ENTER THE MARKET --------------------------------
            if (input == control.getEnterMarket()) {
                // Check if the user enters a market
                Cell currentCell = world.getWorld()[newPosition.getX_pos()][newPosition.getY_pos()];
                if (currentCell.isMarket()) {
                    System.out.println("Entering the market...");
                    market.enterMarket(teamHeroes);
                } else {
                    System.out.println("There is no market here!");
                }
            }
            //----------------------------------------------------------------------------------------------
        }
    }
    // --------------------------------------------------------------------------------------------------------------
    // Helper function print out the message when the user quits the game
    public static void QuitGame(){
        System.out.println("Quitting the game...");
        endStory();
    }
    // Helper function to print out game information if the user asks for it
    public static void PrintInformation(World world, TeamHeroes teamHeroes, Market market, controls control){
        System.out.println("--------------------------------------------------------");
        System.out.println();
        System.out.println("Display information about the world: ");
        world.printWorldInfo();
        System.out.println();
        System.out.println("Display information about the controls: ");
        control.printControlInfo();
        System.out.println();
        System.out.println("Display information about the heroes: ");
        System.out.println();
        System.out.println("--------------------------------------------------------");
        for (Heroes hero : teamHeroes.getHeroes()) {
            hero.printStats();
        }
        System.out.println("--------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Display information about the markets: ");
        System.out.println("You can buy the following items: ");
        market.showItems();
        System.out.println();
        System.out.println("You cannot sell the following items: ");
        market.showSoldOutItems();
        System.out.println();
        System.out.println("--------------------------------------------------------");
    }
    // --------------------------------------------------------------------------------------------------------------

}

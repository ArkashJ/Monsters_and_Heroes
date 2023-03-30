# CS611-Assignment 3
## Monsters and Heroes
---------------------------------------------------------------------------
Arkash Jain
arkjain@bu.edu
U5874827

## Files
---------------------------------------------------------------------------
This program implements the SOLID principles and every file does ONE thing.
The following packages or folders have been made:
1. Characters - A character is the parent class for a monster and hero and defines attributes common to both like name, HP and level
   a. Hero.java - A hero extends character and has additional attributes like MP, dexterity, strength, agility and inventory
   b. Monster.java - A monsters have additional damage and defense attributes based on the type

2. Controls
   a. Controls.java - A class to define WASD/Q/I controls, and getters and setters to change the player's position in the world

3. Battle
   a. Fight.java - A class that actually deals with the fight between a hero and monster. The hero can pick items from their inventory and use them
   or simply attack and use their strength to inflict damage on the monster. The monster can attack the hero and inflict damage based on their base damage.
   b. GamePlay - class to start the game, initialize the player and play the game.

4. Colors
    a. Colors.java - A class to define ANSI escape codes for colors

5. Inventory
    a. Inventory.java - A class to define the inventory of a hero and the items they can pick up

6. Items
    a. Items.java - A class to define the items that a hero can pick up and use in battle
    b. Armors.java - A class to define armor attributes
    c. Potions.java - A class to define potion attributes
    d. Weapons.java - A class to define weapon attributes
    e. Spells.java - A class to define spell attributes 
      i. FireSpell.java - A class to define fire spell attributes
      ii. IceSpell.java - A class to define ice spell attributes
      iii. LightningSpell.java - A class to define lightning spell attributes
   
7. LoadData
   a. LoadData.java - A class to load data from the .txt files provided in the same path (/src/Instructions)
   b. Loadable interface - a generic interface for loading files

8. Market
    a. Market.java - A class to define the market where a hero can buy items. It has features like entering the market, buying items, selling items
   displaying items for sale and items that are sold out.

9. storyLine
    a. storyLine.java - A class to define the story line of the game and the ending

10. Teams
    a. TeamHeroes.java - A class to define the team of heroes that the player can choose from
    b. TeamMonsters.java - A class to define the team of monsters that the heroes will face

11. World
    a. World.java - A class made up of cells which has features to enter certain cells and set positions. It also make a randomized world
      where cells are inaccessible, markets or common spaces
    b. Cell.java - A class that defines the basic element for the world

12. Positions.java - A class to move the player across the world my changing their x, y positions

13. Main.java - A class to run the game

## Notes
---------------------------------------------------------------------------
1. Files should be parsed in the following order:
    Main.java -> Battle.java -> Fight.java/FightRules.java/Market.java/Teams, TeamHeroes, TeamMonsters -> 
    World.java/Inventory.java -> Cell.java -> Postions.java/Items.java -> LoadData -> storyLine
2. Please run the Main.java file to run this code. 
3. Notes to grader:

- Characters, Inventory, Items, Inventory, Positions, Market and World are the main packages that define basic objects in this game
- Battle package has the actual fight implementation
- LoadData reads the data from the .txt files provided in the same path (/src/Instructions)
- Controls.java has the rules to move around in the game
- FightRules has the rules needed for each fight
- Colors and storyLine are additional classes that make the code more impactful

## BONUS implemented
---------------------------------------------------------------------------
1. Used Colors
2. Made a storyline and ending
3. **Implemented a fightRule such that I (sum of HP of Heroes / (100 * num of Heroes)) gives a probability of the heroes health and generates
   weaker or stronger monsters on the basis of this probability
4. Used niche libraries:
   - time in storyLine
   - ANSI escape codes in Colors
   - Collections in Cell
   - ArrayLists to store characters and items
   - Generics for Loading Data
   - HashMap for Inventory
   - Iterator in Market
5. Used interfaces and abstract/parent classes and subclasses for each package
6. Used a generic interface to load data
7. Used packages, encapsulation and inheritance to obey SOLID principles

## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory "src"
2. Run the following commands on a mac
   javac Main.java
   java Main.java

## Input/Output Example
---------------------------------------------------------------------------
1. Starting the Game, printing information, making a team and Quitting
Welcome to the Monsters and Heroes game!
   Enter the size of the world (e.g., 8 for an 8x8 world):
   8
   +---+---+---+---+---+---+---+---+
   | M |   | x | x |   | M | M |   |
   +---+---+---+---+---+---+---+---+
   | x |   | M |   |   |   | M |   |
   +---+---+---+---+---+---+---+---+
   |   | M | x |   | M |   | M | M |
   +---+---+---+---+---+---+---+---+
   |   |   |   | x |   | M |   | x |
   +---+---+---+---+---+---+---+---+
   |   | x | M | x |   |   | x | x |
   +---+---+---+---+---+---+---+---+
   | M | x | M |   |   |   | M | x |
   +---+---+---+---+---+---+---+---+
   | M | M | M |   |   |   |   | M |
   +---+---+---+---+---+---+---+---+
   |   |   | M |   |   |   |   |   |
   +---+---+---+---+---+---+---+---+
   Do you want to change the world (y/n)?
   y
   +---+---+---+---+---+---+---+---+
   | M |   |   | M |   |   |   | M |
   +---+---+---+---+---+---+---+---+
   |   |   | M |   | M |   | M | x |
   +---+---+---+---+---+---+---+---+
   | M | M |   |   | M | M | M |   |
   +---+---+---+---+---+---+---+---+
   | M | x |   |   |   |   |   |   |
   +---+---+---+---+---+---+---+---+
   |   | x | x |   | M | x | M | x |
   +---+---+---+---+---+---+---+---+
   | M |   |   | M | x | x |   |   |
   +---+---+---+---+---+---+---+---+
   | M |   |   |   |   | x |   | M |
   +---+---+---+---+---+---+---+---+
   |   | M | x | x |   | x |   |   |
   +---+---+---+---+---+---+---+---+
   Do you want to change the world (y/n)?
   n
   The stats for this armor are as follows:
   Name: Platinum_Shield  |  Level: 1  |  HP: 150  |  MP: 200.000  |  
   The stats for this armor are as follows:
   Name: Breastplate  |  Level: 3  |  HP: 350  |  MP: 600.000  |  
   The stats for this armor are as follows:
   Name: Full_Body_Armor  |  Level: 8  |  HP: 1000  |  MP: 1,100.000  |  
   The stats for this armor are as follows:
   Name: Wizard_Shield  |  Level: 10  |  HP: 1200  |  MP: 1,500.000  |  
   The stats for this armor are as follows:
   Name: Guardian_Angel  |  Level: 10  |  HP: 1000  |  MP: 1,000.000  |  
   The stats for this potion are as follows:
   Name: Healing_Potion  |  Level: 1  |  HP: 250  |  Effect Amount: 100  |  Property: Health
   The stats for this potion are as follows:
   Name: Strength_Potion  |  Level: 1  |  HP: 200  |  Effect Amount: 75  |  Property: Strength
   The stats for this potion are as follows:
   Name: Magic_Potion  |  Level: 2  |  HP: 350  |  Effect Amount: 100  |  Property: Mana
   The stats for this potion are as follows:
   Name: Luck_Elixir  |  Level: 4  |  HP: 500  |  Effect Amount: 65  |  Property: Agility
   The stats for this potion are as follows:
   Name: Mermaid_Tears  |  Level: 5  |  HP: 850  |  Effect Amount: 100  |  Property: Health/Mana/Strength/Agility
   The stats for this potion are as follows:
   Name: Ambrosia  |  Level: 8  |  HP: 1000  |  Effect Amount: 150  |  Property: All
   The stats for this weapon are as follows:
   Name: Sword  |  Level: 1  |  HP: 500  |  MP: 800.000  |  Dexterity: 1  |  
   The stats for this weapon are as follows:
   Name: Bow  |  Level: 2  |  HP: 300  |  MP: 500.000  |  Dexterity: 2  |  
   The stats for this weapon are as follows:
   Name: Scythe  |  Level: 6  |  HP: 1000  |  MP: 1,100.000  |  Dexterity: 2  |  
   The stats for this weapon are as follows:
   Name: Axe  |  Level: 5  |  HP: 550  |  MP: 850.000  |  Dexterity: 1  |  
   The stats for this weapon are as follows:
   Name: TSwords  |  Level: 8  |  HP: 1400  |  MP: 1,600.000  |  Dexterity: 2  |  
   The stats for this weapon are as follows:
   Name: Dagger  |  Level: 1  |  HP: 200  |  MP: 250.000  |  Dexterity: 1  |  
   The stats for this spell are as follows:
   Name: Flame_Tornado  |  Level: 4  |  HP: 700  |  MP: 850.000  |  MP: 300  |  
   The stats for this spell are as follows:
   Name: Breath_of_Fire  |  Level: 1  |  HP: 350  |  MP: 450.000  |  MP: 100  |  
   The stats for this spell are as follows:
   Name: Heat_Wave  |  Level: 2  |  HP: 450  |  MP: 600.000  |  MP: 150  |  
   The stats for this spell are as follows:
   Name: Lava_Comet  |  Level: 7  |  HP: 800  |  MP: 1,000.000  |  MP: 550  |  
   The stats for this spell are as follows:
   Name: Hell_Storm  |  Level: 3  |  HP: 600  |  MP: 950.000  |  MP: 600  |  
   The stats for this spell are as follows:
   Name: Snow_Cannon  |  Level: 2  |  HP: 500  |  MP: 650.000  |  MP: 250  |  
   The stats for this spell are as follows:
   Name: Ice_Blade  |  Level: 1  |  HP: 250  |  MP: 450.000  |  MP: 100  |  
   The stats for this spell are as follows:
   Name: Frost_Blizzard  |  Level: 5  |  HP: 750  |  MP: 850.000  |  MP: 350  |  
   The stats for this spell are as follows:
   Name: Arctic_Storm  |  Level: 6  |  HP: 700  |  MP: 800.000  |  MP: 300  |  
   The stats for this spell are as follows:
   Name: Lightning_Dagger  |  Level: 1  |  HP: 400  |  MP: 500.000  |  MP: 150  |  
   The stats for this spell are as follows:
   Name: Thunder_Blast  |  Level: 4  |  HP: 750  |  MP: 950.000  |  MP: 400  |  
   The stats for this spell are as follows:
   Name: Electric_Arrows  |  Level: 5  |  HP: 550  |  MP: 650.000  |  MP: 200  |  
   The stats for this spell are as follows:
   Name: Spark_Needles  |  Level: 2  |  HP: 500  |  MP: 600.000  |  MP: 200  |  
   Here's a list of heroes you can choose from. Select your team of heroes (maximum 3 heroes):
   Paladins:
   The stats for this player are as follows:
   Name: Parzival  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Sehanine_Moonbow  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 700.000  |  Strength: 750.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Skoraeus_Stonebones  |  Level: 4  |  HP: 400.000  |  MP: 250.000  |  Dexterity: 350.000  |  Agility: 600.000  |  Strength: 650.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Garl_Glittergold  |  Level: 5  |  HP: 500.000  |  MP: 100.000  |  Dexterity: 400.000  |  Agility: 500.000  |  Strength: 600.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Amaryllis_Astra  |  Level: 5  |  HP: 500.000  |  MP: 500.000  |  Dexterity: 500.000  |  Agility: 500.000  |  Strength: 500.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Caliber_Heist  |  Level: 8  |  HP: 800.000  |  MP: 400.000  |  Dexterity: 400.000  |  Agility: 400.000  |  Strength: 400.000  |  Gold: 2500  |  
   The inventory currently is:
----------------------------------------
Sorcerers:
The stats for this player are as follows:
Name: Rillifane_Rallathil  |  Level: 9  |  HP: 900.000  |  MP: 1,300.000  |  Dexterity: 500.000  |  Agility: 450.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Segojan_Earthcaller  |  Level: 5  |  HP: 500.000  |  MP: 900.000  |  Dexterity: 650.000  |  Agility: 500.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reign_Havoc  |  Level: 8  |  HP: 800.000  |  MP: 800.000  |  Dexterity: 800.000  |  Agility: 800.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reverie_Ashels  |  Level: 7  |  HP: 700.000  |  MP: 900.000  |  Dexterity: 400.000  |  Agility: 700.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Warriors:
The stats for this player are as follows:
Name: Gaerdal_Ironhand  |  Level: 7  |  HP: 700.000  |  MP: 100.000  |  Dexterity: 600.000  |  Agility: 500.000  |  Strength: 700.000  |  Gold: 1354  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Monnbow  |  Level: 8  |  HP: 800.000  |  MP: 600.000  |  Dexterity: 500.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Muamman_Duathall  |  Level: 6  |  HP: 600.000  |  MP: 300.000  |  Dexterity: 750.000  |  Agility: 500.000  |  Strength: 900.000  |  Gold: 2546  |  
The inventory currently is:
The stats for this player are as follows:
Name: Flandal_Steelskin  |  Level: 7  |  HP: 700.000  |  MP: 200.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Undefeated_Yoj  |  Level: 7  |  HP: 700.000  |  MP: 400.000  |  Dexterity: 700.000  |  Agility: 400.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Eunoia_Cyn  |  Level: 6  |  HP: 600.000  |  MP: 400.000  |  Dexterity: 600.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Enter you team name:
helloWorld
Enter you team size (cannot be greater than 3):
1
Enter the x position you want to start from:
0
Enter the y position you want to start from:
1
Enter the name of the hero you want to select:
Eunoia_Cyn
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
World size: 8
Number of inaccessible cells: ~20%
Number of market cells: ~50%
Number of common cells: ~30%
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
I
Moving team to position: 0, 1
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
World size: 8
Number of inaccessible cells: ~20%
Number of market cells: ~50%
Number of common cells: ~30%
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
Q
Moving team to position: 0, 1
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
World size: 8
Number of inaccessible cells: ~20%
Number of market cells: ~50%
Number of common cells: ~30%
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
q
Quitting the game...
You have defeated the monsters and saved the world. You are now a legend. You are now a hero. You are now a champion
Thank you for playing!
------------------------------------------------------------------------------------------------------------

2. Moving around the world, entering the market and buying something:

Welcome to the Monsters and Heroes game!
Enter the size of the world (e.g., 8 for an 8x8 world):
8
+---+---+---+---+---+---+---+---+
| M |   | M |   |   | M | M |   |
+---+---+---+---+---+---+---+---+
|   | M | M |   | M | x | M |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   |   | x |   |
+---+---+---+---+---+---+---+---+
| x |   |   |   | x | M | M | x |
+---+---+---+---+---+---+---+---+
| M | x |   |   | x |   | x | x |
+---+---+---+---+---+---+---+---+
| x |   |   | M |   |   |   | x |
+---+---+---+---+---+---+---+---+
|   |   | M |   | M | M | M |   |
+---+---+---+---+---+---+---+---+
|   | x | M |   | M |   |   |   |
+---+---+---+---+---+---+---+---+
Do you want to change the world (y/n)?
y
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x | M | M |   |   | x |
+---+---+---+---+---+---+---+---+
| x |   | M |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   | x |   |   | M | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | x |   | M | M |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   | M |   |   | x |   | M | M |
+---+---+---+---+---+---+---+---+
| x | M | M | M | M | M |   | M |
+---+---+---+---+---+---+---+---+
Do you want to change the world (y/n)?
n
The stats for this armor are as follows:
Name: Platinum_Shield  |  Level: 1  |  HP: 150  |  MP: 200.000  |  
The stats for this armor are as follows:
Name: Breastplate  |  Level: 3  |  HP: 350  |  MP: 600.000  |  
The stats for this armor are as follows:
Name: Full_Body_Armor  |  Level: 8  |  HP: 1000  |  MP: 1,100.000  |  
The stats for this armor are as follows:
Name: Wizard_Shield  |  Level: 10  |  HP: 1200  |  MP: 1,500.000  |  
The stats for this armor are as follows:
Name: Guardian_Angel  |  Level: 10  |  HP: 1000  |  MP: 1,000.000  |  
The stats for this potion are as follows:
Name: Healing_Potion  |  Level: 1  |  HP: 250  |  Effect Amount: 100  |  Property: Health
The stats for this potion are as follows:
Name: Strength_Potion  |  Level: 1  |  HP: 200  |  Effect Amount: 75  |  Property: Strength
The stats for this potion are as follows:
Name: Magic_Potion  |  Level: 2  |  HP: 350  |  Effect Amount: 100  |  Property: Mana
The stats for this potion are as follows:
Name: Luck_Elixir  |  Level: 4  |  HP: 500  |  Effect Amount: 65  |  Property: Agility
The stats for this potion are as follows:
Name: Mermaid_Tears  |  Level: 5  |  HP: 850  |  Effect Amount: 100  |  Property: Health/Mana/Strength/Agility
The stats for this potion are as follows:
Name: Ambrosia  |  Level: 8  |  HP: 1000  |  Effect Amount: 150  |  Property: All
The stats for this weapon are as follows:
Name: Sword  |  Level: 1  |  HP: 500  |  MP: 800.000  |  Dexterity: 1  |  
The stats for this weapon are as follows:
Name: Bow  |  Level: 2  |  HP: 300  |  MP: 500.000  |  Dexterity: 2  |  
The stats for this weapon are as follows:
Name: Scythe  |  Level: 6  |  HP: 1000  |  MP: 1,100.000  |  Dexterity: 2  |  
The stats for this weapon are as follows:
Name: Axe  |  Level: 5  |  HP: 550  |  MP: 850.000  |  Dexterity: 1  |  
The stats for this weapon are as follows:
Name: TSwords  |  Level: 8  |  HP: 1400  |  MP: 1,600.000  |  Dexterity: 2  |  
The stats for this weapon are as follows:
Name: Dagger  |  Level: 1  |  HP: 200  |  MP: 250.000  |  Dexterity: 1  |  
The stats for this spell are as follows:
Name: Flame_Tornado  |  Level: 4  |  HP: 700  |  MP: 850.000  |  MP: 300  |  
The stats for this spell are as follows:
Name: Breath_of_Fire  |  Level: 1  |  HP: 350  |  MP: 450.000  |  MP: 100  |  
The stats for this spell are as follows:
Name: Heat_Wave  |  Level: 2  |  HP: 450  |  MP: 600.000  |  MP: 150  |  
The stats for this spell are as follows:
Name: Lava_Comet  |  Level: 7  |  HP: 800  |  MP: 1,000.000  |  MP: 550  |  
The stats for this spell are as follows:
Name: Hell_Storm  |  Level: 3  |  HP: 600  |  MP: 950.000  |  MP: 600  |  
The stats for this spell are as follows:
Name: Snow_Cannon  |  Level: 2  |  HP: 500  |  MP: 650.000  |  MP: 250  |  
The stats for this spell are as follows:
Name: Ice_Blade  |  Level: 1  |  HP: 250  |  MP: 450.000  |  MP: 100  |  
The stats for this spell are as follows:
Name: Frost_Blizzard  |  Level: 5  |  HP: 750  |  MP: 850.000  |  MP: 350  |  
The stats for this spell are as follows:
Name: Arctic_Storm  |  Level: 6  |  HP: 700  |  MP: 800.000  |  MP: 300  |  
The stats for this spell are as follows:
Name: Lightning_Dagger  |  Level: 1  |  HP: 400  |  MP: 500.000  |  MP: 150  |  
The stats for this spell are as follows:
Name: Thunder_Blast  |  Level: 4  |  HP: 750  |  MP: 950.000  |  MP: 400  |  
The stats for this spell are as follows:
Name: Electric_Arrows  |  Level: 5  |  HP: 550  |  MP: 650.000  |  MP: 200  |  
The stats for this spell are as follows:
Name: Spark_Needles  |  Level: 2  |  HP: 500  |  MP: 600.000  |  MP: 200  |  
Here's a list of heroes you can choose from. Select your team of heroes (maximum 3 heroes):
Paladins:
The stats for this player are as follows:
Name: Parzival  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Moonbow  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 700.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skoraeus_Stonebones  |  Level: 4  |  HP: 400.000  |  MP: 250.000  |  Dexterity: 350.000  |  Agility: 600.000  |  Strength: 650.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Garl_Glittergold  |  Level: 5  |  HP: 500.000  |  MP: 100.000  |  Dexterity: 400.000  |  Agility: 500.000  |  Strength: 600.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Amaryllis_Astra  |  Level: 5  |  HP: 500.000  |  MP: 500.000  |  Dexterity: 500.000  |  Agility: 500.000  |  Strength: 500.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Caliber_Heist  |  Level: 8  |  HP: 800.000  |  MP: 400.000  |  Dexterity: 400.000  |  Agility: 400.000  |  Strength: 400.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Sorcerers:
The stats for this player are as follows:
Name: Rillifane_Rallathil  |  Level: 9  |  HP: 900.000  |  MP: 1,300.000  |  Dexterity: 500.000  |  Agility: 450.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Segojan_Earthcaller  |  Level: 5  |  HP: 500.000  |  MP: 900.000  |  Dexterity: 650.000  |  Agility: 500.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reign_Havoc  |  Level: 8  |  HP: 800.000  |  MP: 800.000  |  Dexterity: 800.000  |  Agility: 800.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reverie_Ashels  |  Level: 7  |  HP: 700.000  |  MP: 900.000  |  Dexterity: 400.000  |  Agility: 700.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Warriors:
The stats for this player are as follows:
Name: Gaerdal_Ironhand  |  Level: 7  |  HP: 700.000  |  MP: 100.000  |  Dexterity: 600.000  |  Agility: 500.000  |  Strength: 700.000  |  Gold: 1354  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Monnbow  |  Level: 8  |  HP: 800.000  |  MP: 600.000  |  Dexterity: 500.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Muamman_Duathall  |  Level: 6  |  HP: 600.000  |  MP: 300.000  |  Dexterity: 750.000  |  Agility: 500.000  |  Strength: 900.000  |  Gold: 2546  |  
The inventory currently is:
The stats for this player are as follows:
Name: Flandal_Steelskin  |  Level: 7  |  HP: 700.000  |  MP: 200.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Undefeated_Yoj  |  Level: 7  |  HP: 700.000  |  MP: 400.000  |  Dexterity: 700.000  |  Agility: 400.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Eunoia_Cyn  |  Level: 6  |  HP: 600.000  |  MP: 400.000  |  Dexterity: 600.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Enter you team name:
kashM
Enter you team size (cannot be greater than 3):
1
Enter the x position you want to start from:
0
Enter the y position you want to start from:
0
Enter the name of the hero you want to select:
Skye_Soar
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x | M | M |   |   | x |
+---+---+---+---+---+---+---+---+
| x |   | M |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   | x |   |   | M | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | x |   | M | M |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   | M |   |   | x |   | M | M |
+---+---+---+---+---+---+---+---+
| x | M | M | M | M | M |   | M |
+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 1, 0
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x | M | M |   |   | x |
+---+---+---+---+---+---+---+---+
| x |   | M |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   | x |   |   | M | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | x |   | M | M |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   | M |   |   | x |   | M | M |
+---+---+---+---+---+---+---+---+
| x | M | M | M | M | M |   | M |
+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
m
Moving team to position: 1, 0
Entering the market...
Welcome to the market
You can buy or sell items here


-------------------------------------- BUY/SELL/EXIT -----------------------------------------------
To buy items, enter 'buy' | To sell items, enter 'sell' | To exit the market, enter 'exit'
buy
Select Hero:
Heroes:
Skye_Soar
Skye_Soar
You chose:
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:


----------------------------------- BUY ITEMS ----------------------------------------------------
These are the items for sale
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
Enter the name of the item you want to buy
Luck_Elixir
You bought Luck_Elixir for 500 gold
------------------------------------------------------------------
3. Loosing a battle
   Welcome to the Monsters and Heroes game!
   Enter the size of the world (e.g., 8 for an 8x8 world):
   9
   +---+---+---+---+---+---+---+---+---+
   |   |   |   |   |   | M |   | x |   |
   +---+---+---+---+---+---+---+---+---+
   | M |   |   |   | M |   |   | x | x |
   +---+---+---+---+---+---+---+---+---+
   | M | M |   | M |   |   | x |   | M |
   +---+---+---+---+---+---+---+---+---+
   |   | x |   | M |   | M |   | M | M |
   +---+---+---+---+---+---+---+---+---+
   | M |   | x | M | M | M |   |   |   |
   +---+---+---+---+---+---+---+---+---+
   | M |   | M | x | M |   |   | x | x |
   +---+---+---+---+---+---+---+---+---+
   | x | M | x |   |   | x | x |   |   |
   +---+---+---+---+---+---+---+---+---+
   |   |   | x | M |   |   | M |   |   |
   +---+---+---+---+---+---+---+---+---+
   |   | x |   | M | M |   | x | M |   |
   +---+---+---+---+---+---+---+---+---+
   Do you want to change the world (y/n)?
   n
   The stats for this armor are as follows:
   Name: Platinum_Shield  |  Level: 1  |  HP: 150  |  MP: 200.000  |  
   The stats for this armor are as follows:
   Name: Breastplate  |  Level: 3  |  HP: 350  |  MP: 600.000  |  
   The stats for this armor are as follows:
   Name: Full_Body_Armor  |  Level: 8  |  HP: 1000  |  MP: 1,100.000  |  
   The stats for this armor are as follows:
   Name: Wizard_Shield  |  Level: 10  |  HP: 1200  |  MP: 1,500.000  |  
   The stats for this armor are as follows:
   Name: Guardian_Angel  |  Level: 10  |  HP: 1000  |  MP: 1,000.000  |  
   The stats for this potion are as follows:
   Name: Healing_Potion  |  Level: 1  |  HP: 250  |  Effect Amount: 100  |  Property: Health
   The stats for this potion are as follows:
   Name: Strength_Potion  |  Level: 1  |  HP: 200  |  Effect Amount: 75  |  Property: Strength
   The stats for this potion are as follows:
   Name: Magic_Potion  |  Level: 2  |  HP: 350  |  Effect Amount: 100  |  Property: Mana
   The stats for this potion are as follows:
   Name: Luck_Elixir  |  Level: 4  |  HP: 500  |  Effect Amount: 65  |  Property: Agility
   The stats for this potion are as follows:
   Name: Mermaid_Tears  |  Level: 5  |  HP: 850  |  Effect Amount: 100  |  Property: Health/Mana/Strength/Agility
   The stats for this potion are as follows:
   Name: Ambrosia  |  Level: 8  |  HP: 1000  |  Effect Amount: 150  |  Property: All
   The stats for this weapon are as follows:
   Name: Sword  |  Level: 1  |  HP: 500  |  MP: 800.000  |  Dexterity: 1  |  
   The stats for this weapon are as follows:
   Name: Bow  |  Level: 2  |  HP: 300  |  MP: 500.000  |  Dexterity: 2  |  
   The stats for this weapon are as follows:
   Name: Scythe  |  Level: 6  |  HP: 1000  |  MP: 1,100.000  |  Dexterity: 2  |  
   The stats for this weapon are as follows:
   Name: Axe  |  Level: 5  |  HP: 550  |  MP: 850.000  |  Dexterity: 1  |  
   The stats for this weapon are as follows:
   Name: TSwords  |  Level: 8  |  HP: 1400  |  MP: 1,600.000  |  Dexterity: 2  |  
   The stats for this weapon are as follows:
   Name: Dagger  |  Level: 1  |  HP: 200  |  MP: 250.000  |  Dexterity: 1  |  
   The stats for this spell are as follows:
   Name: Flame_Tornado  |  Level: 4  |  HP: 700  |  MP: 850.000  |  MP: 300  |  
   The stats for this spell are as follows:
   Name: Breath_of_Fire  |  Level: 1  |  HP: 350  |  MP: 450.000  |  MP: 100  |  
   The stats for this spell are as follows:
   Name: Heat_Wave  |  Level: 2  |  HP: 450  |  MP: 600.000  |  MP: 150  |  
   The stats for this spell are as follows:
   Name: Lava_Comet  |  Level: 7  |  HP: 800  |  MP: 1,000.000  |  MP: 550  |  
   The stats for this spell are as follows:
   Name: Hell_Storm  |  Level: 3  |  HP: 600  |  MP: 950.000  |  MP: 600  |  
   The stats for this spell are as follows:
   Name: Snow_Cannon  |  Level: 2  |  HP: 500  |  MP: 650.000  |  MP: 250  |  
   The stats for this spell are as follows:
   Name: Ice_Blade  |  Level: 1  |  HP: 250  |  MP: 450.000  |  MP: 100  |  
   The stats for this spell are as follows:
   Name: Frost_Blizzard  |  Level: 5  |  HP: 750  |  MP: 850.000  |  MP: 350  |  
   The stats for this spell are as follows:
   Name: Arctic_Storm  |  Level: 6  |  HP: 700  |  MP: 800.000  |  MP: 300  |  
   The stats for this spell are as follows:
   Name: Lightning_Dagger  |  Level: 1  |  HP: 400  |  MP: 500.000  |  MP: 150  |  
   The stats for this spell are as follows:
   Name: Thunder_Blast  |  Level: 4  |  HP: 750  |  MP: 950.000  |  MP: 400  |  
   The stats for this spell are as follows:
   Name: Electric_Arrows  |  Level: 5  |  HP: 550  |  MP: 650.000  |  MP: 200  |  
   The stats for this spell are as follows:
   Name: Spark_Needles  |  Level: 2  |  HP: 500  |  MP: 600.000  |  MP: 200  |  
   Here's a list of heroes you can choose from. Select your team of heroes (maximum 3 heroes):
   Paladins:
   The stats for this player are as follows:
   Name: Parzival  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Sehanine_Moonbow  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 700.000  |  Strength: 750.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Skoraeus_Stonebones  |  Level: 4  |  HP: 400.000  |  MP: 250.000  |  Dexterity: 350.000  |  Agility: 600.000  |  Strength: 650.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Garl_Glittergold  |  Level: 5  |  HP: 500.000  |  MP: 100.000  |  Dexterity: 400.000  |  Agility: 500.000  |  Strength: 600.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Amaryllis_Astra  |  Level: 5  |  HP: 500.000  |  MP: 500.000  |  Dexterity: 500.000  |  Agility: 500.000  |  Strength: 500.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Caliber_Heist  |  Level: 8  |  HP: 800.000  |  MP: 400.000  |  Dexterity: 400.000  |  Agility: 400.000  |  Strength: 400.000  |  Gold: 2500  |  
   The inventory currently is:
----------------------------------------
Sorcerers:
The stats for this player are as follows:
Name: Rillifane_Rallathil  |  Level: 9  |  HP: 900.000  |  MP: 1,300.000  |  Dexterity: 500.000  |  Agility: 450.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Segojan_Earthcaller  |  Level: 5  |  HP: 500.000  |  MP: 900.000  |  Dexterity: 650.000  |  Agility: 500.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reign_Havoc  |  Level: 8  |  HP: 800.000  |  MP: 800.000  |  Dexterity: 800.000  |  Agility: 800.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reverie_Ashels  |  Level: 7  |  HP: 700.000  |  MP: 900.000  |  Dexterity: 400.000  |  Agility: 700.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Warriors:
The stats for this player are as follows:
Name: Gaerdal_Ironhand  |  Level: 7  |  HP: 700.000  |  MP: 100.000  |  Dexterity: 600.000  |  Agility: 500.000  |  Strength: 700.000  |  Gold: 1354  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Monnbow  |  Level: 8  |  HP: 800.000  |  MP: 600.000  |  Dexterity: 500.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Muamman_Duathall  |  Level: 6  |  HP: 600.000  |  MP: 300.000  |  Dexterity: 750.000  |  Agility: 500.000  |  Strength: 900.000  |  Gold: 2546  |  
The inventory currently is:
The stats for this player are as follows:
Name: Flandal_Steelskin  |  Level: 7  |  HP: 700.000  |  MP: 200.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Undefeated_Yoj  |  Level: 7  |  HP: 700.000  |  MP: 400.000  |  Dexterity: 700.000  |  Agility: 400.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Eunoia_Cyn  |  Level: 6  |  HP: 600.000  |  MP: 400.000  |  Dexterity: 600.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Enter you team name:
hd
Enter you team size (cannot be greater than 3):
1
Enter the x position you want to start from:
0
Enter the y position you want to start from:
0
Enter the name of the hero you want to select:
si
Invalid hero name! Please enter a valid hero name:
Enter the name of the hero you want to select:
Eunoia_Cyn
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   |   |   |   |   | M |   | x |   |
+---+---+---+---+---+---+---+---+---+
| M |   |   |   | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| M | M |   | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M |   | M |   | M | M |
+---+---+---+---+---+---+---+---+---+
| M |   | x | M | M | M |   |   |   |
+---+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   | x | x |   |   |
+---+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M | M |   | x | M |   |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 0, 1
No battle this time.
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   |   |   |   |   | M |   | x |   |
+---+---+---+---+---+---+---+---+---+
| M |   |   |   | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| M | M |   | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M |   | M |   | M | M |
+---+---+---+---+---+---+---+---+---+
| M |   | x | M | M | M |   |   |   |
+---+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   | x | x |   |   |
+---+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M | M |   | x | M |   |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 0, 2
No battle this time.
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   |   |   |   |   | M |   | x |   |
+---+---+---+---+---+---+---+---+---+
| M |   |   |   | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| M | M |   | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M |   | M |   | M | M |
+---+---+---+---+---+---+---+---+---+
| M |   | x | M | M | M |   |   |   |
+---+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   | x | x |   |   |
+---+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M | M |   | x | M |   |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 0, 3
No battle this time.
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   |   |   |   |   | M |   | x |   |
+---+---+---+---+---+---+---+---+---+
| M |   |   |   | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| M | M |   | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M |   | M |   | M | M |
+---+---+---+---+---+---+---+---+---+
| M |   | x | M | M | M |   |   |   |
+---+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   | x | x |   |   |
+---+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M | M |   | x | M |   |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 0, 4
No battle this time.
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   |   |   |   |   | M |   | x |   |
+---+---+---+---+---+---+---+---+---+
| M |   |   |   | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| M | M |   | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M |   | M |   | M | M |
+---+---+---+---+---+---+---+---+---+
| M |   | x | M | M | M |   |   |   |
+---+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   | x | x |   |   |
+---+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M | M |   | x | M |   |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 0, 5
You entered the market:
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   |   |   |   |   | M |   | x |   |
+---+---+---+---+---+---+---+---+---+
| M |   |   |   | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| M | M |   | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M |   | M |   | M | M |
+---+---+---+---+---+---+---+---+---+
| M |   | x | M | M | M |   |   |   |
+---+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | x | x |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   | x | x |   |   |
+---+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M | M |   | x | M |   |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 1, 5
A battle begins!
The stats for this monster are as follows:
Name: Cyrrollalee  |  Level: 7  |  HP: 7,500.000  |  Base-Damage: 700.000  |  Defence-Value: 800.000  |  Dodge-Agility: 75.000  |  
The stats for this monster are as follows:
Name: Brandobaris  |  Level: 3  |  HP: 3,000.000  |  Base-Damage: 350.000  |  Defence-Value: 450.000  |  Dodge-Agility: 30.000  |  
The stats for this monster are as follows:
Name: BigBad-Wolf  |  Level: 1  |  HP: 1,500.000  |  Base-Damage: 150.000  |  Defence-Value: 250.000  |  Dodge-Agility: 15.000  |  
The stats for this monster are as follows:
Name: WickedWitch  |  Level: 2  |  HP: 2,500.000  |  Base-Damage: 250.000  |  Defence-Value: 350.000  |  Dodge-Agility: 25.000  |  
The stats for this monster are as follows:
Name: Aasterinian  |  Level: 4  |  HP: 4,500.000  |  Base-Damage: 400.000  |  Defence-Value: 500.000  |  Dodge-Agility: 45.000  |  
The stats for this monster are as follows:
Name: Chronepsish  |  Level: 6  |  HP: 6,000.000  |  Base-Damage: 650.000  |  Defence-Value: 750.000  |  Dodge-Agility: 60.000  |  
The stats for this monster are as follows:
Name: Kiaransalee  |  Level: 8  |  HP: 8,500.000  |  Base-Damage: 850.000  |  Defence-Value: 950.000  |  Dodge-Agility: 85.000  |  
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 5,500.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
The stats for this monster are as follows:
Name: Merrshaullk  |  Level: 10  |  HP: 5,500.000  |  Base-Damage: 1,000.000  |  Defence-Value: 900.000  |  Dodge-Agility: 55.000  |  
The stats for this monster are as follows:
Name: St-Yeenoghu  |  Level: 9  |  HP: 9,000.000  |  Base-Damage: 950.000  |  Defence-Value: 850.000  |  Dodge-Agility: 90.000  |  
The stats for this monster are as follows:
Name: DocOck  |  Level: 6  |  HP: 5,500.000  |  Base-Damage: 600.000  |  Defence-Value: 600.000  |  Dodge-Agility: 55.000  |  
The stats for this monster are as follows:
Name: Exodia  |  Level: 10  |  HP: 5,000.000  |  Base-Damage: 1,000.000  |  Defence-Value: 1,000.000  |  Dodge-Agility: 50.000  |  
The stats for this monster are as follows:
Name: Andrealphus  |  Level: 2  |  HP: 4,000.000  |  Base-Damage: 600.000  |  Defence-Value: 500.000  |  Dodge-Agility: 40.000  |  
The stats for this monster are as follows:
Name: Blinky  |  Level: 1  |  HP: 3,500.000  |  Base-Damage: 450.000  |  Defence-Value: 350.000  |  Dodge-Agility: 35.000  |  
The stats for this monster are as follows:
Name: Andromalius  |  Level: 3  |  HP: 2,500.000  |  Base-Damage: 550.000  |  Defence-Value: 450.000  |  Dodge-Agility: 25.000  |  
The stats for this monster are as follows:
Name: Chiang-shih  |  Level: 4  |  HP: 4,000.000  |  Base-Damage: 700.000  |  Defence-Value: 600.000  |  Dodge-Agility: 40.000  |  
The stats for this monster are as follows:
Name: FallenAngel  |  Level: 5  |  HP: 5,000.000  |  Base-Damage: 800.000  |  Defence-Value: 700.000  |  Dodge-Agility: 50.000  |  
The stats for this monster are as follows:
Name: Ereshkigall  |  Level: 6  |  HP: 3,500.000  |  Base-Damage: 950.000  |  Defence-Value: 450.000  |  Dodge-Agility: 35.000  |  
The stats for this monster are as follows:
Name: Melchiresas  |  Level: 7  |  HP: 7,500.000  |  Base-Damage: 350.000  |  Defence-Value: 150.000  |  Dodge-Agility: 75.000  |  
The stats for this monster are as follows:
Name: Jormunngand  |  Level: 8  |  HP: 2,000.000  |  Base-Damage: 600.000  |  Defence-Value: 900.000  |  Dodge-Agility: 20.000  |  
The stats for this monster are as follows:
Name: Rakkshasass  |  Level: 9  |  HP: 3,500.000  |  Base-Damage: 550.000  |  Defence-Value: 600.000  |  Dodge-Agility: 35.000  |  
The stats for this monster are as follows:
Name: Taltecuhtli  |  Level: 10  |  HP: 5,000.000  |  Base-Damage: 300.000  |  Defence-Value: 200.000  |  Dodge-Agility: 50.000  |  
The stats for this monster are as follows:
Name: Casper  |  Level: 1  |  HP: 5,000.000  |  Base-Damage: 100.000  |  Defence-Value: 100.000  |  Dodge-Agility: 50.000  |  
The stats for this monster are as follows:
Name: Desghidorrah  |  Level: 3  |  HP: 3,500.000  |  Base-Damage: 300.000  |  Defence-Value: 400.000  |  Dodge-Agility: 35.000  |  
The stats for this monster are as follows:
Name: Chrysophylax  |  Level: 2  |  HP: 2,000.000  |  Base-Damage: 200.000  |  Defence-Value: 500.000  |  Dodge-Agility: 20.000  |  
The stats for this monster are as follows:
Name: BunsenBurner  |  Level: 4  |  HP: 4,500.000  |  Base-Damage: 400.000  |  Defence-Value: 500.000  |  Dodge-Agility: 45.000  |  
The stats for this monster are as follows:
Name: Natsunomeryu  |  Level: 1  |  HP: 1,000.000  |  Base-Damage: 100.000  |  Defence-Value: 200.000  |  Dodge-Agility: 10.000  |  
The stats for this monster are as follows:
Name: TheScaleless  |  Level: 7  |  HP: 7,500.000  |  Base-Damage: 700.000  |  Defence-Value: 600.000  |  Dodge-Agility: 75.000  |  
The stats for this monster are as follows:
Name: Kas-Ethelinh  |  Level: 5  |  HP: 6,000.000  |  Base-Damage: 600.000  |  Defence-Value: 500.000  |  Dodge-Agility: 60.000  |  
The stats for this monster are as follows:
Name: Alexstraszan  |  Level: 10  |  HP: 5,500.000  |  Base-Damage: 1,000.000  |  Defence-Value: 9,000.000  |  Dodge-Agility: 55.000  |  
The stats for this monster are as follows:
Name: Phaarthurnax  |  Level: 6  |  HP: 6,000.000  |  Base-Damage: 600.000  |  Defence-Value: 700.000  |  Dodge-Agility: 60.000  |  
The stats for this monster are as follows:
Name: D-Maleficent  |  Level: 9  |  HP: 8,500.000  |  Base-Damage: 900.000  |  Defence-Value: 950.000  |  Dodge-Agility: 85.000  |  
The stats for this monster are as follows:
Name: TheWeatherbe  |  Level: 8  |  HP: 8,000.000  |  Base-Damage: 800.000  |  Defence-Value: 900.000  |  Dodge-Agility: 80.000  |  
The stats for this monster are as follows:
Name: Igneel  |  Level: 6  |  HP: 6,000.000  |  Base-Damage: 600.000  |  Defence-Value: 400.000  |  Dodge-Agility: 60.000  |  
The stats for this monster are as follows:
Name: BlueEyesWhite  |  Level: 9  |  HP: 7,500.000  |  Base-Damage: 900.000  |  Defence-Value: 600.000  |  Dodge-Agility: 75.000  |  
Enter action for Eunoia_Cyn: (potion/spell/weapon/armor/information)
weapon
You don't have any weapons.
Igneel attacks Eunoia_Cyn for 600.0 damage.
Eunoia_Cyn has been defeated!
All heroes have been defeated!
---------------------------------------------------------------------------------------------------------------------------------------------
4. Entering wrong position
   Welcome to the Monsters and Heroes game!
   Enter the size of the world (e.g., 8 for an 8x8 world):
   8
   +---+---+---+---+---+---+---+---+
   | x |   |   |   |   |   | M |   |
   +---+---+---+---+---+---+---+---+
   | x | M | M | M | M | M | M |   |
   +---+---+---+---+---+---+---+---+
   |   |   |   |   | x |   |   |   |
   +---+---+---+---+---+---+---+---+
   | x |   |   | x |   | x | x | M |
   +---+---+---+---+---+---+---+---+
   | M |   | x |   |   | M |   | x |
   +---+---+---+---+---+---+---+---+
   | M |   |   |   |   | x | M | x |
   +---+---+---+---+---+---+---+---+
   |   | x |   | M | M |   | M |   |
   +---+---+---+---+---+---+---+---+
   | M |   |   | M | M | M |   |   |
   +---+---+---+---+---+---+---+---+
   Do you want to change the world (y/n)?
   n
   Here's a list of heroes you can choose from. Select your team of heroes (maximum 3 heroes):
   Paladins:
   The stats for this player are as follows:
   Name: Parzival  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Sehanine_Moonbow  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 700.000  |  Strength: 750.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Skoraeus_Stonebones  |  Level: 4  |  HP: 400.000  |  MP: 250.000  |  Dexterity: 350.000  |  Agility: 600.000  |  Strength: 650.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Garl_Glittergold  |  Level: 5  |  HP: 500.000  |  MP: 100.000  |  Dexterity: 400.000  |  Agility: 500.000  |  Strength: 600.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Amaryllis_Astra  |  Level: 5  |  HP: 500.000  |  MP: 500.000  |  Dexterity: 500.000  |  Agility: 500.000  |  Strength: 500.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Caliber_Heist  |  Level: 8  |  HP: 800.000  |  MP: 400.000  |  Dexterity: 400.000  |  Agility: 400.000  |  Strength: 400.000  |  Gold: 2500  |  
   The inventory currently is:
----------------------------------------
Sorcerers:
The stats for this player are as follows:
Name: Rillifane_Rallathil  |  Level: 9  |  HP: 900.000  |  MP: 1,300.000  |  Dexterity: 500.000  |  Agility: 450.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Segojan_Earthcaller  |  Level: 5  |  HP: 500.000  |  MP: 900.000  |  Dexterity: 650.000  |  Agility: 500.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reign_Havoc  |  Level: 8  |  HP: 800.000  |  MP: 800.000  |  Dexterity: 800.000  |  Agility: 800.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reverie_Ashels  |  Level: 7  |  HP: 700.000  |  MP: 900.000  |  Dexterity: 400.000  |  Agility: 700.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Warriors:
The stats for this player are as follows:
Name: Gaerdal_Ironhand  |  Level: 7  |  HP: 700.000  |  MP: 100.000  |  Dexterity: 600.000  |  Agility: 500.000  |  Strength: 700.000  |  Gold: 1354  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Monnbow  |  Level: 8  |  HP: 800.000  |  MP: 600.000  |  Dexterity: 500.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Muamman_Duathall  |  Level: 6  |  HP: 600.000  |  MP: 300.000  |  Dexterity: 750.000  |  Agility: 500.000  |  Strength: 900.000  |  Gold: 2546  |  
The inventory currently is:
The stats for this player are as follows:
Name: Flandal_Steelskin  |  Level: 7  |  HP: 700.000  |  MP: 200.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Undefeated_Yoj  |  Level: 7  |  HP: 700.000  |  MP: 400.000  |  Dexterity: 700.000  |  Agility: 400.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Eunoia_Cyn  |  Level: 6  |  HP: 600.000  |  MP: 400.000  |  Dexterity: 600.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Enter you team name:
helo
Enter you team size (cannot be greater than 3):
1
Enter the x position you want to start from:
0
Enter the y position you want to start from:
0
The position you entered is not accessible, please enter again
Enter the x position you want to start from:
0
Enter the y position you want to start from:
1
----------------------------------------------------------------------------------------------------------------------
5. Hero buys something from the market, fights a monster and looses
   Welcome to the Monsters and Heroes game!
   Enter the size of the world (e.g., 8 for an 8x8 world):
   9
   +---+---+---+---+---+---+---+---+---+
   |   | M | M | M |   |   |   | M |   |
   +---+---+---+---+---+---+---+---+---+
   |   |   | M | x | M |   | x | M | x |
   +---+---+---+---+---+---+---+---+---+
   | M |   |   |   | M | x |   | x |   |
   +---+---+---+---+---+---+---+---+---+
   | M | x | x |   |   | M | M |   | x |
   +---+---+---+---+---+---+---+---+---+
   |   | x |   | M | x | M |   |   | x |
   +---+---+---+---+---+---+---+---+---+
   |   | x |   | M |   | x | M | M | M |
   +---+---+---+---+---+---+---+---+---+
   |   |   |   |   | M |   |   |   | M |
   +---+---+---+---+---+---+---+---+---+
   |   |   |   |   | x |   |   | x | M |
   +---+---+---+---+---+---+---+---+---+
   |   |   |   | M | M | x |   | M |   |
   +---+---+---+---+---+---+---+---+---+
   Do you want to change the world (y/n)?
   n
   Here's a list of heroes you can choose from. Select your team of heroes (maximum 3 heroes):
   Paladins:
   The stats for this player are as follows:
   Name: Parzival  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Sehanine_Moonbow  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 700.000  |  Strength: 750.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Skoraeus_Stonebones  |  Level: 4  |  HP: 400.000  |  MP: 250.000  |  Dexterity: 350.000  |  Agility: 600.000  |  Strength: 650.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Garl_Glittergold  |  Level: 5  |  HP: 500.000  |  MP: 100.000  |  Dexterity: 400.000  |  Agility: 500.000  |  Strength: 600.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Amaryllis_Astra  |  Level: 5  |  HP: 500.000  |  MP: 500.000  |  Dexterity: 500.000  |  Agility: 500.000  |  Strength: 500.000  |  Gold: 2500  |  
   The inventory currently is:
   The stats for this player are as follows:
   Name: Caliber_Heist  |  Level: 8  |  HP: 800.000  |  MP: 400.000  |  Dexterity: 400.000  |  Agility: 400.000  |  Strength: 400.000  |  Gold: 2500  |  
   The inventory currently is:
----------------------------------------
Sorcerers:
The stats for this player are as follows:
Name: Rillifane_Rallathil  |  Level: 9  |  HP: 900.000  |  MP: 1,300.000  |  Dexterity: 500.000  |  Agility: 450.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Segojan_Earthcaller  |  Level: 5  |  HP: 500.000  |  MP: 900.000  |  Dexterity: 650.000  |  Agility: 500.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reign_Havoc  |  Level: 8  |  HP: 800.000  |  MP: 800.000  |  Dexterity: 800.000  |  Agility: 800.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reverie_Ashels  |  Level: 7  |  HP: 700.000  |  MP: 900.000  |  Dexterity: 400.000  |  Agility: 700.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Warriors:
The stats for this player are as follows:
Name: Gaerdal_Ironhand  |  Level: 7  |  HP: 700.000  |  MP: 100.000  |  Dexterity: 600.000  |  Agility: 500.000  |  Strength: 700.000  |  Gold: 1354  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Monnbow  |  Level: 8  |  HP: 800.000  |  MP: 600.000  |  Dexterity: 500.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Muamman_Duathall  |  Level: 6  |  HP: 600.000  |  MP: 300.000  |  Dexterity: 750.000  |  Agility: 500.000  |  Strength: 900.000  |  Gold: 2546  |  
The inventory currently is:
The stats for this player are as follows:
Name: Flandal_Steelskin  |  Level: 7  |  HP: 700.000  |  MP: 200.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Undefeated_Yoj  |  Level: 7  |  HP: 700.000  |  MP: 400.000  |  Dexterity: 700.000  |  Agility: 400.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Eunoia_Cyn  |  Level: 6  |  HP: 600.000  |  MP: 400.000  |  Dexterity: 600.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Enter you team name:
hello
Enter you team size (cannot be greater than 3):
1
Enter the x position you want to start from:
0
Enter the y position you want to start from:
0
Enter the name of the hero you want to select:
Reign_Havoc
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   | M | M | M |   |   |   | M |   |
+---+---+---+---+---+---+---+---+---+
|   |   | M | x | M |   | x | M | x |
+---+---+---+---+---+---+---+---+---+
| M |   |   |   | M | x |   | x |   |
+---+---+---+---+---+---+---+---+---+
| M | x | x |   |   | M | M |   | x |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M | x | M |   |   | x |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | M |   |   |   | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | x |   |   | x | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   | M | M | x |   | M |   |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 0, 1
You entered the market:
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   | M | M | M |   |   |   | M |   |
+---+---+---+---+---+---+---+---+---+
|   |   | M | x | M |   | x | M | x |
+---+---+---+---+---+---+---+---+---+
| M |   |   |   | M | x |   | x |   |
+---+---+---+---+---+---+---+---+---+
| M | x | x |   |   | M | M |   | x |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M | x | M |   |   | x |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | M |   |   |   | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | x |   |   | x | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   | M | M | x |   | M |   |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
m
Moving team to position: 0, 1
You entered the market:
Entering the market...
Welcome to the market
You can buy or sell items here


-------------------------------------- BUY/SELL/EXIT -----------------------------------------------
To buy items, enter 'buy' | To sell items, enter 'sell' | To exit the market, enter 'exit'
buy
Select Hero:
Heroes:
Reign_Havoc
Reign_Havoc
You chose:
The stats for this player are as follows:
Name: Reign_Havoc  |  Level: 8  |  HP: 800.000  |  MP: 800.000  |  Dexterity: 800.000  |  Agility: 800.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:


----------------------------------- BUY ITEMS ----------------------------------------------------
These are the items for sale
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
Enter the name of the item you want to buy
Spark_Needles
You bought Spark_Needles for 500 gold
Want to buy another item? Enter 'buy' | To exit the market, enter 'exit'
exit
Exiting the Market!!!
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   | M | M | M |   |   |   | M |   |
+---+---+---+---+---+---+---+---+---+
|   |   | M | x | M |   | x | M | x |
+---+---+---+---+---+---+---+---+---+
| M |   |   |   | M | x |   | x |   |
+---+---+---+---+---+---+---+---+---+
| M | x | x |   |   | M | M |   | x |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M | x | M |   |   | x |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | M |   |   |   | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | x |   |   | x | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   | M | M | x |   | M |   |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
i
--------------------------------------------------------

Display information about the world:
World size: 9
Number of inaccessible cells: ~20%
Number of market cells: ~50%
Number of common cells: ~30%

Display information about the controls:
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market

Display information about the heroes:

--------------------------------------------------------
The stats for this player are as follows:
Name: Reign_Havoc  |  Level: 8  |  HP: 800.000  |  MP: 800.000  |  Dexterity: 800.000  |  Agility: 800.000  |  Strength: 800.000  |  Gold: 2000  |  
The inventory currently is:
Spark_Needles
--------------------------------------------------------


Display information about the markets:
You can buy the following items:
These are the items for sale
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level

You cannot sell the following items:
These are the items that are sold out
| Spark_Needles | 500 gold | 2 level

--------------------------------------------------------
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   | M | M | M |   |   |   | M |   |
+---+---+---+---+---+---+---+---+---+
|   |   | M | x | M |   | x | M | x |
+---+---+---+---+---+---+---+---+---+
| M |   |   |   | M | x |   | x |   |
+---+---+---+---+---+---+---+---+---+
| M | x | x |   |   | M | M |   | x |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M | x | M |   |   | x |
+---+---+---+---+---+---+---+---+---+
|   | x |   | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | M |   |   |   | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | x |   |   | x | M |
+---+---+---+---+---+---+---+---+---+
|   |   |   | M | M | x |   | M |   |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 1, 1
A battle begins!
Battle between Reign_Havoc and Merrshaullk
Enter action for Reign_Havoc: (potion/spell/weapon/armor/information/attack)
attack
Merrshaullk attacks Reign_Havoc for 1000.0 damage.
Reign_Havoc has been defeated!
All heroes have been defeated!
You loose, better luck next time!
-------------------------------------------------------------------------------------------------------------
6. All heroes fight and loose
----------------------------------------------------------------------------------------
Welcome to the Monsters and Heroes game!
Enter the size of the world (e.g., 8 for an 8x8 world):
9
+---+---+---+---+---+---+---+---+---+
|   | x |   |   |   |   | M | M | M |
+---+---+---+---+---+---+---+---+---+
|   |   | x | x | M |   |   | x |   |
+---+---+---+---+---+---+---+---+---+
|   | M |   | x | x |   | M | M | x |
+---+---+---+---+---+---+---+---+---+
|   | x | M |   |   |   |   |   | x |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | M |   |   | M | x |
+---+---+---+---+---+---+---+---+---+
| M | x | M | M | M |   |   |   | M |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
| M | M |   |   | x | M | M |   | M |
+---+---+---+---+---+---+---+---+---+
|   |   | x |   | x |   |   | M | M |
+---+---+---+---+---+---+---+---+---+
Do you want to change the world (y/n)?
n
Here's a list of heroes you can choose from. Select your team of heroes (maximum 3 heroes):
Paladins:
The stats for this player are as follows:
Name: Parzival  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Moonbow  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 700.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skoraeus_Stonebones  |  Level: 4  |  HP: 400.000  |  MP: 250.000  |  Dexterity: 350.000  |  Agility: 600.000  |  Strength: 650.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Garl_Glittergold  |  Level: 5  |  HP: 500.000  |  MP: 100.000  |  Dexterity: 400.000  |  Agility: 500.000  |  Strength: 600.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Amaryllis_Astra  |  Level: 5  |  HP: 500.000  |  MP: 500.000  |  Dexterity: 500.000  |  Agility: 500.000  |  Strength: 500.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Caliber_Heist  |  Level: 8  |  HP: 800.000  |  MP: 400.000  |  Dexterity: 400.000  |  Agility: 400.000  |  Strength: 400.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Sorcerers:
The stats for this player are as follows:
Name: Rillifane_Rallathil  |  Level: 9  |  HP: 900.000  |  MP: 1,300.000  |  Dexterity: 500.000  |  Agility: 450.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Segojan_Earthcaller  |  Level: 5  |  HP: 500.000  |  MP: 900.000  |  Dexterity: 650.000  |  Agility: 500.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reign_Havoc  |  Level: 8  |  HP: 800.000  |  MP: 800.000  |  Dexterity: 800.000  |  Agility: 800.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reverie_Ashels  |  Level: 7  |  HP: 700.000  |  MP: 900.000  |  Dexterity: 400.000  |  Agility: 700.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Warriors:
The stats for this player are as follows:
Name: Gaerdal_Ironhand  |  Level: 7  |  HP: 700.000  |  MP: 100.000  |  Dexterity: 600.000  |  Agility: 500.000  |  Strength: 700.000  |  Gold: 1354  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Monnbow  |  Level: 8  |  HP: 800.000  |  MP: 600.000  |  Dexterity: 500.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Muamman_Duathall  |  Level: 6  |  HP: 600.000  |  MP: 300.000  |  Dexterity: 750.000  |  Agility: 500.000  |  Strength: 900.000  |  Gold: 2546  |  
The inventory currently is:
The stats for this player are as follows:
Name: Flandal_Steelskin  |  Level: 7  |  HP: 700.000  |  MP: 200.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Undefeated_Yoj  |  Level: 7  |  HP: 700.000  |  MP: 400.000  |  Dexterity: 700.000  |  Agility: 400.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Eunoia_Cyn  |  Level: 6  |  HP: 600.000  |  MP: 400.000  |  Dexterity: 600.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Enter you team name:
KashingIn
Enter you team size (cannot be greater than 3):
3
Enter the x position you want to start from:
0
Enter the y position you want to start from:
1
The position you entered is not accessible, please enter again
Enter the x position you want to start from:
0
Enter the y position you want to start from:
0
Enter the name of the hero you want to select:
Rillifane_Rallathil
Enter the name of the hero you want to select:
Sehanine_Monnbow
Enter the name of the hero you want to select:
Reverie_Ashels
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   | x |   |   |   |   | M | M | M |
+---+---+---+---+---+---+---+---+---+
|   |   | x | x | M |   |   | x |   |
+---+---+---+---+---+---+---+---+---+
|   | M |   | x | x |   | M | M | x |
+---+---+---+---+---+---+---+---+---+
|   | x | M |   |   |   |   |   | x |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | M |   |   | M | x |
+---+---+---+---+---+---+---+---+---+
| M | x | M | M | M |   |   |   | M |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
| M | M |   |   | x | M | M |   | M |
+---+---+---+---+---+---+---+---+---+
|   |   | x |   | x |   |   | M | M |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 0, 1
You can't go here
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   | x |   |   |   |   | M | M | M |
+---+---+---+---+---+---+---+---+---+
|   |   | x | x | M |   |   | x |   |
+---+---+---+---+---+---+---+---+---+
|   | M |   | x | x |   | M | M | x |
+---+---+---+---+---+---+---+---+---+
|   | x | M |   |   |   |   |   | x |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | M |   |   | M | x |
+---+---+---+---+---+---+---+---+---+
| M | x | M | M | M |   |   |   | M |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
| M | M |   |   | x | M | M |   | M |
+---+---+---+---+---+---+---+---+---+
|   |   | x |   | x |   |   | M | M |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 1, 0
No battle this time.
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   | x |   |   |   |   | M | M | M |
+---+---+---+---+---+---+---+---+---+
|   |   | x | x | M |   |   | x |   |
+---+---+---+---+---+---+---+---+---+
|   | M |   | x | x |   | M | M | x |
+---+---+---+---+---+---+---+---+---+
|   | x | M |   |   |   |   |   | x |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | M |   |   | M | x |
+---+---+---+---+---+---+---+---+---+
| M | x | M | M | M |   |   |   | M |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
| M | M |   |   | x | M | M |   | M |
+---+---+---+---+---+---+---+---+---+
|   |   | x |   | x |   |   | M | M |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
a
You cannot move outside the world!
Enter your command (WASD for movement, Q to quit):
s
Moving team to position: 2, 0
No battle this time.
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+---+
|   | x |   |   |   |   | M | M | M |
+---+---+---+---+---+---+---+---+---+
|   |   | x | x | M |   |   | x |   |
+---+---+---+---+---+---+---+---+---+
|   | M |   | x | x |   | M | M | x |
+---+---+---+---+---+---+---+---+---+
|   | x | M |   |   |   |   |   | x |
+---+---+---+---+---+---+---+---+---+
|   |   |   |   | M |   |   | M | x |
+---+---+---+---+---+---+---+---+---+
| M | x | M | M | M |   |   |   | M |
+---+---+---+---+---+---+---+---+---+
| x | M | x |   |   |   | M |   |   |
+---+---+---+---+---+---+---+---+---+
| M | M |   |   | x | M | M |   | M |
+---+---+---+---+---+---+---+---+---+
|   |   | x |   | x |   |   | M | M |
+---+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 3, 0
A battle begins!
Battle between Rillifane_Rallathil and Ereshkigall
Enter action for Rillifane_Rallathil: (potion/spell/weapon/armor/information/attack)
attack
Ereshkigall attacks Rillifane_Rallathil for 950.0 damage.
Rillifane_Rallathil has been defeated!
Battle between Sehanine_Monnbow and Ereshkigall
Enter action for Sehanine_Monnbow: (potion/spell/weapon/armor/information/attack)
attack
Ereshkigall attacks Sehanine_Monnbow for 950.0 damage.
Sehanine_Monnbow has been defeated!
Battle between Reverie_Ashels and Ereshkigall
Enter action for Reverie_Ashels: (potion/spell/weapon/armor/information/attack)
attack
Ereshkigall attacks Reverie_Ashels for 950.0 damage.
Reverie_Ashels has been defeated!
All heroes have been defeated!
You loose, better luck next time!
---------------------------------------------------------------------------------------------------------------------
7. Hero Wins.
Welcome to the Monsters and Heroes game!
Enter the size of the world (e.g., 8 for an 8x8 world):
8
+---+---+---+---+---+---+---+---+
|   | M | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | x | M |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   |   | M | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x |   |   |   | x |   |
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   |   |
+---+---+---+---+---+---+---+---+
Do you want to change the world (y/n)?
n
Here's a list of heroes you can choose from. Select your team of heroes (maximum 3 heroes):
Paladins:
The stats for this player are as follows:
Name: Parzival  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Moonbow  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 700.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skoraeus_Stonebones  |  Level: 4  |  HP: 400.000  |  MP: 250.000  |  Dexterity: 350.000  |  Agility: 600.000  |  Strength: 650.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Garl_Glittergold  |  Level: 5  |  HP: 500.000  |  MP: 100.000  |  Dexterity: 400.000  |  Agility: 500.000  |  Strength: 600.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Amaryllis_Astra  |  Level: 5  |  HP: 500.000  |  MP: 500.000  |  Dexterity: 500.000  |  Agility: 500.000  |  Strength: 500.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Caliber_Heist  |  Level: 8  |  HP: 800.000  |  MP: 400.000  |  Dexterity: 400.000  |  Agility: 400.000  |  Strength: 400.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Sorcerers:
The stats for this player are as follows:
Name: Rillifane_Rallathil  |  Level: 9  |  HP: 900.000  |  MP: 1,300.000  |  Dexterity: 500.000  |  Agility: 450.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Segojan_Earthcaller  |  Level: 5  |  HP: 500.000  |  MP: 900.000  |  Dexterity: 650.000  |  Agility: 500.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reign_Havoc  |  Level: 8  |  HP: 800.000  |  MP: 800.000  |  Dexterity: 800.000  |  Agility: 800.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reverie_Ashels  |  Level: 7  |  HP: 700.000  |  MP: 900.000  |  Dexterity: 400.000  |  Agility: 700.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Warriors:
The stats for this player are as follows:
Name: Gaerdal_Ironhand  |  Level: 7  |  HP: 700.000  |  MP: 100.000  |  Dexterity: 600.000  |  Agility: 500.000  |  Strength: 700.000  |  Gold: 1354  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Monnbow  |  Level: 8  |  HP: 800.000  |  MP: 600.000  |  Dexterity: 500.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Muamman_Duathall  |  Level: 6  |  HP: 600.000  |  MP: 300.000  |  Dexterity: 750.000  |  Agility: 500.000  |  Strength: 900.000  |  Gold: 2546  |  
The inventory currently is:
The stats for this player are as follows:
Name: Flandal_Steelskin  |  Level: 7  |  HP: 700.000  |  MP: 200.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Undefeated_Yoj  |  Level: 7  |  HP: 700.000  |  MP: 400.000  |  Dexterity: 700.000  |  Agility: 400.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Eunoia_Cyn  |  Level: 6  |  HP: 600.000  |  MP: 400.000  |  Dexterity: 600.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Enter you team name:
Sehanine_Monnbow
Enter you team size (cannot be greater than 3):
1
Enter the x position you want to start from:
0
Enter the y position you want to start from:
0
Enter the name of the hero you want to select:
Sehanine_Monnbow
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
|   | M | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | x | M |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   |   | M | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x |   |   |   | x |   |
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   |   |
+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 0, 1
You entered the market:
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
|   | M | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | x | M |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   |   | M | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x |   |   |   | x |   |
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   |   |
+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 0, 2
You entered the market:
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
|   | M | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | x | M |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   |   | M | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x |   |   |   | x |   |
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   |   |
+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 1, 2
You can't go here
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
|   | M | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | x | M |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   |   | M | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x |   |   |   | x |   |
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   |   |
+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 1, 2
You can't go here
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
|   | M | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | x | M |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   |   | M | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x |   |   |   | x |   |
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   |   |
+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 1, 2
You can't go here
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
|   | M | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | x | M |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   |   | M | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x |   |   |   | x |   |
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   |   |
+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 2, 1
A battle begins!
Battle between Sehanine_Monnbow and BigBad-Wolf
The stats for this player are as follows:
Name: Sehanine_Monnbow  |  Level: 8  |  HP: 800.000  |  MP: 600.000  |  Dexterity: 500.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this monster are as follows:
Name: BigBad-Wolf  |  Level: 7  |  HP: 100.000  |  Base-Damage: 150.000  |  Defence-Value: 250.000  |  Dodge-Agility: 15.000  |  
Enter action for Sehanine_Monnbow: (potion/spell/weapon/armor/information/attack)
attack
Sehanine_Monnbow attacks BigBad-Wolf for 700.0 damage.
Sehanine_Monnbow has defeated BigBad-Wolf!
All monsters have been defeated!
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
|   | M | M |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
|   |   | x | M |   |   | x | M |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   |   | M | x |   |
+---+---+---+---+---+---+---+---+
| M |   | x |   |   |   | x |   |
+---+---+---+---+---+---+---+---+
|   |   | x |   | M |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | x | M | x |
+---+---+---+---+---+---+---+---+
| x |   |   | M | M |   |   |   |
+---+---+---+---+---+---+---+---+
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
q
Quitting the game...
You have defeated the monsters and saved the world. You are now a legend. You are now a hero. You are now a champion
Thank you for playing!
------------------------------------------------------------------------------------------------------------------------------

8. Bougth an item, couldnt buy another item because it was level was too low, engaged in a battle, one hero dies and the other one wins,
the heroes are revived and leveled up another battle happens, the heros win and then I quit the game.

/Users/arkashjain/Library/Java/JavaVirtualMachines/openjdk-19.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=49487:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/arkashjain/Desktop/Spring 2023/CS 611/Monsters_and_Heroes_hw/out/production/Monsters_and_Heroes_hw Main
In a mystical world, sorcers, paladins and warrior clans kept fighting amongst themselves for dominance.
The world was in imbalance until one day ......They came!
These monster - dragons, spirits and exoskeletons - the likes of whom were never seen below came to conquer this world.
All hope isn't lost yet because these heroes are the only ones strong enough to stop them.
----------------------------------------------------------------------------------------
You have been chosen to protect this planet from this evil doers. You are to pick a team of 3, should you choose to accept,
to go on a quest to fight these monsters. The all knowing oracle will be floating around the world with you as the symbol i, standing for intelligence,
Intransigence and intrepid.
Before you were dragged into this war, clan merchants and citizens collected ancient items like armors, potions
and spells to help you in your quest. As you go through the world, you will find your kin in markets where you can buy those materials
to beat those monsters
NOW GO AHEAD AND RECLAIM THIS WORLD
----------------------------------------------------------------------------------------
Welcome to the Monsters and Heroes game!
Enter the size of the world (e.g., 8 for an 8x8 world):
8
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Do you want to change the world (y/n)?
n
Here's a list of heroes you can choose from. Select your team of heroes (maximum 3 heroes):
Paladins:
The stats for this player are as follows:
Name: Parzival  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Moonbow  |  Level: 7  |  HP: 700.000  |  MP: 300.000  |  Dexterity: 700.000  |  Agility: 700.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skoraeus_Stonebones  |  Level: 4  |  HP: 400.000  |  MP: 250.000  |  Dexterity: 350.000  |  Agility: 600.000  |  Strength: 650.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Garl_Glittergold  |  Level: 5  |  HP: 500.000  |  MP: 100.000  |  Dexterity: 400.000  |  Agility: 500.000  |  Strength: 600.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Amaryllis_Astra  |  Level: 5  |  HP: 500.000  |  MP: 500.000  |  Dexterity: 500.000  |  Agility: 500.000  |  Strength: 500.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Caliber_Heist  |  Level: 8  |  HP: 800.000  |  MP: 400.000  |  Dexterity: 400.000  |  Agility: 400.000  |  Strength: 400.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Sorcerers:
The stats for this player are as follows:
Name: Rillifane_Rallathil  |  Level: 9  |  HP: 900.000  |  MP: 1,300.000  |  Dexterity: 500.000  |  Agility: 450.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Segojan_Earthcaller  |  Level: 5  |  HP: 500.000  |  MP: 900.000  |  Dexterity: 650.000  |  Agility: 500.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reign_Havoc  |  Level: 8  |  HP: 800.000  |  MP: 800.000  |  Dexterity: 800.000  |  Agility: 800.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Reverie_Ashels  |  Level: 7  |  HP: 700.000  |  MP: 900.000  |  Dexterity: 400.000  |  Agility: 700.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Warriors:
The stats for this player are as follows:
Name: Gaerdal_Ironhand  |  Level: 7  |  HP: 700.000  |  MP: 100.000  |  Dexterity: 600.000  |  Agility: 500.000  |  Strength: 700.000  |  Gold: 1354  |  
The inventory currently is:
The stats for this player are as follows:
Name: Sehanine_Monnbow  |  Level: 8  |  HP: 800.000  |  MP: 600.000  |  Dexterity: 500.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Muamman_Duathall  |  Level: 6  |  HP: 600.000  |  MP: 300.000  |  Dexterity: 750.000  |  Agility: 500.000  |  Strength: 900.000  |  Gold: 2546  |  
The inventory currently is:
The stats for this player are as follows:
Name: Flandal_Steelskin  |  Level: 7  |  HP: 700.000  |  MP: 200.000  |  Dexterity: 700.000  |  Agility: 650.000  |  Strength: 750.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Undefeated_Yoj  |  Level: 7  |  HP: 700.000  |  MP: 400.000  |  Dexterity: 700.000  |  Agility: 400.000  |  Strength: 800.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this player are as follows:
Name: Eunoia_Cyn  |  Level: 6  |  HP: 600.000  |  MP: 400.000  |  Dexterity: 600.000  |  Agility: 800.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
----------------------------------------
Enter you team name:
kashIN
Enter you team size (cannot be greater than 3):
2
Enter the x position you want to start from:
1
Enter the y position you want to start from:
1
Enter the name of the hero you want to select:
Skye_Soar
Enter the name of the hero you want to select:
Kalabar
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Team position: 1, 1
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
m
Moving team to position: 1, 1
You entered the market:
Entering the market...
Welcome to the market
You can buy or sell items here


-------------------------------------- BUY/SELL/EXIT -----------------------------------------------
To buy items, enter 'buy' | To sell items, enter 'sell' | To exit the market, enter 'exit'
buy
Select Hero:
Heroes:
Skye_Soar
Kalabar
Kalabar
You chose:
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 2500  |  
The inventory currently is:


----------------------------------- BUY ITEMS ----------------------------------------------------
These are the items for sale
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
Enter the name of the item you want to buy
Scythe
You bought Scythe for 1000 gold
Want to buy another item? Enter 'buy' | To exit the market, enter 'exit'
buy
Select Hero:
Heroes:
Skye_Soar
Kalabar
Kalabar
You chose:
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 1500  |  
The inventory currently is:
Scythe


----------------------------------- BUY ITEMS ----------------------------------------------------
These are the items for sale
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
| Platinum_Shield | 150 gold | 1 level
| Breastplate | 350 gold | 3 level
| Full_Body_Armor | 1000 gold | 8 level
| Wizard_Shield | 1200 gold | 10 level
| Guardian_Angel | 1000 gold | 10 level
| Healing_Potion | 250 gold | 1 level
| Strength_Potion | 200 gold | 1 level
| Magic_Potion | 350 gold | 2 level
| Luck_Elixir | 500 gold | 4 level
| Mermaid_Tears | 850 gold | 5 level
| Ambrosia | 1000 gold | 8 level
| Sword | 500 gold | 1 level
| Bow | 300 gold | 2 level
| Scythe | 1000 gold | 6 level
| Axe | 550 gold | 5 level
| TSwords | 1400 gold | 8 level
| Dagger | 200 gold | 1 level
| Flame_Tornado | 700 gold | 4 level
| Breath_of_Fire | 350 gold | 1 level
| Heat_Wave | 450 gold | 2 level
| Lava_Comet | 800 gold | 7 level
| Hell_Storm | 600 gold | 3 level
| Snow_Cannon | 500 gold | 2 level
| Ice_Blade | 250 gold | 1 level
| Frost_Blizzard | 750 gold | 5 level
| Arctic_Storm | 700 gold | 6 level
| Lightning_Dagger | 400 gold | 1 level
| Thunder_Blast | 750 gold | 4 level
| Electric_Arrows | 550 gold | 5 level
| Spark_Needles | 500 gold | 2 level
Enter the name of the item you want to buy
Full_Body_Armor
Want to buy another item? Enter 'buy' | To exit the market, enter 'exit'
exit
Exiting the Market!!!
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Team position: 1, 1
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 1, 2
A battle begins!
Battle between Skye_Soar and St-Shargaas
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 500.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Skye_Soar: (potion/spell/weapon/armor/information/attack)
armor
You don't have any armors.
Battle between Skye_Soar and St-Shargaas
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 500.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Skye_Soar: (potion/spell/weapon/armor/information/attack)
attack
Skye_Soar attacks St-Shargaas for 700.0 damage.
Battle between Skye_Soar and St-Shargaas
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 450.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Skye_Soar: (potion/spell/weapon/armor/information/attack)
attack
Skye_Soar attacks St-Shargaas for 700.0 damage.
Battle between Skye_Soar and St-Shargaas
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 400.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Skye_Soar: (potion/spell/weapon/armor/information/attack)
attack
Battle between Skye_Soar and St-Shargaas
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 500.000  |  MP: 1,000.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 400.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Skye_Soar: (potion/spell/weapon/armor/information/attack)
attack
Skye_Soar attacks St-Shargaas for 700.0 damage.
St-Shargaas attacks Skye_Soar for 550.0 damage.
Skye_Soar has been defeated!
Battle between Kalabar and St-Shargaas
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 1500  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 350.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Kalabar: (potion/spell/weapon/armor/information/attack)
attack
Battle between Kalabar and St-Shargaas
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 1500  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 350.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Kalabar: (potion/spell/weapon/armor/information/attack)
information
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 1500  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 350.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Battle between Kalabar and St-Shargaas
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 1500  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 350.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Kalabar: (potion/spell/weapon/armor/information/attack)
armor
You don't have any armors.
Battle between Kalabar and St-Shargaas
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 1500  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 350.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Kalabar: (potion/spell/weapon/armor/information/attack)
weapon
You don't have any weapons.
Battle between Kalabar and St-Shargaas
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 1500  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 350.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Kalabar: (potion/spell/weapon/armor/information/attack)
attack
Kalabar attacks St-Shargaas for 850.0 damage.
Battle between Kalabar and St-Shargaas
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 1500  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: St-Shargaas  |  Level: 5  |  HP: 150.000  |  Base-Damage: 550.000  |  Defence-Value: 650.000  |  Dodge-Agility: 55.000  |  
Enter action for Kalabar: (potion/spell/weapon/armor/information/attack)
attack
Kalabar attacks St-Shargaas for 850.0 damage.
Kalabar has defeated St-Shargaas!
Battle between Kalabar and Chrysophylax
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 600.000  |  Agility: 400.000  |  Strength: 850.000  |  Gold: 1500  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: Chrysophylax  |  Level: 5  |  HP: 200.000  |  Base-Damage: 200.000  |  Defence-Value: 500.000  |  Dodge-Agility: 20.000  |  
Enter action for Kalabar: (potion/spell/weapon/armor/information/attack)
attack
Kalabar attacks Chrysophylax for 850.0 damage.
Kalabar has defeated Chrysophylax!
All monsters have been defeated!
The stats for this player are as follows:
Name: Kalabar  |  Level: 6  |  HP: 600.000  |  MP: 800.000  |  Dexterity: 630.000  |  Agility: 420.000  |  Strength: 892.500  |  Gold: 2000  |  
The inventory currently is:
Scythe
You have gotten a skills upgrade!
The stats for this player are as follows:
Name: Kalabar  |  Level: 7  |  HP: 660.000  |  MP: 880.000  |  Dexterity: 630.000  |  Agility: 420.000  |  Strength: 892.500  |  Gold: 2000  |  
The inventory currently is:
Scythe
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Team position: 1, 2
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 2, 2
You entered the market:
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Team position: 2, 2
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 3, 2
No battle this time.
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Team position: 3, 2
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
d
Moving team to position: 3, 3
You can't go here
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Team position: 2, 2
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
a
Moving team to position: 2, 1
No battle this time.
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Team position: 2, 1
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 3, 1
No battle this time.
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Team position: 3, 1
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 4, 1
You entered the market:
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Team position: 4, 1
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
s
Moving team to position: 5, 1
A battle begins!
Battle between Skye_Soar and Kas-Ethelinh
The stats for this player are as follows:
Name: Skye_Soar  |  Level: 5  |  HP: 110.000  |  MP: 1,100.000  |  Dexterity: 500.000  |  Agility: 400.000  |  Strength: 700.000  |  Gold: 2500  |  
The inventory currently is:
The stats for this monster are as follows:
Name: Kas-Ethelinh  |  Level: 6  |  HP: 500.000  |  Base-Damage: 600.000  |  Defence-Value: 500.000  |  Dodge-Agility: 60.000  |  
Enter action for Skye_Soar: (potion/spell/weapon/armor/information/attack)
attack
Skye_Soar attacks Kas-Ethelinh for 700.0 damage.
Kas-Ethelinh attacks Skye_Soar for 600.0 damage.
Skye_Soar has been defeated!
Battle between Kalabar and Kas-Ethelinh
The stats for this player are as follows:
Name: Kalabar  |  Level: 7  |  HP: 660.000  |  MP: 880.000  |  Dexterity: 630.000  |  Agility: 420.000  |  Strength: 892.500  |  Gold: 2000  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: Kas-Ethelinh  |  Level: 6  |  HP: 300.000  |  Base-Damage: 600.000  |  Defence-Value: 500.000  |  Dodge-Agility: 60.000  |  
Enter action for Kalabar: (potion/spell/weapon/armor/information/attack)
attack
Kas-Ethelinh attacks Kalabar for 600.0 damage.
Battle between Kalabar and Kas-Ethelinh
The stats for this player are as follows:
Name: Kalabar  |  Level: 7  |  HP: 60.000  |  MP: 880.000  |  Dexterity: 630.000  |  Agility: 420.000  |  Strength: 892.500  |  Gold: 2000  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: Kas-Ethelinh  |  Level: 6  |  HP: 300.000  |  Base-Damage: 600.000  |  Defence-Value: 500.000  |  Dodge-Agility: 60.000  |  
Enter action for Kalabar: (potion/spell/weapon/armor/information/attack)
attack
Kalabar attacks Kas-Ethelinh for 892.5 damage.
Kalabar has defeated Kas-Ethelinh!
Battle between Kalabar and Andrealphus
The stats for this player are as follows:
Name: Kalabar  |  Level: 7  |  HP: 60.000  |  MP: 880.000  |  Dexterity: 630.000  |  Agility: 420.000  |  Strength: 892.500  |  Gold: 2000  |  
The inventory currently is:
Scythe
The stats for this monster are as follows:
Name: Andrealphus  |  Level: 6  |  HP: 200.000  |  Base-Damage: 600.000  |  Defence-Value: 500.000  |  Dodge-Agility: 40.000  |  
Enter action for Kalabar: (potion/spell/weapon/armor/information/attack)
attack
Kalabar attacks Andrealphus for 892.5 damage.
Kalabar has defeated Andrealphus!
All monsters have been defeated!
The stats for this player are as follows:
Name: Kalabar  |  Level: 7  |  HP: 60.000  |  MP: 880.000  |  Dexterity: 661.500  |  Agility: 441.000  |  Strength: 937.125  |  Gold: 2600  |  
The inventory currently is:
Scythe
You have gotten a skills upgrade!
The stats for this player are as follows:
Name: Kalabar  |  Level: 8  |  HP: 66.000  |  MP: 968.000  |  Dexterity: 661.500  |  Agility: 441.000  |  Strength: 937.125  |  Gold: 2600  |  
The inventory currently is:
Scythe
W | w - Move up
S | s - Move down
D | d - Move right
A | a - Move left
Q | q - Quit the game
I | i - Display information about the heroes
M | m - Enter the market
+---+---+---+---+---+---+---+---+
| x |   | M | M | x |   |   | x |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | x |   |   |
+---+---+---+---+---+---+---+---+
| M |   | M | x | M |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | x | x |   | x |   |
+---+---+---+---+---+---+---+---+
| x | M | M |   |   | x |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   |   | x | M | M | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   | M |   | x | M |   |
+---+---+---+---+---+---+---+---+
Team position: 5, 1
Enter your command (WASD for movement, Q to quit, I for info, M to enter market):
q
Quitting the game...
You have defeated the monsters and saved the world. You are now a legend. You are now a hero. You are now a champion
Thank you for playing!

Process finished with exit code 0
------------------------------------------------------------------------------------------------------------------------

9. 
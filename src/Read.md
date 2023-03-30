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
3. 
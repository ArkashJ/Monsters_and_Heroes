package main.Battle;
/*
 The class defines the rules of battle in this game
 The user is asked to choose a team of heroes, maximum being 3. The heroes are then placed in a random order and they
 move around the world in the world class. At a common space, every cell the user enter is either inaccessible, a market
 or a common space. If the user enters a common space, a probability generator is used to determine if a battle will occur which is
 handled by the cell class. If the battle begins, use the following rule to spawn the level of monsters
 sum of HP of Heroes / 100 * number of heroes = probability, the higher the probability, the higher the level of monsters
 */
import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;
import main.Teams.TeamHeroes;
import main.Teams.TeamMonsters;
public class Battle {
}

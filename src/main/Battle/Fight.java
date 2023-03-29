package main.Battle;

import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;
import main.FightRules.FightRules;
import main.LoadData.LoadData;

import java.util.*;

import static main.Colors.colors.colorText;

public class Fight{
    private FightRules fightRules;
    private LoadData loadData;
    public Fight() {
        fightRules = new FightRules();
    }
    // -------------------------------------------------------------------------------------
    public void battle(ArrayList<Heroes> heroesList, Monsters monsters) {
        ArrayList<Monsters> monstersList = createMonstersList(heroesList.size());
        fightRules.determineMonsterLevel(heroesList, monsters);
        int heroesIndex = 0;
        boolean battleEnded = false;
        Scanner inputScanner = new Scanner(System.in);

        while (!battleEnded) {
            Heroes hero = heroesList.get(heroesIndex);
            double heroDodgeChance = fightRules.getDodgeChance(hero);
            double monsterDodgeChance = fightRules.getDodgeChance(monsters);

            // Prompt user to enter action
            System.out.println("Enter action for " + hero.getName() + ": (potion/spell/weapon/armor/information)");
            String action = inputScanner.nextLine().toLowerCase();

            switch (action) {
                case "potion":
                    // Code to use potion
                    break;
                case "spell":
                    // Code to use spell
                    break;
                case "weapon":
                    // Code to use weapon
                    break;
                case "armor":
                    // Code to use armor
                    break;
                case "information":
                    // Provide the requested information
                    System.out.println(hero);
                    System.out.println(monsters);
                    continue;
                default:
                    System.out.println("Invalid action. Try again.");
                    continue;
            }

            // Check if the hero dodges
            if (Math.random() > heroDodgeChance) {
                double attackDamage = fightRules.attackDamage(hero);
                monsters.takeDamage(attackDamage);
                System.out.println(colorText(hero.getName() + " attacks ", "yellow" ) + colorText( monsters.getName() + " for ", "blue" )+ colorText( attackDamage + " damage.", "red"));
            }

            // If the monster's HP is 0 or less, the battle is won
            if (monsters.getHP() <= 0) {
                fightRules.goldGain(hero, monsters);
                fightRules.expGain(hero, monsters);
                fightRules.recoverFromBattle(hero);
                System.out.println(colorText(hero.getName() + " has defeated ", "black") + colorText(monsters.getName() + "!", "purple"));
                battleEnded = true;
                break;
            }

            // Check if the monster dodges
            if (Math.random() > monsterDodgeChance) {
                double monsterAttackDamage = monsters.getBaseDamage();
                hero.takeDamage(monsterAttackDamage);
                System.out.println(colorText(monsters.getName() + " attacks ", "blue") + colorText(hero.getName() + " for ", "yellow") + colorText(monsterAttackDamage + " damage.", "red"));
            }

            // If the hero's HP is 0 or less, the hero is defeated
            if (hero.getHP() <= 0) {
                heroesIndex++;
                System.out.println(colorText(hero.getName() + " has been defeated!", "gray"));
                // If there are no more heroes, the battle is lost
                if (heroesIndex >= heroesList.size()) {
                    System.out.println(colorText("All heroes have been defeated!", "red"));
                    battleEnded = true;
                }
            }
        }
    }

    // -------------------------------------------------------------------------------------
    public void reviveHeroes(ArrayList<Heroes> heroesList) {
        for (Heroes hero : heroesList) {
            if (hero.getHP() <= 0) {
                hero.revive();
                fightRules.recoverFromBattle(hero);
            }
        }
    }
    // -------------------------------------------------------------------------------------
    public ArrayList<Monsters> createMonstersList(int numberOfHeroes) {
        ArrayList<Monsters> monstersList = new ArrayList<>();
        List<Monsters> Exoskeletons = loadData.getExoskeletons();
        List<Monsters> Spirits = loadData.getSpirits();
        List<Monsters> Dragons = loadData.getDragons();

        Random random = new Random();

        for (int i = 0; i < numberOfHeroes; i++) {
            Set<Integer> monsterTypes = new HashSet<>(Arrays.asList(0, 1, 2));
            int randomType = random.nextInt(monsterTypes.size());
            monsterTypes.remove(randomType);

            List<Monsters> currentType;
            if (randomType == 0) {
                currentType = Exoskeletons;
            } else if (randomType == 1) {
                currentType = Spirits;
            } else {
                currentType = Dragons;
            }

            int randomIndex = random.nextInt(currentType.size());
            Monsters randomMonster = currentType.get(randomIndex);
            monstersList.add(randomMonster);
        }

        return monstersList;
    }
    // -------------------------------------------------------------------------------------
}

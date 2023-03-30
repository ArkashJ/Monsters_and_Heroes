package main.Battle;

import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;
import main.FightRules.FightRules;
import main.Items.Armors;
import main.Items.Potions;
import main.Items.Spells.Spells;
import main.Items.Weapons;
import main.LoadData.LoadData;
import main.Teams.TeamHeroes;

import java.util.*;

import static main.Colors.colors.colorText;
import static main.FightRules.FightRules.heroSkillsUpgrade;

public class Fight{
    private FightRules fightRules;
    private LoadData loadData;
    private boolean lost = false;
    public Fight() {
        fightRules = new FightRules();
        loadData = new LoadData();
    }
    // -------------------------------------------------------------------------------------
    public boolean battle(TeamHeroes heroesList) {
        ArrayList<Monsters> monstersList = createMonstersList(heroesList.getSize());
        fightRules.determineMonsterLevel(heroesList, monstersList);
        int heroesIndex = 0;
        int monstersIndex = 0;
        boolean battleEnded = false;
        Scanner inputScanner = new Scanner(System.in);

        while (!battleEnded) {
            Heroes hero = heroesList.get(heroesIndex);
            Monsters monsters = monstersList.get(monstersIndex);
            System.out.println(colorText("Battle between ", "black") + colorText(hero.getName(), "yellow") + colorText(" and ", "black") + colorText(monsters.getName(), "blue"));
            double heroDodgeChance = fightRules.getDodgeChance(hero);
            double monsterDodgeChance = fightRules.getDodgeChance(monsters);
            double damageReduction = 0;
            hero.printStats();
            monsters.printStats();
            // Prompt user to enter action
            System.out.println("Enter action for " + hero.getName() + ": (potion/spell/weapon/armor/information/attack)");
            String action = inputScanner.nextLine().toLowerCase();

            while (!action.equals("potion") && !action.equals("spell") && !action.equals("weapon") && !action.equals("armor") && !action.equals("information") && !action.equals("attack")) {
                System.out.println("Invalid action. Try again.");
                action = inputScanner.nextLine().toLowerCase();
            }

            switch (action) {
                case "potion" -> {
                    // Code to use potion
                    Potions potion = (Potions) hero.getInventory().getItem("Potion");
                    if (potion != null) {
                        fightRules.usePotion(hero, potion);
//                        hero.getInventory().removeItem(potion.getName());
                    } else {
                        System.out.println("You don't have any potions.");
                    }
                }
                case "spell" -> {
                    // Code to use spell
                    Spells spell = (Spells) hero.getInventory().getItem("Spell");
                    if (spell != null) {
                        fightRules.useSpell(hero, spell, monsters);
    //                        hero.getInventory().removeItem(spell.getName());
                    } else {
                        System.out.println("You don't have any spells.");
                    }
                }
                case "weapon" -> {
                    // Code to use weapon
                    Weapons weapons = (Weapons) hero.getInventory().getItem("Weapon");
                    if (weapons != null) {
                        fightRules.useWeapon(hero, weapons, monsters);
//                        hero.getInventory().removeItem(weapons.getName());
                    } else {
                        System.out.println("You don't have any weapons.");
                    }
                }
                case "armor" -> {
                    // Code to use armor
                    Armors armors = (Armors) hero.getInventory().getItem("Armor");
                    if (armors != null) {
                        damageReduction = fightRules.useArmor(hero, armors);
                        monsters.setBaseDamage(monsters.getBaseDamage() - damageReduction);
//                        hero.getInventory().removeItem(armors.getName());
                    } else {
                        System.out.println("You don't have any armors.");
                    }
                }
                case "information" -> {
                    // Provide the requested information
                    hero.printStats();
                    monsters.printStats();
                }
                case "attack" ->{
                    // Check if the hero dodges
                    if (Math.random() > monsterDodgeChance) {
                        double attackDamage = fightRules.attackDamage(hero);
                        monsters.takeDamage(attackDamage);
                        System.out.println(colorText(hero.getName() + " attacks ", "yellow" ) + colorText( monsters.getName() + " for ", "blue" )+ colorText( attackDamage + " damage.", "red"));
                    }

                    // If the monster's HP is 0 or less, the battle is won
                    if (monsters.getHP() <= 0) {
                        monstersIndex++;
                        System.out.println(colorText(hero.getName() + " has defeated ", "black") + colorText(monsters.getName() + "!", "purple"));
                        // If there are no more monsters, the battle is won
                        if (monstersIndex >= monstersList.size()) {
                            System.out.println(colorText("All monsters have been defeated!", "green"));
                            battleEnded = true;
                            lost = false;
                            reviveHeroes(heroesList);
                            fightRules.goldGain(hero, monsters);
                            fightRules.expGain(hero, monsters);
                            heroSkillsUpgrade(hero);
                            hero.printStats();
                            System.out.println("You have gotten a skills upgrade!");
                            int levelUpExpNeeded = fightRules.expToNextLevel(hero);

                            if (hero.getExperience() >= levelUpExpNeeded) {
                                fightRules.levelUp(hero);
                                fightRules.updateManaAtLevelUP(hero);
                                fightRules.updateHPAtLevelUP(hero);
                                hero.printStats();
                            }
                            break;
                        }
                    }

                    // Check if the monster dodges
                    if (Math.random() > heroDodgeChance) {
                        double monsterAttackDamage = monsters.getBaseDamage();
//                        Armors armor = (Armors) hero.getInventory().getItem("Armor");
                        hero.takeDamage(monsterAttackDamage);
                        System.out.println(colorText(monsters.getName() + " attacks ", "blue") + colorText(hero.getName() + " for ", "yellow") + colorText(monsterAttackDamage + " damage.", "red"));
                    }

                    // If the hero's HP is 0 or less, the hero is defeated
                    if (hero.getHP() <= 0) {
                        heroesIndex++;
                        System.out.println(colorText(hero.getName() + " has been defeated!", "gray"));
                        // If there are no more heroes, the battle is lost
                        if (heroesIndex >= heroesList.getSize()) {
                            System.out.println(colorText("All heroes have been defeated!", "red"));
                            battleEnded = true;
                            lost = true;
                        }
                    }
                    continue;
                }

                default -> {
                    System.out.println("Invalid action. Try again.");
                    continue;
                }
            }
//
        }
        return lost;
    }

    // -------------------------------------------------------------------------------------
    public void reviveHeroes(TeamHeroes heroesList) {
        for (Heroes hero : heroesList.getHeroes()) {
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

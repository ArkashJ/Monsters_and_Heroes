package main.Battle;

import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;
import main.FightRules.FightRules;
import java.util.ArrayList;

public class Fight{
    private FightRules fightRules;

    public Fight() {
        fightRules = new FightRules();
    }

    public void battle(ArrayList<Heroes> heroesList, Monsters monsters) {
        fightRules.determineMonsterLevel(heroesList, monsters);
        int heroesIndex = 0;
        boolean battleEnded = false;

        while (!battleEnded) {
            Heroes hero = heroesList.get(heroesIndex);
            double heroDodgeChance = fightRules.getDodgeChance(hero);
            double monsterDodgeChance = fightRules.getDodgeChance(monsters);

            // Check if the hero dodges
            if (Math.random() > heroDodgeChance) {
                double attackDamage = fightRules.attackDamage(hero);
                monsters.takeDamage(attackDamage);
            }

            // If the monster's HP is 0 or less, the battle is won
            if (monsters.getHP() <= 0) {
                fightRules.goldGain(hero, monsters);
                fightRules.expGain(hero, monsters);
                fightRules.recoverFromBattle(hero);
                battleEnded = true;
                break;
            }

            // Check if the monster dodges
            if (Math.random() > monsterDodgeChance) {
                double monsterAttackDamage = monsters.getAttackDamage();
                hero.takeDamage(monsterAttackDamage);
            }

            // If the hero's HP is 0 or less, the hero is defeated
            if (hero.getHP() <= 0) {
                heroesIndex++;

                // If there are no more heroes, the battle is lost
                if (heroesIndex >= heroesList.size()) {
                    battleEnded = true;
                }
            }
        }
    }

    public void reviveHeroes(ArrayList<Heroes> heroesList) {
        for (Heroes hero : heroesList) {
            if (hero.getHP() <= 0) {
                hero.revive();
                fightRules.recoverFromBattle(hero);
            }
        }
    }
}

package main.Game;
import main.Characters.Characters;
import main.Characters.Heroes;
import main.Characters.Monsters;

public interface IFightRules {
    int setNumHeroes(int numHeroes);
    double getHP(Heroes hero);
    double getHP(Monsters monster);

    double getDodgeChance(Heroes hero);

    double getDodgeChance(Monsters monsters);
}

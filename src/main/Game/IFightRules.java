package main.Game;
import main.Characters.Characters;
import main.Characters.Heroes;
import main.Characters.Monsters;

public interface IFightRules {
    double getDodgeChance(Characters character);
    double getHP(Characters character);
    double setNumHeroes(int numHeroes);

    double getHP(Heroes hero);

    double getHP(Monsters monster);

    double getHP(Monsters monster);

    double getDodgeChance(Heroes hero);

    double getDodgeChance(Monsters monsters);
}

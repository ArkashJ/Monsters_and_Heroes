package main.Game;
import main.Characters.Heroes.Heroes;
import main.Characters.Monsters.Monsters;

public interface IFightRules {
    double getHP(Heroes hero);
    double getHP(Monsters monster);

    double getDodgeChance(Heroes hero);

    double getDodgeChance(Monsters monsters);
}

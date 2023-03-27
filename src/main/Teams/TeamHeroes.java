package main.Teams;

import main.Characters.Heroes.Heroes;

import java.util.List;

public class TeamHeroes extends Team {
    public TeamHeroes(String name, int teamSize, int x_position, int y_position) {
        super(name, teamSize, x_position, y_position);
    }

    public void addHero(Heroes hero) {
        addCharacter(hero);
    }

    public Heroes getHero(int index) {
        return (Heroes) characters.get(index);
    }

    // Add a getter method to return the characters list as a list of Heroes
    public List<Heroes> getHeroes() {
        return (List<Heroes>) (List<?>) characters;
    }
}

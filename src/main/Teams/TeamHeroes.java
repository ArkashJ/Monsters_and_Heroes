package main.Teams;

import main.Characters.Heroes.Heroes;

import java.util.List;

public class TeamHeroes extends Team {
    public TeamHeroes(String name, int teamSize, int x_position, int y_position) {
        super(name, teamSize, x_position, y_position);
    }
    public TeamHeroes(String name, int teamSize) {
        super(name, teamSize);
    }
    public void addHero(Heroes hero) {
        addCharacter(hero);
    }

    public Heroes getHero(int index) {
        return (Heroes) characters.get(index);
    }

    public Heroes getHero(String name) {
        for (Heroes hero : getHeroes()) {
            if (hero.getName().equals(name)) {
                return hero;
            }
        }
        return null;
    }

    // Add a getter method to return the characters list as a list of Heroes
    public List<Heroes> getHeroes() {
        return (List<Heroes>) (List<?>) characters;
    }

    public void removeHero(Heroes hero) {
        removeCharacter(hero);
    }

    public void printHeroes(){
        System.out.println("Heroes:");
        for (Heroes hero : getHeroes()) {
            System.out.println(hero.getName());
        }
    }

    public boolean checkHeroes(String name){
        // loop through the heroes list and if hero not return false
        for (Heroes hero : getHeroes()) {
            if (hero.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }


    // The team position is the position of the first character in the team
    // Set the position of every character in the team to the position of the first character
    public void setTeamPosition(Heroes hero) {
        // get first character in the team
        Heroes firstHero = getHero(0);
        // get the position of the first character
        int x_position = firstHero.getPosition().getX_pos();
        int y_position = firstHero.getPosition().getY_pos();
        // set the position of every character in the team to the position of the first character
        for (Heroes h : getHeroes()) {
            h.getPosition().setPos(x_position, y_position);
        }
        System.out.println("Moving team to position: " + x_position + ", " + y_position);
    }

    public int getSize(){
        return characters.size();
    }

    public Heroes get(int index){
        return (Heroes) characters.get(index);
    }
}

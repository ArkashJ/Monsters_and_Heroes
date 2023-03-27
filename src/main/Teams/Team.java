package main.Teams;

import main.Characters.Characters;
import main.Characters.Heroes.Heroes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static main.Game.FightRules.setNumHeroes;

public class Team {
    private String name;
    private int teamSize;

    private int x_position;
    private int y_position;
    private List<Characters> characters;
    //---------------------------------------------------------------------------------------------------------
    public Team(String name, int teamSize, int x_position, int y_position){
        this.name = name;
        this.teamSize = teamSize;
        this.x_position = x_position;
        this.y_position = y_position;
        characters = new ArrayList<>();
    }
    public void setX_position(int x_position) {
        this.x_position = x_position;
    }

    public void setY_position(int y_position) {
        this.y_position = y_position;
    }
    // The team position is the position of the first character in the team
    public int getX_position() {
        if (characters.get(0) instanceof Heroes){
            return ((Heroes) characters.get(0)).getPosition().getX_pos();
        } else {
            return 0;
        }
    }

    public int getY_position() {
        if (characters.get(0) instanceof Heroes){
            return ((Heroes) characters.get(0)).getPosition().getY_pos();
        } else {
            return 0;
        }
    }

    public void getTeamPosition(){
        System.out.println("Team position: " + getX_position() + ", " + getY_position());
    }
    //---------------------------------------------------------------------------------------------------------
    public void addCharacter(Characters character){
        characters.add(character);
    }
    //---------------------------------------------------------------------------------------------------------
    public void removeCharacter(Characters character){
        characters.remove(character);
    }
    //---------------------------------------------------------------------------------------------------------
    public Iterator<Characters> iterator(){
        return characters.iterator();
    }
    //---------------------------------------------------------------------------------------------------------
    public String getName(){
        return name;
    }
    //---------------------------------------------------------------------------------------------------------
    public int getTeamSize(){
        return setNumHeroes(teamSize);
    }
    //---------------------------------------------------------------------------------------------------------
}

package main.Teams;

import main.Characters.Characters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static main.Game.FightRules.setNumHeroes;

public class Team {
    private String name;
    private int teamSize;
    private List<Characters> characters;
    //---------------------------------------------------------------------------------------------------------
    public Team(String name, int teamSize){
        this.name = name;
        this.teamSize = teamSize;
        characters = new ArrayList<>();
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

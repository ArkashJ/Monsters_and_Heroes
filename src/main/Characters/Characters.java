package main.Characters;

public abstract class Characters implements ICharacters{
    protected String name;
    protected int level;
    protected double HP;

    public Characters(String name, int level, double HP){
        this.name    = name;
        this.level   = level;
        this.HP      = HP;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getLevel(){
        return level;
    }

    @Override
    public double getHP(){
        return HP;
    }

    @Override
    public void setHP(double HP){
        this.HP = HP;
    }

    public abstract void printStats();
}

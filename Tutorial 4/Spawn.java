import greenfoot.*;

/**
 * Write a description of class Spawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawn extends Actor
{
    private int lifeSpawn;
    
    public Spawn(int i) 
    {
        this.lifeSpawn = i;
    }    
    
    public int getLifeSpawn () {
        return this.lifeSpawn;
    }
    
    public void minLifeSpawn() {
        this.lifeSpawn--;
    }
}

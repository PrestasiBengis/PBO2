import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class HP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HP extends Actor
{
    /**
     * Act - do whatever the HP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int HP_player;
    public HP()
    {
        HP_player = 5;
    }
    
    public void act() 
    {
        GreenfootImage image = new GreenfootImage(Integer.toString(HP_player),40,Color.RED,null);
        setImage(image);
        
    }    
    public void setHP(int HP_player)
    {
        this.HP_player = HP_player;
    }
    public int getHP()
    {
        return this.HP_player;
    }
}

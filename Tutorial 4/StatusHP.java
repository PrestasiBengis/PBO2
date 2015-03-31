import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class StatusHP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatusHP extends Actor
{
    public int timer = 14;
   
    public StatusHP(String txt)
    {
        
        GreenfootImage image = new GreenfootImage(txt,50,Color.RED,null);
        setImage(image);
        
    }
    
    public void act() 
    {
        
        timer--;
        if(timer == 0)
        {
            getWorld().removeObject(this);
            return;
        }
    }    
}

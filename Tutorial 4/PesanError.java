import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class PesanError here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesanError extends Actor
{
    /**
     * Act - do whatever the PesanError wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int timer = 40;
   
    public PesanError(String txt)
    {
        
        GreenfootImage image = new GreenfootImage(txt,25,Color.RED,null);
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

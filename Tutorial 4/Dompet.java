import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Dompet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dompet extends Actor
{
    /**
     * Act - do whatever the MoneyBag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int current_money;
    private int base_money;
    
    public Dompet(int terimaduitawaldaristage)
    {
        current_money = base_money = terimaduitawaldaristage;
    }
    
    public int getMoney()
    {
        return current_money;
    }
    
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        GreenfootImage image = new GreenfootImage(Integer.toString(current_money),40,Color.RED,null);
        setImage(image);//GreenfootImage image = new GreenfootImage("")
    }    
}

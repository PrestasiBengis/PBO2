import greenfoot.*;

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    protected int damage;
    protected int direction;
    protected int speed;
    
    public Bullet(int damage, int direction, int speed)
    {
        this.damage = damage;
        this.direction = direction;
        this.speed = speed;
    }
    
    protected int damage()
    {
        return damage;
    }
    public void act() 
    {
        // Add your action code here.
    }    
    protected void cekmentok()
    {
        
    }
    
    
}

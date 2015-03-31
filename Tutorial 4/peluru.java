import greenfoot.*;

/**
 * Write a description of class peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru extends Bullet
{
    private int damage;
    private int direction;
    private int speed;
    
    public void act() 
    {
        move(speed);
        cekmentok();
        setRotation(direction);
    }    
    
    public peluru(int damage, int direction, int speed)
    {
        super(damage,direction,speed);
        this.damage = damage;
        this.direction = direction;
        this.speed = speed;
    }
    
    public int getdamage()
    {
        return damage;
    }
    public void cekmentok()
    {
        if(isAtEdge()||this.getY() < 220)
        {
            getWorld().removeObject(this);
            return;
        }
    }
    /*
    public void hitDetection()  
    {
       Actor b = getOneIntersectingObject(Snake.class);  
          
       if(b != null)  
       {  
           getWorld().removeObject(b);   
           getWorld().removeObject(this);
       }
    }
    */
}

import greenfoot.*;

/**
 * Write a description of class peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pelurusteel extends Bullet
{
    /**
     * Act - do whatever the peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int damage;
    private int direction;
    private int speed;
    
    public void act() 
    {
        move(speed);
        cekmentok();
        setRotation(direction);
        
        //hitDetection();
    }    
    
    public pelurusteel(int damage, int direction, int speed)
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

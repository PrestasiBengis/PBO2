import greenfoot.*;

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Enemy
{
    //public int hp;
    public int damage;
    //private long timer;
    public int flag;
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    
    public Snake()
    {
       hp = 5;
       damage = 1;
       turnleft();
       flag = 0;
    }
    public Snake(int hp, int damage, int speed)
    {
        this.hp = hp;
        this.damage= damage;
        this.speed = speed;
        turnleft();
        flag = 1;
    }
    public void act() 
    {
        //hp = 5;
        
        //spawn();
        cektabrak();
        
        //getWorld().addObject(this, 700, ((Greenfoot.getRandomNumber(5-3)+3))*85);
        if(flag == 0)
        {
            move(-1);
        }
        else
        {
            move(this.speed);
        }
        
    } 
    
    public void turnleft()
    {
        //turn(-90);
        getImage().mirrorHorizontally();
    }
    
    public int getdamage()
    {
        return damage;
    }
    protected void tambahscore()
    {
        Score scoreset = (Score)getWorld().getObjects(Score.class).get(0);
        score = scoreset.getScore() + 4;
        scoreset.setScore(score); 
    }
    /*
    public void spawn()
    {
        //timer = 50;
        if(timer > 0)
        {
            timer--;
            if(timer == 0)
            {
                 //getWorld().addObject(this, 700, ((Greenfoot.getRandomNumber(5-3)+3))*85);
                 enemy();
                 timer = 10;
            }
        }
    }
    */
   
}

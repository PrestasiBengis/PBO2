import greenfoot.*;

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Enemy
{
   // public int hp;
    public int damage;
    public int flag;
    public Frog()
    {
       hp = 2;
       damage = 2;
       turnleft();
       flag = 0;
    }
    public Frog(int hp, int damage, int speed)
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
        score = scoreset.getScore() + 3;
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

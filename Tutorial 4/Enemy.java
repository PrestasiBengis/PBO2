import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int damage;
    protected int hp;
    protected int speed;
    protected int score = 0;
    public void act() 
    {
        // Add your action code here.
    }  
    
    
    public void cekTabrakPager()
    {
        HP hp = (HP)getWorld().getObjects(HP.class).get(0);
        int temp;
        
        if(this.getX() < 328)
        {
            temp = hp.getHP() - 1;
            hp.setHP(temp);
            
            getWorld().removeObject(this);
            return;
        }
        if(hp.getHP()<1)
        {
            //Greenfoot
        }
    }
    
    protected void cektabrak()
    {
        
        //if (!getWorld().getObjects(Score.class).isEmpty())
        //{
        
        if(isTouching(peluru.class))
        {
            if(hp > 0)
            {
                peluru a = (peluru)getOneIntersectingObject(peluru.class);
                
                hp = hp - a.getdamage();
                getWorld().removeObject(a);
                
            }
            if(hp < 1)
            {
                tambahscore();
                //Score highscore = new Score(score);
                //getWorld().addObject(highscore, highscore.getX(), highscore.getY());
                getWorld().removeObject(this);
                hp = 5;
                
            }
            return;
            
        }
        else if(isTouching(peluruapi.class))
        {
            if(hp > 0)
            {
                peluruapi b = (peluruapi)getOneIntersectingObject(peluruapi.class);
                
                hp = hp - b.getdamage();
                return;
                //getWorld().removeObject(a);
                
            }
            if(hp < 1)
            {
                tambahscore();
               
                //Score highscore = new Score(score);
                //getWorld().addObject(highscore, highscore.getX(), highscore.getY());
                getWorld().removeObject(this);
                hp = 5;
                
            }
            return;
        }
        else if(isTouching(pelurusteel.class))
        {
            if(hp > 0)
            {
                pelurusteel b = (pelurusteel)getOneIntersectingObject(pelurusteel.class);
                
                hp = hp - b.getdamage();
                
                getWorld().removeObject(b);
                
            }
            if(hp < 1)
            {
                tambahscore();
               
                //Score highscore = new Score(score);
                //getWorld().addObject(highscore, highscore.getX(), highscore.getY());
                getWorld().removeObject(this);
                hp = 5;
                
            }
            return;
        }
        else if(isTouching(pelurues.class))
        {
            if(hp > 0)
            {
                pelurues b = (pelurues)getOneIntersectingObject(pelurues.class);
                
                hp = hp - b.getdamage();
                
                getWorld().removeObject(b);
                
                
            }
            if(hp < 1)
            {
                tambahscore();
               
                //Score highscore = new Score(score);
                //getWorld().addObject(highscore, highscore.getX(), highscore.getY());
                getWorld().removeObject(this);
                hp = 5;
                
            }
            return;
        }
        else
        {
            cekTabrakPager();
        }
        //}
    }
    public int getdamage()
    {
        return damage;
    }
    protected void tambahscore(){}
  
}

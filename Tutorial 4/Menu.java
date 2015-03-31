import greenfoot.*;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound sound = new GreenfootSound("opening.mp3");
    public void act() 
    {
        startmusik();
        cekbutton();
     //   ceksound();
    }    
    public void startmusik()
    {
        if(!sound.isPlaying())
        {
            sound.play();
        }
    }
    
    public void stopmusik()
    {
        sound.stop();
        
    }
    public void cekbutton()
    {
        if(Greenfoot.mouseClicked(this))
        {
            stopmusik();
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Stage1());
            
            
        }
    }
  
  
}

import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int scoreclass;
    
    public Score(int scoreparsing)
    {
        scoreclass = scoreparsing;
        
    }
    
    public void setScore(int scoreclass)
    {
        this.scoreclass = scoreclass;
    }
    public int getScore()
    {
        return this.scoreclass;
    }
    public void act() 
    {
        GreenfootImage image = new GreenfootImage(Integer.toString(scoreclass),40,Color.WHITE,null);
        setImage(image);
    }    
}

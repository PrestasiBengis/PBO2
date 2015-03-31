import greenfoot.*;

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
   
    //private int cekmusik;
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 600, 1); 
        //ceksound();
        prepare();
        
    }
   
   
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

    //public void stopmusik(cekmusik)
    //{
    //  if(cekmusik == 1)
    //{
    //  sound.stop();

    //}
    // }

    private void prepare()
    { 

        Menu menu = new Menu();
        addObject(menu, 538, 489);
        
        menu.setLocation(505, 540);
    }
}

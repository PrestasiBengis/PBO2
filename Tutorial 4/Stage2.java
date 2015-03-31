import greenfoot.*;

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends World
{
    
    private int timer = 100;
    
    private int x= 1024;
    private int y = (Greenfoot.getRandomNumber(5)+3)*77;
    
    public Stage2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(1024, 600, 1); 
       
       prepare();
       
    }
    
    private void waktuSpawnEnemy()
    {
        timer--;
        if(timer == 0)
        {
            spawnEnemy();
            timer = 100;
        }
    }
    
    public void spawnEnemy()
    {
        int i = Greenfoot.getRandomNumber(2)+1;
        Enemy[] enemy = {new Snake(1,3,-3),new Frog(2,3,-3),new Snake(1,3,-3),new Frog(2,3,-3)};
        //Snake snake = new Snake();
        addObject(enemy[i],1024,y);
        i = Greenfoot.getRandomNumber(2)+1;
        y = (Greenfoot.getRandomNumber(5)+3)*77; 
        return;
        //addObject(snake,1024,((Greenfoot.getRandomNumber(2))+5)*75);
        
    }
    public void act()
    {
        if (!this.getObjects(Dompet.class).isEmpty())
        {
            Dompet duitset = (Dompet)this.getObjects(Dompet.class).get(0);
            //int duit = duitset.getDuit();
            //GreenfootImage image = getImage();
            //image.drawString(Integer.toString(duit),duitset.getX(),duitset.getY());
            //this.showText(Integer.toString(duit),duitset.getX(),duitset.getY());
        }
       
        waktuSpawnEnemy();      
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Dompet dompet = new Dompet(2000);
        addObject(dompet, 132, 97);

        HP hp = new HP();
        addObject(hp, 315, 158);

        Score score = new Score(0);
        addObject(score, 934, 26);

        Ferdi ferdi = new Ferdi();
        addObject(ferdi, 69, 229);

        Gio gio = new Gio();
        addObject(gio, 150, 338);

        Vina vina = new Vina();
        addObject(vina, 67, 460);        

        Alvin alvin = new Alvin();
        addObject(alvin, 157, 238);

        David david = new David();
        addObject(david, 71, 341);

      
    }
}

import greenfoot.*;


/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Actor
{
    /**
     * Act - do whatever the Student wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected boolean ambil;
    protected int timer;
    protected int duit;
    //flag sebagai penanda kalo object tersebut sudah di release dan tidak bisa di drag and drop lagi
    protected boolean flag;
    protected Dompet duitset;
    
    public Student()
    {
        timer = 0;
        flag = true;
    }
    public void act() 
    {
        // Add your action code here.
    }
    
    protected void DragAndDrop()
    {
        if (Greenfoot.mousePressed(this) && !ambil && flag == true)
        {
            // ambil objectnya
            
            cekduit();
            World world = getWorld();
            MouseInfo mi = Greenfoot.getMouseInfo();
            
            world.removeObject(this);
            world.addObject(this, mi.getX(), mi.getY());
            return;
        }
        
        if ((Greenfoot.mouseDragged(this)) && ambil)
        {
            // mengikuti posisi mouse
            MouseInfo mi = Greenfoot.getMouseInfo();
            setLocation(mi.getX(), mi.getY());
            return;
        }
        // object diletakkan
        if (Greenfoot.mouseDragEnded(this) && ambil)
        {
            cekposisi();
            cekjarak();
            
        }
        if(timer >0)
        {
           timer--;
           if(timer == 0)
           {
               shoot();
               settimer();
           }
        }
    }
    protected void cekjarak()
    {
        
    }
    protected void shoot()
    {
        
    }
    
    protected void cekduit()
    {
        
    }
    protected int settimer()
    {
        timer = 0;
        return timer;
    }
    protected void kurangduit()
    {
        
    }
    
    protected void cekposisi()
    {
       
    }
   
}

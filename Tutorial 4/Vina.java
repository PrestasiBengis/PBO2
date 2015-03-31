import greenfoot.*;
import java.util.List;


/**
 * Write a description of class Ferdi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vina extends Student
{
    /**
     * Act - do whatever the Ferdi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int hp_vina;
    int current_duit;
   
    public Vina()
    {
        hp_vina = 7;
    }
    public void act() 
    {
      
        if(Greenfoot.mouseClicked(this))
        {
            Vina vina = new Vina();
            getWorld().addObject(vina, 67, 460);
        }
        cekdiserang();
        DragAndDrop();   
        
    }
    
    public void cekduit()
    {
         if (!getWorld().getObjects(Dompet.class).isEmpty())
         {
            duitset = (Dompet)getWorld().getObjects(Dompet.class).get(0);
            current_duit = duitset.getMoney(); 
         }  
        if((duitset.getMoney() - 800) >= 0)
        {
            ambil = true;
            // the rest of this block will avoid this object being dragged UNDER other objects
            World world = getWorld();
            //MouseInfo mi = Greenfoot.getMouseInfo();
            //world.removeObject(this);
            //world.addObject(this, mi.getX(), mi.getY()); 
            return;
        }
        else
        {
           PesanError error = new PesanError("Insufficient Money");
           getWorld().addObject(error, 122, 174);
        }
    
    }
    public void shoot()
    {
        pelurues bola = new pelurues(1,0,4);
        getWorld().addObject(bola, this.getX()+20, this.getY());      
        
    }
    
    public int settimer()
    {
        timer = 70;
        return timer;
    }
     
    public void kurangduit()
    {
        World world = getWorld();
        world.removeObject(duitset);
        duitset = new Dompet(duitset.getMoney() - 800);
        current_duit = duitset.getMoney();
        world.addObject(duitset, 132, 97);
        return;
    }
    
    public void cekjarak()
    {
        List students = getObjectsInRange(50, Vina.class);
            // kalo kosong maka bisa diisi 
            if (getObjectsInRange(50, null).isEmpty()) 
            {
                    
                int duit = 0;
                //false menandakan object bisa ditaruh
                flag = false;
                //akses class dompet
                kurangduit();
                
                ambil = false;
                settimer();
                return;
            }
            else if(!getObjectsInRange(50, null).isEmpty() || !getObjectsInRange(100, Stage1.class).isEmpty())// kalo ada isinya maka tidak bisa diisi, aktor di remove
            {
                flag = true;
                getWorld().removeObject(this);
                return;
            }
    }
    
     public void cekdiserang()
    {
        if(isTouching(Enemy.class))
        {
            if(hp_vina > 0)
            {
                Enemy nabok = (Enemy)getOneIntersectingObject(Enemy.class);
                
                hp_vina = hp_vina - nabok.getdamage();
                StatusHP status = new StatusHP("-"+Integer.toString(nabok.getdamage()));
                getWorld().addObject(status, this.getX()+10, this.getY()-30);
                
                getWorld().removeObject(nabok);
                if(hp_vina<1)
                {
                    getWorld().showText(null, this.getX()+10, this.getY()+30);
                    getWorld().removeObject(this);
                    return; 
                }
                //return;
                //getWorld().showText("-"+ Integer.toString(nabok.getdamageSnake()), this.getX()+10, this.getY()+30);
                /*
                while(true){
                    //pause(1000);
                    waktu--;
                    if(waktu==0)
                    {
                          getWorld().showText(Integer.toString(hp_ferdi), this.getX()+10, this.getY()+30);  
                          break;
                    }
                }
                */
                
            }
            
        }
    }
}


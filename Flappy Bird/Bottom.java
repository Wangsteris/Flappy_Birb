import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Bottom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Bottom extends Actor
{
    public static int height;
    /**
     * Act - do whatever the Bottom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bottom(){
        GreenfootImage img=getImage();
        int height=img.getHeight();
    }

    public void act() 
    {
        GreenfootImage img=getImage();
        //System.out.println(img.getHeight());
        setLocation(getX()-1,getY());
        if(getX()==0){
            getWorld().removeObject(this);
        }
    }    
    
    public static int getHeight(){
        return height;
    }
    
    public int getXC(){
        return getX();
    }
    
    public int getYC(){
        return getY();
    }
    
    

    
}

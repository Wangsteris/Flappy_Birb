import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Top here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Top extends Actor
{
    int gap=100;

    public Top(){

    }

    public void act() 
    {
        //GreenfootImage img=getImage();
        //System.out.println(img.getHeight());
        setLocation(getX()-1,getY());
        if(getX()==0){
            getWorld().removeObject(this);
        }
    }    
    
    public  int getYC(){
        return getY();
    }
}

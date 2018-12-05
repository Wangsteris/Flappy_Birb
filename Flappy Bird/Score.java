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
    private int counter;

    public Score(){
        counter=0;
        GreenfootImage img = new GreenfootImage(80,80);
        setImage(img);
        update();
    }

    
    public void update(){
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.WHITE);
        img.drawString("Score: "+counter+"",5,15);
        
    }
    
    public void addScore(){
        counter++;
        update();
    }   


}

import greenfoot.*;

/**
 * Write a description of class Game_Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_Over extends World
{

    /**
     * Constructor for objects of class Game_Over.
     * 
     */
    public Game_Over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        addObject(new GameOver(),150,250);
    }
}

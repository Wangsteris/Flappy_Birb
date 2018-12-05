import greenfoot.*;

/**
 * Write a description of class BG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG extends World
{

    /**
     * Constructor for objects of class BG.
     * 
     */
    int Count=199;
    int pipeHeight=266;
    int gap=120;

    int spaceBelow=pipeHeight/2;
    private Score counter;
    public Bottom b;
    public Top t;
    public BG()
    {    
        super(300, 500, 1); 

        counter=new Score();
        addObject(counter,getWidth()/2,50);

        //add ground
        //addObject(new Ground(),0,475);

        //add bird
        addObject(new Fly(counter),100,200);

    }

    public void act(){
        while (Count>200){
            spawn();
            Count=0;
        }
        Count++;
    }

    public void spawn(){
        int Yb=500-(int)(Math.random()*spaceBelow);
        int Yt=Yb-266-gap;
        addObject(new Top(),getWidth(),Yt);
        addObject(new Bottom(),getWidth(),Yb);
        //length is 394
    }
}

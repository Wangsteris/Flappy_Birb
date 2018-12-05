import greenfoot.*;

/**
 * Write a description of class Fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly extends Actor
{
    int Count=199;
    boolean buttonPressed=true;
    double dy=0;
    double g=0.7;
    double jump=-8;

    int time;
    int time2=500;

    //Pipe
    int pipeHeight=266;
    int gap=120;

    int spaceBelow=pipeHeight/2;
    GreenfootSound fly=new GreenfootSound("sfx_wing.wav");
    GreenfootSound point=new GreenfootSound("sfx_point.wav");

    private Score counter;
    public Bottom b;
    public Top t;
    

    public Fly(Score counter1){
        counter=counter1;
    }

    public void act() 
    {
        //move(-2);
        setLocation(getX(),(int)(getY()+dy));
        control();
        kill();
        Count++;
        dy=dy+g;
        rotate();
        time++;
        time2++;
        //System.out.println();
        addPoint();

        while (Count>200){
            //spawn();
            Count=0;
            time=0;
        }
        getWorld().addObject(new Ground(),0,475);
    }   

    public void control(){
        if (Greenfoot.isKeyDown("space")&&buttonPressed){
            flap();

            buttonPressed=false;
        }
        if (!Greenfoot.isKeyDown("space")&&!buttonPressed){
            buttonPressed=true;
        }
    }

    public void flap(){
        dy=jump;
        fly.play();
        
        //move(75);
    }

    public void rotate(){
        if(dy>-10&&dy<10){
            setRotation(-30);
        }
        else if(dy>10&&dy<15){
            setRotation(0);
        }
        else if(dy>15&&dy<20){
            setRotation(30);
        }
    }

    public void kill(){
        if (isTouching(Ground.class)){
            Greenfoot.setWorld(new Game_Over());
        }
        if (isTouching(Top.class) || isTouching(Bottom.class)){
            Greenfoot.setWorld(new Game_Over());
        }
    }

    public void spawn(){
        int Yb=500-(int)(Math.random()*spaceBelow);
        int Yt=Yb-266-gap;
        getWorld().addObject(new Top(),getWorld().getWidth(),Yt);
        getWorld().addObject(new Bottom(),getWorld().getWidth(),Yb);
        //length is 394
    }

    public void addPoint(){
        if (time==200){
            point.play();
            counter.addScore();
        }
    }
    }

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TezeuFightStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TezeuFightStart extends World
{
    int nr=1;
    int ok=1;
    /**
     * Constructor for objects of class TezeuFightStart.
     * 
     */
    public TezeuFightStart()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1421, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

    }

     public void act()
    {ok=1;
        String key = Greenfoot.getKey();
        if ("left".equals(key) && ok==1) {nr--;ok=0;}
        else if ("right".equals(key) && ok==1) {nr++;ok=0;}
        if (nr==0) Greenfoot.setWorld(new AdventureWorld());
        else if (nr==1) setBackground("tleg1.png");
        else if (nr==2) setBackground("tleg2.png");
        else if (nr==3) setBackground("tleg3.png");
        else if (nr==4) setBackground("tleg4.png");
        else Greenfoot.setWorld(new TezeuWorld());
}
}

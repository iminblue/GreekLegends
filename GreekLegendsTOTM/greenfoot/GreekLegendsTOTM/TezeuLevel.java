import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TezeuLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TezeuLevel extends Actor
{
    /**
     * Act - do whatever the TezeuLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        
       
        if (Greenfoot.mouseClicked(this))
        Greenfoot.setWorld(new TezeuFightStart());
        
    }    
}

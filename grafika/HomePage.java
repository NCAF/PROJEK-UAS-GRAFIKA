import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomePage extends World
{

    /**
     * Constructor for objects of class HomePage.
     * 
     */
    public static GreenfootSound bs = new GreenfootSound("Walpaper.wav");
    public HomePage()
    {    
        super(780, 480, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PLAY pLAY = new PLAY();
        addObject(pLAY,600,208);
        pLAY.setLocation(589,212);
        removeObject(pLAY);
        PLAY PLAY = new PLAY();
        addObject(pLAY,560,278);
    }
}

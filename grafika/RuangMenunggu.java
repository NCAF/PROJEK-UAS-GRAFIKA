import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RuangMenunggu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class RuangMenunggu extends World
{

    /**
     * Constructor for objects of class RuangMenunggu.
     * 
     */
    public static GreenfootSound bs = new GreenfootSound("Walpaper.wav");
    public RuangMenunggu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NO nO = new NO();
        addObject(nO,174,295);
        YES yES = new YES();
        addObject(yES,331,292);
        NO nO2 = new NO();
        addObject(nO2,184,296);
        nO.setLocation(190,292);
        removeObject(nO2);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static Counter score = new Counter("Score : ");
    public static Counter life = new Counter("Life : ");
    public static GreenfootSound bs = new GreenfootSound("Walpaper.wav");
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 480, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Apel apel = new Apel();
        addObject(apel,168,19);
        Apel apel2 = new Apel();
        addObject(apel2,222,14);
        Appel appel = new Appel();
        addObject(appel,192,64);
        Apel apel3 = new Apel();
        addObject(apel3,152,112);
        Apel apel4 = new Apel();
        addObject(apel4,221,118);
        Apel apel5 = new Apel();
        addObject(apel5,184,156);
        Apel apel6 = new Apel();
        addObject(apel6,184,219);
        Apel apel7 = new Apel();
        addObject(apel7,182,276);
        Appel appel2 = new Appel();
        addObject(appel2,369,33);
        Appel appel3 = new Appel();
        addObject(appel3,424,28);
        Bom bom = new Bom();
        addObject(bom,401,95);
        Apel apel8 = new Apel();
        addObject(apel8,376,160);
        Appel appel4 = new Appel();
        addObject(appel4,424,160);
        Bom bom2 = new Bom();
        addObject(bom2,397,224);
        apel.setLocation(157,28);
        ORANG oRANG = new ORANG();
        addObject(oRANG,187,351);
        
        addObject(score,47,19);
        score.setValue(0);
        
        addObject(life,669,18);
        life.setValue(5);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Appel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Appel extends Actor
{
    /**
     * Act - do whatever the Appel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Mengatur posisi apel agar jatuh secara random dan kembali ke atas
        setLocation(getX(), getY()+3);
        if(isAtEdge())
        {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        }
        
        if(isTouching(ORANG.class))
        {
            MyWorld.score.add(10);
            getWorld().addObject(new Appel(), Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
            getWorld().removeObject(this);
            Greenfoot.playSound("tangkap.wav");
        }
    }
}

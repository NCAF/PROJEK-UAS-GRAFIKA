import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apel extends Actor
{
    /**
     * Act - do whatever the Apel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Mengatur posisi apel agar jatuh secara random dan kembali ke atas
        setLocation(getX(), getY()+2);
        if(isAtEdge())
        {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
            
        }
        
        if(isTouching(ORANG.class))
        {
            MyWorld.score.add(7);
            getWorld().addObject(new Apel(), Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
            getWorld().removeObject(this);
            Greenfoot.playSound("tangkap.wav");
        }
    }
}

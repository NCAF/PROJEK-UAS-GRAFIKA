import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bom extends Actor
{
    /**
     * Act - do whatever the Bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Mengatur posisi apel agar jatuh secara random dan kembali ke atas
        setLocation(getX(), getY()+4);
        if(isAtEdge())
        {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        }
        
        if(isTouching(ORANG.class))
        {
            getWorld().addObject(new Blast(), getX(), getY());
            Greenfoot.playSound("BOM NEW.wav");
            MyWorld.life.add(-1);
            getWorld().addObject(new Bom(), Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
            if(MyWorld.life.getValue()==0)
            {
                getWorld().addObject(new GameOver(),getWorld().getWidth()/2, getWorld().getHeight()/2);
                getWorld().addObject(new Tryagain(), 120, 300);
                getWorld().addObject(new Quit(), 600, 300);
                removeTouching(ORANG.class);
                MyWorld.bs.stop();
                Greenfoot.playSound("gameover.wav");
            }
            getWorld().removeObject(this);
        }
    }
}

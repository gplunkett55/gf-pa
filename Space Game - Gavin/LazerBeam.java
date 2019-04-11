import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LazerBeam here.
 * 
 * @author (Gavin Plunkett) 
 * @version (April 9, 2019)
 */
public class LazerBeam extends LazerGuy
{
    /**
     * Act - do whatever the LazerBeam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void checkFirePress()
    {
        if(Greenfoot.isKeyDown("Space"))
        {
            fire();
        }
    }

    public void fire()
    {
        //make the lazerbeam move after being shot

        turnTowards(0,0);
        move(5);
    }

    public void act() 
    {
        // Add your action code here.
        checkFirePress();
    }    
    public void checkForAlien()
    {
        if(isTouching(Alien.class))
        {
           removeTouching(Alien.class);
        }
        
    }
}

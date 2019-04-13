import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LazerGuy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LazerGuy extends Actor
{
    int xCor;
    int yCor;
    

    /**
     * Constructor
     */

    /**
     * Act - do whatever the LazerGuy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        // Add your action code here.
        checkKeyPress();
        
    }    

    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left")) 
        {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move (5);
        }
        if (Greenfoot.isKeyDown("space"))
        {
            LazerBeam newBeam = new LazerBeam();
            getWorld().addObject(newBeam, getX(), getY());
        }
    }

}

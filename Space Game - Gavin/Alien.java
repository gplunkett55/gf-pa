import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (Gavin Plunkett) 
 * @version (April 8, 2019)
 */
public class Alien extends Actor
{
    // instance variables   
    
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        goDown();
        checkForLazerGuy();
    }    
    //advance towards the bottom of the world.
    

    public void goDown(){
        if ( isAtEdge() )
        {
            //turn randomly when at an edge
            randomTurn();

        }
        else {
            //move around the world
            move(3);

        }
    }

    public void randomTurn()
    {
        if (isAtEdge()) 
        {
            //random turn when hitting the edge of the world
            turn(Greenfoot.getRandomNumber(180)-45);
            //move 10 off of the edge of the world to avoid glitching and
            //becoming stuck
            move(10);
        }

    }

    public void checkForLazerGuy()
    {
        if (isTouching(LazerGuy.class))
        {
            //ends game if comes in contact with the LazerGuy
            Greenfoot.stop();
        }
    }
}

    

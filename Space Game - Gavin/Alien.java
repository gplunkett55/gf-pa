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
    private int xPosition;
    private int yPosition;   

    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        descend();

    }    
    //advance towards the bottom of the world. 

    public void descend()
    {
        xPosition = getX();
        yPosition = getY();

        goDown();

    }

    public void goDown(){
        if ( isAtEdge() )
        {
            randomTurn();

        }
        else {
            move(3);

        }
    }

    public void randomTurn()
    {
        if (isAtEdge()) 
        {
            turn(Greenfoot.getRandomNumber(180)-45);
            move(10);
        }

    }
}

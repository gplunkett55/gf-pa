import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nighttime here.
 * 
 * @author (your name) 
 * @version (a version number or an  date)
 */
public class Nighttime extends World
{
    int score = 0;
    int frames = 0;
    int addAlien = 0;
    /**
     * Constructor for objects of class Nighttime.
     * 
     */

    public Nighttime()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(496, 298, 1); 
        //Load the aliens and LazerGuy into the world
        Alien alien = new Alien();
        addObject(alien, 50, 50);
        addObject(alien, 51, 50);
        addObject(alien, 52, 50); 
        LazerGuy lazerguy = new LazerGuy();
        addObject(lazerguy, 248,246 );
        
        // Set the initial time
        String initialTime = "Time: ";
        showText(initialTime, 75, 25);
    }

    public void act()
    {
        
        frames += 1;

        //Update the time every 60 frames
        if ((frames % 60) == 0)
        {
            String timeElapsed = "Time: " + Integer.toString(frames / 60);
            showText(timeElapsed, 75, 25);
        }
        endTheGame();
    }
    public void endTheGame()
    {
        if ((frames % 3600) == 0)
        {
            Greenfoot.stop();

            // Show a game over message
            String endOfGameMessage = "Game Over";
            showText(endOfGameMessage, 248, 123);
        }
        
    }
    
    
        
        
}
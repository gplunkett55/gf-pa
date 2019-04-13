import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nighttime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nighttime extends World
{
    int score = 0;
    int frames = 0;
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
        LazerGuy lazerguy = new LazerGuy();
        addObject(lazerguy, 248,246 );
        
        // Set the initial time
        String initialTime = "Time: 0";
        showText(initialTime, 100, 50);

         // Set the initial score
        String currentScore = "Score: 0";
        showText(currentScore, 500, 50);
    }

    public void act()
    {

        frames += 1;
    }
}

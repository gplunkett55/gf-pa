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
        Alien alien = new Alien();
        addObject(alien, 50, 50);
        LazerGuy lazerguy = new LazerGuy();
        addObject(lazerguy, 248,246 );
    }
    
    public void act()
    {
        
        frames += 1;
    }
    public void shoot()
    {   LazerBeam beam = new LazerBeam();
        
        
        if (Greenfoot.isKeyDown("Space"))
        {
            addObject(beam, LazerBeam.xCor, LazerBeam.yCor);
        }
}
}

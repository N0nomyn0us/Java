import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinningPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinningPlatform extends Actor
{
    /**
     * Act - do whatever the WinningPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WinningPlatform()
    {
        getImage().scale(getImage().getWidth() / 5, getImage().getHeight() / 5);
    }
}

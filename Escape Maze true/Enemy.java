import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public Enemy()
    {
        getImage().scale(getImage().getWidth() / 3, getImage().getHeight() / 3);
    }
   public void act()
   {
       moveAround();
   }
   public void moveAround()
   {
       move(3);
       turn(3);
   }
}

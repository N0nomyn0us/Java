import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceAlien2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceAlien2 extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the SpaceAlien2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SpaceAlien2()
    {
        getImage().scale(getImage().getWidth() / 5, getImage().getHeight() / 5);
    }
    public void act()
    {
        moveAround();
    }
    public void moveAround()
    {
        setLocation(getX(),getY() + speed);
        if (isTouching(Walls.class))
        {
            speed = -speed;
        }
    }
}

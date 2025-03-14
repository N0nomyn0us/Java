import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    int speed = 3;
    int collect = 0;
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player1()
    {
        getImage().scale(getImage().getWidth() / 8, getImage().getHeight() / 8);
    }
    public void act()
    {
        moveAround();
        hitFood();
        hitTeleporter();
        youWin();
        youLose();
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
            setRotation(0);
            if (hitWall() == true)
            {
                setLocation(getX() - speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
            setRotation(180);
            if (hitWall() == true)
            {
                setLocation(getX() + speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - speed);
            setRotation(270);
            if (hitWall() == true)
            {
                setLocation(getX(), getY() + speed);
            }
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
            setRotation(90);
            if (hitWall() == true)
            {
                setLocation(getX(), getY() - speed);
            }
        }
    }
    public boolean hitWall()
    {
        if (isTouching(Walls.class))
        {
            return true;
        }
        else
        {
          return false;  
        }
    }
    public void hitFood()
    {
        if(getOneIntersectingObject(Burger.class) != null)
        {
            getWorld().removeObject(getOneIntersectingObject(Burger.class));
            speed++;
            collect++;
        }
    }
    public void hitTeleporter()
    {
        if(isTouching(Teleporter.class))
        {
            setLocation(35,613);
        }
    }
    public boolean hitEnemy()
    {
        if(isTouching(Enemy.class) || isTouching(SpaceAlien2.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void youLose()
    {
        if (hitEnemy())
        {
            getWorld().addObject(new YouLose(), 350, 350);
            Greenfoot.stop();
        }
    }
    public void youWin()
    {
        if (isTouching(WinningPlatform.class) && collect == 4)
        {
            getWorld().addObject(new YouWin(), 350, 350);
            Greenfoot.stop();
        }
    }
}

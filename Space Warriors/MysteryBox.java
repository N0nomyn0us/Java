import greenfoot.*; 

public class MysteryBox extends Actor
{
    public MysteryBox()
    {
        getImage().scale(60,60);
    }
    public void act()
    {
         setLocation(getX(),getY()+4);
       
       Actor nobo = getOneIntersectingObject(Fire.class);
       Actor nobot = getOneIntersectingObject(Shield1.class);
       if(nobo!=null || nobot!=null ){
    setImage("exp.png");
     Greenfoot.playSound("tt.mp3");
    Stars stars = new Stars();
    getWorld().addObject(stars,Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(600));
    Greenfoot.delay(2);
    getWorld().removeObject(this);
    }else if(isAtEdge()){
    setImage("exp.png");
     Greenfoot.playSound("tt.mp3");
    Stars stars = new Stars();
    getWorld().addObject(stars,Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(600));
    Greenfoot.delay(2);
    getWorld().removeObject(this);
    }
    }
}

import greenfoot.*;  

public class Gift extends Actor
{
    public Gift()
    {
        getImage().scale(40,40);
        
    }
    public void act()
    {
       setLocation(getX(),getY()+5);
     if(isAtEdge()){
        getWorld().removeObject(this);
        }
    }
}

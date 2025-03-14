import greenfoot.*; 

public class Blast1 extends Actor
{
    public Blast1()
    {
        getImage().scale(20,20);
    }public void act(){
        setLocation(getX(),getY()+6);
     Actor Expo =getOneIntersectingObject(Fire.class);
     Actor unl =getOneIntersectingObject(Lazer1.class);
     if(unl!=null){
        setLocation(getX(),getY()-10);
    }
   if(Expo!=null){
       Blast3 Blast3 = new Blast3();
    getWorld().addObject(Blast3,getX(),getY());
    
    getImage().scale(30,40);
    getWorld().removeObject(Expo);
    getWorld().removeObject(this);
    
    } 
    else if(isAtEdge())
        {
            
            getWorld().removeObject(this);
            }
    }
}

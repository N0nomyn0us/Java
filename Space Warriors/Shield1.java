import greenfoot.*; 

public class Shield1 extends Actor
{
int timer=0;
   public Shield1 (){
   getImage().scale(150,150); 
    }
    public void act()
    {
    turn(10);
       dtm();
       cos();
       if(Greenfoot.isKeyDown("shift")){
        
     if(Greenfoot.isKeyDown("right")) { 
        setLocation(getX()+20, getY());
         turn(20);
          }
          
          if(Greenfoot.isKeyDown("left")) { 
        setLocation(getX()-20, getY());
         turn(-50);
          }
          
          if(Greenfoot.isKeyDown("up")) { 
        setLocation(getX(), getY()-20);
          }
          
          if(Greenfoot.isKeyDown("down")) { 
        setLocation(getX(), getY()+20);
          }
    
    
    }
    
    if(Greenfoot.isKeyDown("right")) { 
        setLocation(getX()+10, getY());
         turn(10);
          }
          
          if(Greenfoot.isKeyDown("left")) { 
        setLocation(getX()-10, getY());
         turn(-30);
          }
          
          if(Greenfoot.isKeyDown("up")) { 
        setLocation(getX(), getY()-10);
          }
          
          if(Greenfoot.isKeyDown("down")) { 
        setLocation(getX(), getY()+10);
          }
    }
  public void dtm()
    {
   
    Actor renu =getOneIntersectingObject(Blast1.class);
   MyWorld myworld = (MyWorld)getWorld();
      Actor bros = getOneIntersectingObject(Enemy2.class);
     if(renu!=null){
          Blast3 Blast3 = new Blast3();
          getWorld().addObject(Blast3,getX(),getY());
    getWorld().removeObject(renu);
   
    
    } 
 Actor wk =getOneIntersectingObject(Enemy1.class);
   
     if(wk!=null){
   Blast3 Blast3 = new Blast3();
          getWorld().addObject(Blast3,getX(),getY());
         
    setImage("0.png");
   
     getWorld().removeObject(wk);
    } 
Actor week =getOneIntersectingObject(Blast2.class);
   
if(week!=null){
     Blast3 Blast3 = new Blast3();
          getWorld().addObject(Blast3,getX(),getY());
          
    getWorld().removeObject(week);
  
    
    } else if(bros!=null){
   Blast3 Blast3 = new Blast3();
          getWorld().addObject(Blast3,getX(),getY());
     Greenfoot.playSound("gam.mp3");
   getWorld().removeObject(bros);
    }

}
public void cos(){
    
    timer++;
 if (timer==45){
timer=0;

setImage("Picture"+Greenfoot.getRandomNumber(12)+".png");
getImage().scale(150, 150);
}
}
}

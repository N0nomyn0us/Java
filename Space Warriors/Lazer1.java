import greenfoot.*; 

public class Lazer1 extends Actor
{
    int w=0;
    int crazy=0;
    public void act()
    {
        w++;
        crazy++;
        
       
        
        if(w==10){
          setImage("waver"+Greenfoot.getRandomNumber(5)+".png");
    w=0;
    }
    if(crazy>100){
    setLocation(getX(),getY()-3);
    }
    wady();
   if(isAtEdge()){
     
   Greenfoot.delay(5);
    getWorld().removeObject(this);
    }
 

}
public void wady(){
     Actor unlel =getOneIntersectingObject(Enemy1.class);
if(unlel!=null){
        MyWorld myworld = (MyWorld)getWorld();
   unlel.setImage("Ex.png");
          Greenfoot.delay(2);
   getWorld().removeObject(unlel);
   

    }
}
}

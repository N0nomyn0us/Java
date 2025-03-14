import greenfoot.*; 

public class Lazer2 extends Stars
{
    int timer=0;
   
    Enemy1 Enemy1 = new Enemy1();
  
         public Lazer2(){
   getImage().scale(50,10);
    setRotation(190);
    }    
    
    public void act()
    {
         
       timer++;
        killa();
        setLocation(getX()+40,getY()+10);
     
    newo();
    
}
        
     public void killa()
    {
    Actor dealien =getOneIntersectingObject(Enemy1.class);
   if(dealien!=null){
     MyWorld myworld = (MyWorld)getWorld();
     dealien.setImage("Ex.png");
          Greenfoot.delay(3);

       getWorld().removeObject(dealien);
       myworld.counter.UV++;
   
    } 
    
  
      if(getX()>1100 && isAtEdge()){
        setLocation(getX()-1270, getY());
        }
       if(getY()>670 && isAtEdge()){
        setLocation(getX(), getY()-600);
        }
    }
  public void newo(){
      if(timer==50){
         getImage().scale(50,10);
        }
        if(timer>52){
         setLocation(getX()+10,getY());
         setLocation(getX()+10,getY());
         setLocation(getX()+10,getY());
         setLocation(getX()+10,getY());
         setLocation(getX()+10,getY()); 
         setLocation(getX()+10,getY());
        }
     if (timer>140 && isAtEdge()){
     timer=0;
     getWorld().removeObject(this);
      }
    }
}
    


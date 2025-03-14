import greenfoot.*; 

public class Metor extends Stars
{
    int timer=0;
    Enemy1 Enemy1 = new Enemy1();

         public Metor(){
   getImage().scale(50,10);
    setRotation(200);
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
   
    
  
      if(getWorld().getWidth()>1200 && isAtEdge()){
        setLocation(getX()-1200, getY());
        }
        if(getWorld().getHeight()>600 && isAtEdge()){
        setLocation(getX(), getY()-600);
        }
    }
  public void newo(){
      if(timer==50){
         getImage().scale(300,1);
        }
        if(timer>52){
         setLocation(getX()+10,getY());
         setLocation(getX()+10,getY());
          setLocation(getX()+10,getY());
           setLocation(getX()+10,getY());
        }
     if (timer>140 && isAtEdge()){
     timer=0;
     getImage().scale(50,1);
      }
    }
}
    


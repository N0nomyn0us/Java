import greenfoot.*;  
public class Enemy1 extends Actor
{
    int help=0;
    int wp=0;
    
   public Enemy1()
   {
    
    getImage().scale(90,90);
     
    }
    
    
    public void act()
    {
       Actor unl =getOneIntersectingObject(Blast3.class);
        wp++;
        ashoot();
        setLocation(getX(),getY()+4);
        if(isAtEdge()){
             MyWorld myworld = (MyWorld)getWorld();
            
            Greenfoot.playSound("Windows Error.wav");
            myworld.counter.UV--;
            getWorld().removeObject(this);
        }
        
        
        else if(unl!=null){
        setLocation(getX()+40,getY()-10);
         if(isAtEdge()){
            getWorld().removeObject(this);
        }
        }
        
        
}
    public void ashoot(){
        help++;
          
        if(help==50){
          Blast1 Blast1 = new Blast1(); 
          getWorld().addObject(Blast1,getX(),getY());
          help=0;
        }
        
    }
    
}




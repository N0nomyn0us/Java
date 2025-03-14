import greenfoot.*;  
public class Counter extends Actor
{
    int UV=0;
    
    public Counter(){
    setImage(new GreenfootImage( "Score: "+UV ,40   ,Color.BLUE   , new Color(0,0,0,0) , Color.GREEN ));
    }
    public void act()
    {
       
     setImage(new GreenfootImage( "Score: "+UV ,40   ,Color.BLUE   , new Color(0,0,0,0) , Color.GREEN ));
        if(UV<0){
        UV=0;
        
    }
        
    }
}

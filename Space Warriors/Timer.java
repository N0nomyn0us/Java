import greenfoot.*;  
import greenfoot.Color;

public class Timer extends Actor
{
   int timeing;
    public Timer(){
    setImage(new GreenfootImage( "Timer : "+(timeing), 40   ,Color.GREEN   ,  new Color(0,0,0,0) , Color.BLUE ));
    
    }
    public void act()
    
    {
        timeing++;
         setImage(new GreenfootImage( "Timer :"+(timeing/30), 40   ,Color.BLUE  ,  new Color(0,0,0,0) , Color.GREEN));
        }
}

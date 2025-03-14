import greenfoot.*; 
public class Health extends Actor
{
   int soda=20;
    public Health(){
    setImage(new GreenfootImage( "Health: "+ soda , 40   ,Color.WHITE   , new Color(0,0,0,0) , Color.RED ));
    
    }
    public void act()
    {
     setImage(new GreenfootImage( "Health: "+ soda  , 40   ,Color.WHITE   , new Color(0,0,0,0) , Color.RED ));
    }
}

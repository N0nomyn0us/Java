import greenfoot.*;  

public class Blast3 extends Actor
{
    int time=10;
    public Blast3(){
    getImage().scale(100, 100);
    }
    public void act()
    {
        time--;
      
        if(time==5){
        getWorld().removeObject(this);
        time=10;
        }
    }
}

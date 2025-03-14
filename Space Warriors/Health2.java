import greenfoot.*; 

public class Health2 extends Actor
{
    int time=0;
    public Health2(){
    getImage().scale(60, 70);
    }
    public void act()
    {
        time++;
        if(time==2){
        getWorld().removeObject(this);
        Greenfoot.playSound("Speech On.wav");
        time=0;
        }
    }
}

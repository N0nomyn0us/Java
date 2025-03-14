import greenfoot.*; 

public class Fire extends Actor
{
    
    int timer=0;
    
    public Fire()
    {
        setImage("laser"+Greenfoot.getRandomNumber(7)+".png");
    getImage().scale(getImage().getWidth()/10,300);
    }    
    public void act()
    {
        setLocation(getX(),getY()-50);
       killa();
    }
    public void killa()
    {
    Actor dealien =getOneIntersectingObject(Enemy1.class);
    MyWorld myworld = (MyWorld)getWorld();
   if(dealien!=null){
   
 Blast3 Blast3 = new Blast3();
 getWorld().addObject(Blast3,getX(),getY());
   getWorld().removeObject(dealien);
   Gift gift = new Gift();
    getWorld().addObject(gift,getX(),getY());
    } 
    else if(isAtEdge())
        {
            getWorld().removeObject(this);
            }
        }
}

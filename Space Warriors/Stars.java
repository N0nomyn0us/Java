import greenfoot.*;  

public class Stars extends Actor
{
    int conner=0;
    int bona;
    int timer=0;
   public Stars()
    {
       
    getImage().scale(50,50);
    setRotation(90);
    }    
    
    public void act()
    {
 
move(20);
       conner++;
        turn(Greenfoot.getRandomNumber(60));
        killa();
       bona++;
      cos();
        
       
         if (conner==80){
            
            
            getImage().scale(1000,4);
        }
            
        if(conner>100){
            
            getImage().scale(1000,10);
            
            
            
            
            }

       if(conner==200){
             getWorld().removeObject(this);
            conner=0;
        }
          
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
    Actor imuune =getOneIntersectingObject(Enemy2.class);
   if(imuune!=null){
    
    turn(180);
    
   
    
    } 
    }
    
    
    public void cos(){
    
    timer++;
 if (timer==20){
timer=0;
getImage().scale(50,50);
setImage("Picture"+Greenfoot.getRandomNumber(12)+".png");
}
}
}

import greenfoot.*;  

public class Enemy2 extends Actor
{
    int help=0;
    int wp=0;
    int healthys=100;
    int P=0;
   public Enemy2()
   {
    
    getImage().scale(100,100);
     
    }
    
    
    public void act()
    {
      P++;

      getGift();
      if(P==30){
        setLocation(Greenfoot.getRandomNumber(1200),(Greenfoot.getRandomNumber(120)));
    P=0;
    }
    toot();
}
    public void getGift(){
        help++;
        if(help==20){
          Blast2 Blast2 = new Blast2(); 
          getWorld().addObject(Blast2,getX()+2,getY()+70);
          help=0;
        }
        
    }
       public void toot(){
     Actor kill =getOneIntersectingObject(Fire.class);
      Actor imunning = getOneIntersectingObject(Stars.class);
      Actor i = getOneIntersectingObject(Lazer2.class);
      Actor imen = getOneIntersectingObject(Lazer1.class);
     if(healthys<0){
         MyWorld myworld = (MyWorld)getWorld();
          setImage("Ex.png");
          Greenfoot.delay(10);
     MysteryBox MysteryBox = new MysteryBox();
     getWorld().addObject(MysteryBox,getX(),getY());
     Fire fire = new Fire();
       myworld.counter.UV+=10;
      
       getWorld().removeObject(this);            
            }
             if(kill!=null){ 
    MyWorld myworld = (MyWorld)getWorld();
    healthys-=33;
    
    }
    if(imunning!=null){
        MyWorld myworld = (MyWorld)getWorld();
     move(10);
    healthys-=2;
    
    } 
    if(i!=null){
    MyWorld myworld = (MyWorld)getWorld();
    move(10);
    healthys-=2;
    
    
    }
    if(imen!=null){
    
    healthys-=22;
    
    
    }
}
}





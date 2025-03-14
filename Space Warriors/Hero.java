import greenfoot.*; 


public class Hero extends Actor
{
    Shield1  Shield1  = new Shield1 ();
    int tiny=0;
    int sh=100;
    int fixer=0;
    int L;
    int l;
    int m;
    int epicer=1000;
     int weare=1;
     int howr=1;
    Health2 Health2 = new Health2();
    Blast3 Blast3 = new Blast3();
    int lemon=0;
    public Hero()
    {
    getImage().scale(100,100);
    
    }
    public void act()
    {
        epic();
        moon();
        dye();
        dye2();
        dye3();
        dye4();
        dye5();
        //weare++;
        fixer++;
        epicer++;
        
      moverocket();
      shootfire();
      sh++;
         gs();
         rs();
         ex();
    L++;
    l++;
    }  
public void moverocket()
{
    if(Greenfoot.isKeyDown("shift")){
        
     if(Greenfoot.isKeyDown("right")) { 
        setLocation(getX()+20, getY());
          }
          
          if(Greenfoot.isKeyDown("left")) { 
        setLocation(getX()-20, getY());
          }
          
          if(Greenfoot.isKeyDown("up")) { 
        setLocation(getX(), getY()-20);
          }
          
          if(Greenfoot.isKeyDown("down")) { 
        setLocation(getX(), getY()+20);
          }
    
    
    }
    
    if(Greenfoot.isKeyDown("right")) { 
        setLocation(getX()+10, getY());
          }
          
          if(Greenfoot.isKeyDown("left")) { 
        setLocation(getX()-10, getY());
          }
          
          if(Greenfoot.isKeyDown("up")) { 
        setLocation(getX(), getY()-10);
          }
          
          if(Greenfoot.isKeyDown("down")) { 
        setLocation(getX(), getY()+10);
          }
}
public void shootfire()
{
if(Greenfoot.isKeyDown("space")&& L>4)
{
Greenfoot.playSound("Windows Ding.wav");
L=0;

}
if(Greenfoot.mousePressed(null) )
{
Fire fire = new Fire();
getWorld().addObject(fire,getX(),getY()-100);
l=0;
    Greenfoot.playSound("laserGun.mp3");

}

 
        }
        public void gs(){
        if(sh==800){
        getWorld().addObject(Shield1 ,getX(),getY());
        Greenfoot.playSound("lup.mp3");
      
        }
        }
        public void rs(){
         if(sh==1350){
        Greenfoot.playSound("bubble.wav");
        getWorld().removeObject(Shield1 );
        sh=0;
      

        }
        
    }
    public void ex(){
    Actor geton =getOneIntersectingObject(Gift.class);
    Actor chess =getOneIntersectingObject(MysteryBox.class);
    if(geton!=null){
        MyWorld myworld = (MyWorld)getWorld();
        myworld.Health.soda++;
         myworld.counter.UV++;
        
   getWorld().addObject(Health2,getX(),getY());
    
    getWorld().removeObject(geton);
     Greenfoot.playSound("Speech On.wav");
   
         weare+=1;
       
   
 

    }
    if(chess!=null){
        MyWorld myworld = (MyWorld)getWorld();
       myworld.Health.soda+=5;
       chess.setImage("Picture2.png");
       Greenfoot.delay(1);
     getWorld().addObject(Health2,getX(),getY());
    howr++;
    getWorld().removeObject(chess);
     Greenfoot.playSound("tt.mp3");
    
 

    }
    }
    public void dye(){
     
    MyWorld myworld = (MyWorld)getWorld();
    if (myworld.Health.soda>=51){
    myworld.Health.soda=50;
    }
     Actor dye =getOneIntersectingObject(Blast1.class);
      
     if(dye!=null){        
 getWorld().addObject(Blast3,getX(),getY());
    myworld.Health.soda-=5;
       getWorld().removeObject(dye);
    Greenfoot.playSound("gam.mp3");
    }
     
    }  
    public void dye2(){
    Actor mines =getOneIntersectingObject(Enemy1.class);
    
    if(mines!=null){
   MyWorld myworld = (MyWorld)getWorld();
   
getWorld().addObject(Blast3,getX(),getY());
        myworld.Health.soda--;
    
    getWorld().removeObject(mines);
    Greenfoot.playSound("gam.mp3");
    }  
    }
    public void dye3(){
       MyWorld myworld = (MyWorld)getWorld();
      
    if(myworld.Health.soda<=0){
         
    setImage("exp.png");
    Greenfoot.playSound("explosion.mp3");
    GameOver e = new GameOver();
    getWorld().addObject(e,600,300);
    Greenfoot.stop();
    }
    
    }
    public void dye4(){
        Actor bros = getOneIntersectingObject(Enemy2.class);
     if(bros!=null){
       MyWorld myworld = (MyWorld)getWorld();
      
getWorld().addObject(Blast3,getX(),getY());
        myworld.Health.soda-=15;
        Greenfoot.playSound("explosion.mp3");
      getWorld().removeObject(bros);
    }
    }
    public void dye5(){
        Actor faill =getOneIntersectingObject(Blast2.class);
    if(faill!=null){
   MyWorld myworld = (MyWorld)getWorld();
        myworld.Health.soda-=10;
    faill.setImage("ElE.png");
    
    getWorld().addObject(Blast3,getX(),getY());
   
 
    getWorld().removeObject(faill);
   Greenfoot.playSound("gam.mp3");
    }
    }
    public void moon(){
    
    }
    public void epic(){
          
        if(epicer>1000 && Greenfoot.isKeyDown("c")){
   
   MyWorld myworld = (MyWorld)getWorld();
   Lazer1 Lazer1 = new Lazer1();
    myworld.Health.soda+=20;
    getWorld().addObject(Lazer1,594,679);
    epicer-=1000;
    }
   if(howr < 0){
    weare=0;
    }
    if(0 > epicer){
    epicer=0;
    }
    if(weare < 0){
    weare=0;
    }
     if(weare>0 && Greenfoot.isKeyDown("s")){
   Lazer2 Lazer2 = new Lazer2();
    getWorld().addObject(Lazer2,Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(600));
    weare-=1;
    }
       if(howr>0 && Greenfoot.isKeyDown("m")){
   Stars stars = new Stars();
    getWorld().addObject(stars,Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(600));
    Stars stars1 = new Stars();
    getWorld().addObject(stars1,Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(600));
    Stars stars2 = new Stars();
    getWorld().addObject(stars2,Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(600));
    howr-=1;
    }
}
    }






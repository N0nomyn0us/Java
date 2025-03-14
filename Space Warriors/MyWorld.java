import greenfoot.*;  
public class MyWorld extends World
{
    
 Counter counter = new Counter();
 Health Health = new Health();
 Hero Hero = new Hero();
 Enemy1 Enemy1 = new Enemy1();
 Lazer2 Lazer2 = new Lazer2();
 
    Timer Timer = new Timer();
    int count=0;
    int noboss=0;
    int travle=300;
    int A=1000;
    int gi=900;
    public MyWorld()
    {    
        super(1250, 730, 1); 
        prepare();
    
    }
    
    private void prepare()
    {
        Hero Hero = new Hero();
        addObject(Hero,568,501);

        Hero.setLocation(548,499);
        addObject(counter,73,41);
        counter.setLocation(108,34);

        addObject(Health,994,26);
        Health.setLocation(1026,29);

        addObject(Timer,994,26);
        Timer.setLocation(105,76);
        Health.setLocation(105,115);

        removeObject(Hero);
        Hero rocket2 = new Hero();
        addObject(rocket2,598,629);
        
        GreenfootSound backgroundMusic = new GreenfootSound("starwars.mp3");
        backgroundMusic.playLoop();
        backgroundMusic.setVolume(50);
        
    }

    public void act()
    {
        
        count++;
        noboss++;
        A++;
        if (count==40){
        
     Enemy1 Enemy1 = new Enemy1();
     
     addObject(Enemy1,Greenfoot.getRandomNumber(1250),Greenfoot.getRandomNumber(10));
     count=0;
    }
    
    }
    
     {
        
    Enemy2 boss= new Enemy2();
     
     addObject(boss,Greenfoot.getRandomNumber(900),100);
     noboss=0;
    }
    }


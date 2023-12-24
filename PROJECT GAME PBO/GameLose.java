import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameLose extends World {
    private GreenfootImage imgLose = new GreenfootImage("lose.png");
    
    public GameLose() {    
        super(640, 480, 1); 
    }
    
    public void act(){
        setBackground(imgLose);
        Greenfoot.playSound("hore.wav");
        Greenfoot.stop();
    }
}

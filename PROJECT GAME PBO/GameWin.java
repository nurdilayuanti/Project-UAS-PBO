import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameWin extends World {
    private GreenfootImage imgWin = new GreenfootImage("win.png");
    
    public GameWin() {    
        super(640, 480, 1);
    }
    
    public void act(){
        setBackground(imgWin);
        Greenfoot.playSound("hore.wav");
        Greenfoot.stop();
    }
}

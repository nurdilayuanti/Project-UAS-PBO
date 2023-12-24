import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Macaron extends Benda {
    public void act() {
        setLocation(getX(), getY()+5);
        MacaronFall();
    } 
    
    public void  MacaronFall() {  
        if (atWorldEdge()) {
            getWorld().removeObject(this); 
            Greenfoot.playSound("lemonfall.wav"); 
        }
    }
}


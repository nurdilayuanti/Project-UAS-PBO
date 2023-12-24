import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Muffin extends Benda {
    public void act() {
        setLocation(getX(), getY()+4); 
        MuffinFall(); 
    } 
    
    public void  MuffinFall() {
        if (atWorldEdge()) {
            getWorld().removeObject(this); 
            Greenfoot.playSound("lemonfall.wav"); 
        }
    }
}

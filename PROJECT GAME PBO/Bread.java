import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bread extends Benda {
    public void act() {
        setLocation(getX(), getY()+4); 
        breadFall(); 
    } 
    
    public void  breadFall() {
        if (atWorldEdge()) {
            getWorld().removeObject(this); 
            Greenfoot.playSound("lemonfall.wav"); 
        }
    }
}

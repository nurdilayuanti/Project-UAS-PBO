import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Donut extends Benda {
    public void act() {
        setLocation(getX(), getY()+6);
        DonutFall();
    } 
    
    public void  DonutFall() {
        if (atWorldEdge()) {
            getWorld().removeObject(this);
            Greenfoot.playSound("lemonfall.wav");
        }
    }
}

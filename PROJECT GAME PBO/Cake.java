import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cake extends Benda {
    public void act(){
        setLocation(getX(), getY()+6); 
        CakeFall(); 
    } 
    
    public void  CakeFall() {
        if (atWorldEdge()) {
            getWorld().removeObject(this); 
            Greenfoot.playSound("lemonfall.wav"); 
        }
    }
}


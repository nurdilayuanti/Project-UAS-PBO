import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pizza extends Benda {
    public void act() {
        setLocation(getX(), getY()+5); 
        PizzaFall(); 
    } 
    
    public void  PizzaFall() {
        if (atWorldEdge()) 
        {
            getWorld().removeObject(this); 
            Greenfoot.playSound("lemonfall.wav"); 
        }
    }
}


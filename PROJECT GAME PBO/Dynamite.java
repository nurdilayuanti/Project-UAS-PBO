import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Dynamite extends Benda {
    public void act() {
       setLocation(getX(), getY()+5);
       meledak();
    }    
    
    public void meledak() {
        if (canSee(Keranjang.class)) {
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(-3); 
            Greenfoot.playSound("bomb.wav"); 
        }
        
        if (atWorldEdge()) {
            getWorld().removeObject(this); 
        }
    }
}


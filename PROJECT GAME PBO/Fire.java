import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
public class Fire extends Benda {
    public void act() {
       setLocation(getX(), getY()+6);
       membakar();
    }    
    
    public void membakar() {
        if (canSee(Keranjang.class)) {
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(-5); 
            Greenfoot.playSound("lemonfall.wav"); 
        }
         
        if (atWorldEdge()) {
            getWorld().removeObject(this); 
        }
    }    
}
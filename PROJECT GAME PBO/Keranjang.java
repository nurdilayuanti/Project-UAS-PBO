import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Keranjang extends Benda {
    public void act() {
        moveKeranjang(); 
        objectDisappear(); 
    }    
       
    public void objectDisappear() {
        if (canSee(Muffin.class)) {
            eat(Muffin.class); 
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(5);
            Greenfoot.playSound("score.wav");
        }
         
        if (canSee(Bread.class)) {
            eat(Bread.class); 
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10); 
            Greenfoot.playSound("score.wav");
        }
         
        if (canSee(Macaron.class)) {
            eat(Macaron.class); 
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(15); 
            Greenfoot.playSound("score.wav"); 
        }
         
        if (canSee(Pizza.class)) {
            eat(Pizza.class); 
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(20); 
            Greenfoot.playSound("score.wav"); 
        }
         
        if (canSee(Donut.class)) {
            eat(Donut.class); 
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(7); 
            Greenfoot.playSound("score.wav"); 
        }
         
        if (canSee(Cake.class)) {
            eat(Cake.class);
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10);
            Greenfoot.playSound("score.wav"); 
        } 
    }
       
    public void moveKeranjang() {
        if (Greenfoot.isKeyDown("left")) {
            move(-10); 
        }
        if (Greenfoot.isKeyDown("right")) {
            move(10); 
        }
    }
}



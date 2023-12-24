import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Counter extends Actor {
    public int totalPoin = 0;
    
    public Counter() {
        setImage(new GreenfootImage("0", 30, Color.WHITE, Color.BLACK)); 
    }
    public void Counting (int hitung) {
        totalPoin += hitung;
        setImage(new GreenfootImage("" + totalPoin, 30, Color.WHITE, Color.BLACK)); 
    }
}

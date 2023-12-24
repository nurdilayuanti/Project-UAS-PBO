import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CountLevel extends Actor {
    Counter lvl = new Counter();
    String[] levelNow = {"Level 1", "Level 2", "Level 3"};
    
    public void act() {
        checkLevel();
    }    
    
    public void checkLevel(){
        setImage(new GreenfootImage(levelNow[0], 30, Color.WHITE, Color.BLACK));
        if (lvl.totalPoin >= 50){
            setImage(new GreenfootImage(levelNow[1], 30, Color.WHITE, Color.BLACK));
        }
        
        if (lvl.totalPoin >= 400) {
            setImage(new GreenfootImage(levelNow[2], 30, Color.WHITE, Color.BLACK));
        } 
    }
}

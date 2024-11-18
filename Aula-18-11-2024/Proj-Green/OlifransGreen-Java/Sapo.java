import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sapo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sapo extends Actor
{
    /**
     * Act - do whatever the Sapo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(6);// Add your action code here.
        if(Greenfoot.getRandomNumber(100)< 10)
        {
            turn(Greenfoot.getRandomNumber(15) - 30);            
        }
        comeFormiga();
    }
    
    /**
     * 
     */
    public void comeFormiga()
    {
        if(isTouching(Formiga.class))
        {
            removeTouching(Formiga.class);
            getWorld() .showText("Você perdeu! Tente mais uma vez", 300, 200);
        }
    }
    
}

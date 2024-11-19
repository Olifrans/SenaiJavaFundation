import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Formiga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Formiga extends Actor
{
    private int qty = 0;
    
    /**
     * Act - do whatever the Formiga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        comerCupcake();
    }
        
    /**
    * 
     */
        
    public void comerCupcake()
    {
         if(isTouching(Cupcake.class))
        {
            removeTouching(Cupcake.class);
            qty = qty +1;
            getWorld().showText("Cupcake:" + qty, 100, 30);
        }
        // Add your action code here.
    }
}

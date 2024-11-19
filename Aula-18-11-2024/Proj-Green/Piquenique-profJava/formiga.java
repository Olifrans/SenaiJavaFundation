import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class formiga extends Actor
{
    private int qtd = 0;

    /**
     * Act - do whatever the formiga wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        comerCupcake();
    }

    /**
     * 
     */
    public void comerCupcake()
    {
        if (isTouching(Cupcake.class)) {
            removeTouching(Cupcake.class);
            qtd = qtd + 1;
            getWorld().showText("Cupcake:" + qtd, 100, 30);
        }
    }
}

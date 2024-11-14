// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PeixeVerde extends Actor
{

    /**
     * Act - do whatever the PeixeVerde wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        if (Greenfoot.isKeyDown("left")) {
            turn(-15);
        }
        turn(15);
        if (Greenfoot.isKeyDown("right")) {
            turn(-15);
        }
    }
}

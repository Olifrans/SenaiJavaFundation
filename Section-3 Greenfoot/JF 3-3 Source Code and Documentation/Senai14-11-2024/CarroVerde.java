// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CarroVerde extends Actor
{

    /**
     * Act - do whatever the CarroVerde wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(6);
        if (Greenfoot.isKeyDown("go up")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("go down")) {
            turn(5);
        }
    }
}

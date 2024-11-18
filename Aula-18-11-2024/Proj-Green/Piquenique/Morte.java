// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Morte extends Actor
{

    /**
     * Act - do whatever the Morte wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(6);
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(15) - 30);
        }
        comeFormiga();
    }

    /**
     * 
     */
    public void comeFormiga()
    {
        if (isTouching(formiga.class)) {
            removeTouching(formiga.class);
            getWorld().showText("Você perdeu! Tente novamente", 300, 200);
        }
    }
}

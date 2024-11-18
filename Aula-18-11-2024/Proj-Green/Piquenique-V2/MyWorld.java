// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cupcake cupcake =  new  Cupcake();
        addObject(cupcake, 524, 39);
        Cupcake cupcake2 =  new  Cupcake();
        addObject(cupcake2, 496, 133);
        Cupcake cupcake3 =  new  Cupcake();
        addObject(cupcake3, 503, 273);
        Cupcake cupcake4 =  new  Cupcake();
        addObject(cupcake4, 372, 230);
        Cupcake cupcake5 =  new  Cupcake();
        addObject(cupcake5, 385, 101);
        Cupcake cupcake6 =  new  Cupcake();
        addObject(cupcake6, 92, 334);
        cupcake4.setLocation(180, 281);
        cupcake3.setLocation(316, 316);
        cupcake5.setLocation(308, 189);
        cupcake2.setLocation(558, 365);
        Cupcake cupcake7 =  new  Cupcake();
        addObject(cupcake7, 494, 133);
        Cupcake cupcake8 =  new  Cupcake();
        addObject(cupcake8, 446, 224);
        Cupcake cupcake9 =  new  Cupcake();
        addObject(cupcake9, 92, 38);
        cupcake6.setLocation(68, 340);
        cupcake4.setLocation(180, 268);
        cupcake5.setLocation(288, 167);
        cupcake5.setLocation(110, 168);
        cupcake7.setLocation(324, 95);
        cupcake5.setLocation(186, 150);
        Cupcake cupcake10 =  new  Cupcake();
        addObject(cupcake10, 528, 148);
        Morte morte =  new  Morte();
        addObject(morte, 420, 45);
        Morte morte2 =  new  Morte();
        addObject(morte2, 239, 323);
        Morte morte3 =  new  Morte();
        addObject(morte3, 454, 321);
        Morte morte4 =  new  Morte();
        addObject(morte4, 187, 59);
        formiga formiga =  new  formiga();
        addObject(formiga, 36, 198);
        removeObject(morte4);
        formiga.setLocation(38, 344);
        cupcake6.setLocation(36, 224);
        cupcake5.setLocation(236, 190);
        cupcake7.setLocation(288, 65);
        cupcake5.setLocation(336, 225);
    }
}

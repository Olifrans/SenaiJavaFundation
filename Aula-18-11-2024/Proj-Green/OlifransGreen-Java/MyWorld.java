import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Formiga formiga = new Formiga();
        addObject(formiga,27,203);
        Cupcake cupcake = new Cupcake();
        addObject(cupcake,400,184);
        Sapo sapo = new Sapo();
        addObject(sapo,186,95);
        Sapo sapo2 = new Sapo();
        addObject(sapo2,165,280);
        Sapo sapo3 = new Sapo();
        addObject(sapo3,154,191);
        Cupcake cupcake2 = new Cupcake();
        addObject(cupcake2,530,56);
        Cupcake cupcake3 = new Cupcake();
        addObject(cupcake3,532,324);
        Cupcake cupcake4 = new Cupcake();
        addObject(cupcake4,337,57);
        Cupcake cupcake5 = new Cupcake();
        addObject(cupcake5,369,320);
        Cupcake cupcake6 = new Cupcake();
        addObject(cupcake6,47,56);
        Cupcake cupcake7 = new Cupcake();
        addObject(cupcake7,55,313);
        Cupcake cupcake8 = new Cupcake();
        addObject(cupcake8,247,186);
        Cupcake cupcake9 = new Cupcake();
        addObject(cupcake9,514,189);
        Cupcake cupcake10 = new Cupcake();
        addObject(cupcake10,254,326);
        cupcake8.setLocation(299,133);
        cupcake4.setLocation(375,96);
        sapo.setLocation(299,41);
        cupcake4.setLocation(169,45);
        sapo.setLocation(328,54);
        sapo3.setLocation(327,247);
        cupcake10.setLocation(128,164);
        sapo2.setLocation(194,339);
        cupcake10.setLocation(155,214);
    }
}

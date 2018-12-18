import TurtleGraphics.*;
public class ObjectsReview {

    public static void main(String[] args) {
        Pen p1 = new StandardPen();
        /*
            Objects -> are created from a CLASS
            Making an object = Instantiating an Object
            "p1" is an INSTANCE of the Standard Pen Class
        */
        p1.move(25); //moves 25 pixels
        p1.move(25, 25); //moves to location (25,25)
        /*
        p1. (dot) shows you all the methods (abilities) of a Pen
        Some of these do NOT come from the pen class
        Some come from the "Object" class, which is the MOTHER of all classes
        Every object in Java is a decendant (child) of the Object Class
        So - all objects inherit the basic abilities of the object class
        Examples: getClass, equals, notify, wait
        */
        Pen p2,p3;
        SketchPadWindow w = new SketchPadWindow (500,500);
        p2 = new WigglePen(w);
        p3 = new RainbowPen(w);
        
        /*
        p1,p2,p3 are ALL Pens but are also different types of pens
        They ALL have "Pen" as their parent and respond to the same commands
        But they doo them differently - Pen is where the base commands are defined
        It is common to be able to make objects in different ways: (with or without
        a sketchpad window)
        */
        //p2.move(25,25);
        //p3.move(-25,-25);
        drawSquare(p2, 10,10,100);
        drawSquare(p3, -100,10,50);
        
    }
    //Method review
    public static void drawSquare (Pen p, int x, int y, int size){
        p.up();
        p.move(x, y);
        p.down();
        p.setDirection(0);
        for (int i = 0; i < 4; i++) {
            p.move(size);
            p.turn(90);
        }
        /*
        this method requires a Pen object -  since p1, p2 and p3 are all PENS
        All can be used to draw a square
        */
    }
}

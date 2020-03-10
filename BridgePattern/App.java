package com.BridgePattern.BridgePattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Shape redCircle = new Circle(99,99, 9, new RedCircle());
        Shape blueCircle = new Circle(99,99, 9, new BlueCircle());

        redCircle.draw();
        blueCircle.draw();
    }
}

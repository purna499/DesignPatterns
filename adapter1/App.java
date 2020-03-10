package com.adapter1.adapter1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {Sparrow sparrow = new Sparrow(); 
    ToyDuck toyDuck = new PlasticToyDuck(); 
    ToyDuck birdAdapter = new BirdAdapter(sparrow); 
    System.out.println("toy_duck"); 
    toyDuck.squeak(); 
    System.out.println("bird_adapter"); 
    birdAdapter.squeak(); 
    System.out.println("sparrow"); 
    sparrow.fly(); 
    sparrow.makeSound(); 
    }
}
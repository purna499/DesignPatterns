package com.adapter1.adapter1;
class BirdAdapter implements ToyDuck 
{ 
    Bird bird; 

    public void squeak() 
    { 
        bird.makeSound(); 
    } 
    public BirdAdapter(Bird bird) 
    { 
        this.bird = bird; 
    } 
  
} 
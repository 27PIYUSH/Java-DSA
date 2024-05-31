package classes_and_objects.OOPS2;

import classes_and_objects.OOPS3.generics.PrintInterface;

public class Vehicle implements PrintInterface{
    
    int maxspeed;
    protected String color; // Protected ---> Same as default/friendly but provides more ---> we can access object in sub class outside the package

    public Vehicle(int maxspeed){
        this.maxspeed = maxspeed;
    }
    public void print(){
        System.out.println("Max Speed : "+ maxspeed);
        System.out.println("Color : "+ color);
    }

}

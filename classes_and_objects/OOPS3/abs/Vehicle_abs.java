package classes_and_objects.OOPS3.abs;

public abstract class Vehicle_abs { // abstract class... 

    int maxspeed;
    String color;

    public Vehicle_abs(int maxspeed){
        this.maxspeed = maxspeed;
    }

    public abstract boolean isMotorized(); // incomplete absrtract function

    public void print(){
        System.out.println("Max Speed : "+ maxspeed);
        System.out.println("Color : "+ color);
    }

}

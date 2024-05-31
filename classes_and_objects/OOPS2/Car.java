package classes_and_objects.OOPS2;

// INHERITANCE::: Car class inherits some properties from the vehice class

public class Car extends Vehicle{
    String modelNumber;
    String type;
    
    // if we call the constructor of derieved class then super class constructor is automatically called
    // if it is default constructor then its ok but if we modify the constructor of parent then super is used
    public Car(String type , int maxspeed){
        super(maxspeed);
        this.type = type;
    }

    public String type(){
        return type;
    }

    public void printCar(){
        // System.out.println("Max Speed : "+ maxspeed);
        // System.out.println("Color : "+ color);

        // we can use super to access from parent class
        super.print();
        System.out.println("Model : "+ modelNumber);
        System.out.println("Type : "+type);
    }
}

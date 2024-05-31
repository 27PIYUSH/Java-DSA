package classes_and_objects.OOPS3.abs;

public class VehicleUse_abs {

    public static void main(String[] args) {

        // Vehicle_abs v = new Vehicle_abs(20); // cannot create vehicle type object 
        Vehicle_abs v = new Car_abs("Hybrid" , 450); // v pointing towards car... Polymorphism
        System.out.println(v.isMotorized());

        Car_abs c = new Car_abs("Hybrid" ,325 );
        c.color = "Grey";
        c.modelNumber = "Mercedes-Benz AMG GT Black";
        c.printCar();
    }
}
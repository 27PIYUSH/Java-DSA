package classes_and_objects.OOPS2;

public class VehicleUse {
    
    public static void main(String[] args) {

        // Vehicle v = new Vehicle();
        // v.print();

        // polymorphism::: Somthing taking multiple forms
        Vehicle v = new Car("Hybrid" , 325); // v can point towards vehicle or towards any sub class
        // System.out.println(v.type()); // v is pointing towards car but v is a vehicle refrence and it dose not have type function
        v.print(); // vehicle specific functions can be called

        Car c = new Car("Hybrid" ,325 );
        c.color = "Grey";
        c.modelNumber = "Mercedes-Benz AMG GT Black";
        c.printCar();
    }
}
// first search function in chlid class and then in vehicle class


package classes_and_objects.OOPS3.abs;

public class Car_abs extends Vehicle_abs {

    String modelNumber;
    String type;

    public Car_abs(String type , int maxspeed){
        super(maxspeed);
        this.type = type;
    }

    public boolean isMotorized(){
        return false;
    }

    public void printCar(){

        super.print();
        System.out.println("Model : "+ modelNumber);
        System.out.println("Type : "+type);
    }
}
// there are two options:::
// 1) make it abstract class ---> incomplete
// 2) get rid of the incompleteness
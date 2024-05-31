package classes_and_objects.OOPS3.interfaces;

public class Car extends Vehicle implements VehicleInterface , CarInterface{  // only extends single class but can implement multiple interfaces
    public void print(){

    }

    public int getMaxSpeed(){
        return 190;
    }

    public String getCompany(){
        return null;
    }
}

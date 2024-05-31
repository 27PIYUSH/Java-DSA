package classes_and_objects.OOPS3.interfaces;

public interface VehicleInterface{ //extends CarInterface // interface ---> by default the functions are abstract , an interface can extends another interface

    public int getMaxSpeed();
    public void print();
    
    public final static double Pi = 3.14; // generally this kind of data members are stored in interface
}

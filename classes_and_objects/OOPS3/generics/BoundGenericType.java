package classes_and_objects.OOPS3.generics;

import classes_and_objects.OOPS2.Vehicle;

public class BoundGenericType {
    
    public static <T extends PrintInterface> void printArray(T arr[]) { // Bound what kind of T gets accepted 
        for(int i = 0 ; i<arr.length ; i++){
            arr[i].print();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle v[] = new Vehicle[10];
        for(int i = 0 ; i < 10 ; i++){
            v[i] = new Vehicle(10);
        }
        printArray(v);
    }
}

// 1) No bounds ---> unable to use print function
// 2) Only vehicle subclass ---> can use print() but it is restricted
// 3) only classes which implement printInterface
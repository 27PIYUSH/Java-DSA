package ArrayList; 
// Dynamic Array
// Default capacity = 10
// Increase capacity by 1.5 times
// Grow and shrink automatically

import java.util.ArrayList;

public class ArrayListBasics {
    
    public static void main(String[] args) {
        // Create arrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // add elements to arrayList
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(0, 0); // add element at the given index by shifting the other elements
        
        // remove elements
        Integer x = 10;
        arr.remove(x); // remove 10 from arraylist
        arr.remove(2);

        // set
        arr.set(0, 70);

        // size of arrayList
        System.out.println(arr.size());

        // get element at particular index
        System.out.println(arr.get(0));

        // print elements
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }

        for (Integer j : arr) { // for each is used for travelling all over the array not while changing the elements of array 
            System.out.print(j+" ");    
        }

    }

}

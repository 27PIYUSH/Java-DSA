package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class CollectionsLL {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); // doubly linked list implementation
        
        // to find the size of ll
        System.out.println(list.size());
            
        // to add elements
        list.add(10);
        list.add(10);

        list.addFirst(48); // add to the first

        list.set(2, 29); // set elements
        
        // print
        // for(int i = 0 ; i<list.size() ; i++){
        //     System.out.print(list.get(i) + " ");
        // }

        // convert into array
        int sum = 0;
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        for(int i = 0 ; i<arr.length ; i++){
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(sum);

        System.out.println("Arrays.toString: " + Arrays.toString(arr));
    }

}

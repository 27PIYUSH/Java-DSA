import java.util.HashMap;
import java.util.Set;

public class HashmapUse {
    
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        
        // insert --> O(1)
        map.put("abc", 1);
        map.put("def", 2);

        // size 
        System.out.println("Size : " + map.size());

        // to check if map contains value or not
        if(map.containsKey("abc")){
            System.out.println("Has abc");
        }

        // in maps mostly we work on the key functions as they are faster than the value ones --> mostly values are of O(n) and keys are of O(1)
         
        // if(map.containsValue(2)){
        //     System.out.println("Has 2");
        // }

        // get value --> returns the value or return null if no value is found
        int v = 0;
        // int a = map.get("abc1");  // if no value of integer is present it will give null pointer exception
        // System.out.println(a);

        if(map.containsKey("abc1")){
            v = map.get("abc1");
        }
        System.out.println(v);

        // replace 
        map.replace("abc", 10);
        System.out.println(map.get("abc"));
        
        // remove
        int s = map.remove("abc");
        System.out.println(s);

        // iterate 
        Set<String> keys = map.keySet();   // it returns all the keys 
        for(String str: keys){
            System.out.println(str);
        }

    }
}
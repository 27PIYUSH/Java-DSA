package Problems;
import java.util.*;

public class RemoveDuplicates {

    static ArrayList<Integer> Removeduplicate(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>(); 
        for( int ele : arr){
            if(map.containsKey(ele)){
                continue;
            }
            ans.add(ele);
            map.put(ele,true);
        }
        return ans;
    }
     
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,4,5,1};
        ArrayList<Integer> ans = Removeduplicate(arr);
        for (Integer ele : ans) {
            System.out.println(ele);
        }
    }
}

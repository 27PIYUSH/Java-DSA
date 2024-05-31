package Problems;

import java.util.*;

public class LongestConsecutiveSequence {

    static ArrayList<Integer> longestConsecutiveSequence(int[] arr){

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        // put every no. in set
        for(int i = 0 ; i<arr.length ; i++){
            set.add(arr[i]);
        }

        int longest = 1 , starting = 0;

        // find longest sequence
        for (int ele : set) {

            // if ele is a starting element
            if (!set.contains(ele - 1)) {
                int len = 1;
                int start = ele;
                int x = ele;
                while(set.contains(x+1)){
                    len++;
                    x++;
                }
                longest = Math.max(longest,len);
                starting = start;
            }
        }
        ans.add(starting);
        ans.add(longest);
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,4,3,6,5,17,18,19,20,20,21,22,23};
        ArrayList<Integer> ans = longestConsecutiveSequence(arr);
        for (int i = 0; i < ans.size(); i++) {
            ans.get(i);
        }
    }
}


class Solution {
    public int myMethod(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int max = 1;    
        int cnt = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                cnt++;
            }
            else if(nums[i] != nums[i-1]){
                cnt = 1;
            }
            max = Math.max(max, cnt);
        }

        return max;
    }
    public int longestConsecutive(int[] nums) {
        return myMethod(nums);
    }
}
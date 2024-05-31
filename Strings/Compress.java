package Strings;
import java.util.Scanner;

public class Compress {

    public static String compress_string(String str){
        String ans ="";
        if (str.length() == 0){
            return ans;
        }
        int count = 1;
        ans += str.charAt(0);
        for(int i = 1; i<str.length(); i++ ){
            if(str.charAt(i) == str.charAt(i-1)){
                ++ count;
            }
            else{
                if(count>1){
                    ans += count;
                    count = 1;
                }
                ans += str.charAt(i);
            }
        }
        if (count>1){
            ans += count;
        }
        return ans;
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compress_string(str));
    }
    
}

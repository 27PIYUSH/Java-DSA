package Strings;
import java.util.Scanner;
public class Remove_char {
    
    public static String remove_char(String str, char ch){
        String str1 = "";
        for (int i = 0 ; i<str.length(); i++){
            if (str.charAt(i) != ch){
                str1+=str.charAt(i);
            }
        }
        return str1;
    }
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char ch = scn.next().charAt(0);
        System.out.println(remove_char(str,ch));
    }
    
}

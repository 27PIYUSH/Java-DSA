package Strings;

public class strings_fun {
    public static void main(String[] args) {
        String str1 = "coding" , str2 = " is life" , str3="coding";
        System.out.println(str1.charAt(3)); //returns character 
        System.out.println(str1.contains("ing")); //returns true or false
        System.out.println(str1.compareTo(str3)); //returns the ascii diff if length of strings are equal else return the diff in length
        str1 = str1.concat(str2); // use to concatenate two strings
        System.out.println(str1);
        System.out.println(str1.equals(str2)); // returns true if strings are same
        System.out.println(str1.substring(1,3)); //returns the substring 

        // TO CREATE A MUTABLE STRING WE CAN USE STRING BUFFER :::
        StringBuffer str = new StringBuffer("abcd");
        str.setCharAt(0, 'A');
        str.append("def");
        String s = "a";
        for (int i=1 ; i<4 ;i++){
            s+='z';
        }
        System.out.println(str);
        System.out.println(s);
    }

}

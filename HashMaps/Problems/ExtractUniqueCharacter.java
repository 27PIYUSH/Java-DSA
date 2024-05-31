package Problems;

import java.util.HashMap;

public class ExtractUniqueCharacter {

    static String extractUnique(String s){
        HashMap<Character,Boolean> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                continue;
            }
            sb.append(ch);
            map.put(ch, true);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aabbccddeeffaaabbbch";
        String s = extractUnique(str);
        System.out.println(s);
    }
    
}

//Q. Find Frequency of Each Character in a String
//Input:  "java"
//Output: j=1, a=2, v=1

import java.util.HashMap;

public class Frequency_of_characters {
    public static void main (String[]args){
        String str = "java";
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}

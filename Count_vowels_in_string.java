//Q. Count Vowels in a String
//Input:  "hello world"
//Output: Vowels = 3

public class Count_vowels_in_string {
    public static void main (String[]args){

        String str = "hello world";
        int count = 0;

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}

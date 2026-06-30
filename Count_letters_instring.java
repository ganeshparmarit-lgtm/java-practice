/* Q. Count Uppercase and Lowercase Letters in String
Input:  "Hello World"
Output: Uppercase = 2, Lowercase = 8
*/
public class Count_letters_instring {
    public static void main (String[]args){
        String str = "Hello World";

        int uppercase = 0;
        int lowercase = 0;

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                uppercase++;
            }
            else if(Character.isLowerCase(ch)){
                lowercase++;
            }
        }
        System.out.println("Uppercase :  " + uppercase);
        System.out.println("lowercase :  " + lowercase);
    }
}
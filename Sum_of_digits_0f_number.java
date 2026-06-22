public class Sum_of_digits_0f_number {
    public static void main (String[] args){

        int  num = 12345;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.print(sum);
    }
}

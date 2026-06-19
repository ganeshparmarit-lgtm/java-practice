public class Reversenumber {

    public static void main(String[] args) {


        int reverse = 0;

        int num = 12345;


        while (num > 0) {

            int digit = num % 10;            // find last digit

            reverse = reverse * 10 + digit;  // reverse  banana

            num = num / 10;                  // digits hatana


        }

        System.out.println("Reverse number is :  " + reverse);

    }

}


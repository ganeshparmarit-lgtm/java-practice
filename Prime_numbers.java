public class Prime_numbers {
    public static void main(String[] args) {

        int n = 10;                    // range : 1 to 10

        for (int num = 2; num <= n; num++) {     //outer loop :  har number ko 2 se n tak check karo
            boolean isprime = true;

            for (int i = 2; i < num; i++) {       //inner loop :   check Karo 2 se lekar num-1 tak

                if (num % i == 0) {
                    isprime = false;         // number : not prime.
                    break;
                }
            }
            if (isprime) {
                System.out.println(num);
            }
        }

    }
}

import java.util.Scanner;

public class GCD_of_twonumber {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        int gcd = 1;

        for(int i = 1; i<=a && i<=b; i++){          // min(a,b) tak check
            if(a % i == 0 && b % i == 0){          // dono divide ho rahe hai
                gcd = i;                          //update gcd
            }
        }
        System.out.println("GCD is :  " + gcd);
        sc.close();
    }
}

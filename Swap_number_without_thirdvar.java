//Q. Swap Two Numbers Without Using Third Variable
//Input:  a = 5, b = 10
//Output: a = 10, b = 5

public class Swap_number_without_thirdvar {
    public static void main (String[]args){
        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + ", b = " + b);

    }
}

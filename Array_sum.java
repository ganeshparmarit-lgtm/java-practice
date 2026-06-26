// Q. Sum of Array Elements
//Input:  {1, 2, 3, 4, 5}
//Output: Sum = 15

public class Array_sum {
    public static void main (String[] args){

        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
    System.out.println(sum);

    }
}

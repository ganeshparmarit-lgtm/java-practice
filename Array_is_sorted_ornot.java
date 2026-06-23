// Q. Check if Array is Sorted (Ascending)
// Input:  {1, 2, 3, 4, 5} → true
// Input:  {1, 3, 2, 4, 5} → false

public class Array_is_sorted_ornot {
    public static void main (String[]args){

        int[] arr = {1,8,3,4,5};

        boolean issorted = true;

        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                issorted = false;
                break;
            }
        }
        if(issorted){
            System.out.println("Array is sorted.");
        }else {
            System.out.println("Array is not sorted.");
        }
    }
}

//Q. Find Second Smallest in Array
//Input:  {5, 2, 8, 1, 9, 3}
//Output: Second Smallest = 2

public class Secong_smallest_inarray {
    public static void main (String[] args){

        int[] arr = {5,2,8,1,9,3};
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < smallest){
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondsmallest && arr[i] != smallest){
                secondsmallest = arr[i];
            }
        }
        System.out.println("Second smallest element in array is : " + secondsmallest);
    }
}

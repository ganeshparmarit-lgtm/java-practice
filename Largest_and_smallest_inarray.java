//Input:  {5, 2, 8, 1, 9, 3}
//Output: Largest = 9, Smallest = 1
//Q1. Find Largest and Smallest in an Array


public class Largest_and_smallest_inarray {
    public static void main (String[]args){

        int[] arr ={5,2,8,1,9,3};

        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("largest :  " + largest);
        System.out.println("smallest :  " + smallest);
    }

}

//Q. Second Largest Element in an Array
//Input:  {5, 2, 8, 1, 9, 3}
//Output: Second Largest = 8

public class Second_largest_inarray {
    public static void main (String[] args){
        int[] arr = {5,2,8,1,9,3};

        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 1; i<arr.length; i++){
            if(arr[i] > largest){
                int temp = arr[i];
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);

    }
}

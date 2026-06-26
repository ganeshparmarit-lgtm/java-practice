// Q. Remove Duplicates from Array (print unique elements)
// Input:  {1, 2, 2, 3, 3, 4, 5}
// Output: 1 2 3 4 5

public class Remove_duplicates {
    public static void main (String[] args){

        int[] arr = {1,2,2,3,3,4,5};

        System.out.println(arr[0] + " ");

        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

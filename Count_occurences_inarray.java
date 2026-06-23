// Q. Count Occurrences of an Element in Array
// Input:  arr = {1, 2, 3, 2, 4, 2, 5}, target = 2
// Output: 3

public class Count_occurences_inarray {
    public static void main (String[]args){

        int[] arr = {1,2,3,2,4,2,5};
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                count++;
            }
        }
        System.out.println(count);
    }
}

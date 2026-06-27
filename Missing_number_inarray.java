//Q. Find Missing Number in Array
//Input:  {1, 2, 3, 5}  (1 to 5 mein se 4 missing hai)
//Output: Missing Number = 4
public class Missing_number_inarray {
    public static void main (String[]args){
        int[] arr = {1,2,3,5};
       int sum = 0;
       int n = arr.length + 1;

       for(int i = 0; i<arr.length; i++){
           sum += arr[i];
       }
       int miss = (n*(n+1) / 2) - sum;
        System.out.println("Missing number in array is : " + miss);


    }
}

//Q. Find Sum of Even Numbers in Array
//Input:  {1, 2, 3, 4, 5, 6}
//Output: Sum of Even = 12
public class Sum_ofeven_number_inarray {
    public static void main (String[] args){
    int[] arr ={1,2,3,4,5,6};
    int SumOfEven = 0;

    for(int i = 0; i<arr.length; i++){
        if(arr[i] % 2 == 0){
            SumOfEven += arr[i];
        }
    }
        System.out.println( "Sum of even number in array is : " + SumOfEven);

    }
}

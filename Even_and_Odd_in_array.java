//  Count Even and Odd numbers in an Array
// Input:  {1, 2, 3, 4, 5, 6}
//  Output: Even = 3, Odd = 3

public class Even_and_Odd_in_array {
    public static void main (String[]args){

        int[] arr = {1,2,3,4,5,6};
        int even = 0;
        int odd = 0;

        for(int i= 0; i<arr.length; i++){
            if(arr[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("even number are :   " + even);
        System.out.println("odd number are  :   " + odd);
    }

}

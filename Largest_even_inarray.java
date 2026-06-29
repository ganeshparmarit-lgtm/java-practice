// Q. Find Largest Even Number in Array
// Input:  {3, 8, 2, 11, 6, 5}
//Output: Largest Even = 8


public class Largest_even_inarray {
    public static void main (String[] args){

        int[] arr = {3,8,2,11,6,5};
        int largestEven = Integer.MIN_VALUE;    //largest even ko track karne ke liye..

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] > largestEven){    // 1 condition even dekh rhi hai dusri dekh rahi hai ki ye abhi tak ka highest even hai.
                largestEven = arr[i];
            }
        }

        if(largestEven == Integer.MIN_VALUE){
            System.out.println("It is not an even number.");
        }
        else{
            System.out.println("Largest even number is : " + largestEven);
        }
    }
}


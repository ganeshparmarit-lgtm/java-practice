//Q. Move All Zeros to End
//Input:  {0, 1, 0, 3, 12}
//Output: {1, 3, 12, 0, 0}

public class Move_zeros_toend {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int j = 0;

// Step 1: non-zero elements aage rakho
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

// Step 2: baaki positions zero karo
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }

// Step 3: print karo new array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}

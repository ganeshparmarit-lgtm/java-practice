//Q. Linear Search in Array
//Input:  arr = {5, 3, 8, 1, 9}, target = 8
//Output: Found at index 2

//Input:  target = 7
//Output: Not Found
public class Linerar_search {
    public static void main (String[]args){

        int[] arr = {5,3,8,1,9};
        int target = 8;
        boolean found = false;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("element found at index : " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("element not found.");
        }
    }
}

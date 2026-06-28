//Q. Find Average of Array Elements
//Input:  {10, 20, 30, 40, 50}
//Output: Average = 30.0
public class Average_of_array {
    public static void main (String[]args){
    int[] arr ={10,20,30,40,50};
    double average = 0;
    int sum = 0;

    for(int i = 0; i<arr.length; i++){
        sum += arr[i];
    }
    average = (double) sum / arr.length;
        System.out.println("Average is : " + average);

    }
}

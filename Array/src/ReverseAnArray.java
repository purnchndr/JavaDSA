// TODO: 28-May-21 GFG Link https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

import java.util.Arrays;

public class ReverseAnArray {

    //Method to reverse an Array//
    public static int[] reverseAnArray(int[] arr){
        int n = arr.length ,start=0, end = n-1;

        while(start <= end){
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

  public static void main(String[] args) {
    int[] input = {1,2,3,4,5,6,7,8,9,10};
    int[] output = reverseAnArray(input);
    System.out.println(Arrays.toString(output));
  }
}

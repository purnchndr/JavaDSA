// TODO: 28-May-21 GFG link for this problem is https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

import java.util.Arrays;

public class MaxAndMinOfArray {

    //Methode for Finding Max and Min of an Array..
    public static int[] findMaxMin(int[] arr){
        int max = arr[0],min = arr[0],n = arr.length;
        for(int i = 0; i<n; i++){
            if (max<arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }
    System.out.println("Maximum element in the is: " + max);
    System.out.println("Minimum element in the is: " + min);
    int[] result = {max, min};
    return result;
    }

  public static void main(String[] args) {
    int[] array = {2};
    array = findMaxMin(array);
    System.out.println(Arrays.toString(array));
  }
}

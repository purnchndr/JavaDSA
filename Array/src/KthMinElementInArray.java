public class KthMinElementInArray {
    public static int kthMinElement(int[] arr, int k){
        for(int i = 0 ; i <= k; i++){
            for(int j = i; j< arr.length-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[k-1];
    }

  public static void main(String[] args) {
    int[] array = {11,5,2,4,3,0,6};
    System.out.println(kthMinElement(array,1));
  }
}

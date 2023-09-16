package rotation_in_array;
import java.util.*;
public class Solution2 {
     static void Rotatetoright(int[] arr, int n, int k) {
        if (n == 0)
          return;
        k = k % n;
        if (k > n)
          return;
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
          temp[i - n + k] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
          arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
          arr[i] = temp[i];
        }
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=temp[i];
        // }  
      }
       static void Rotatetoleft(int[] arr, int n, int k) {
        if (n == 0)
          return;

        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
          temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
          arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
          arr[i] = temp[i - n + k];
        }
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=temp[i];
        // }
      }
      public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int arr1[] = arr.clone(); // Clone the original array for arr1
    
        int k = 2;
    
        Rotatetoright(arr, arr.length,k);
        Rotatetoleft(arr1,  arr.length,k);
    
        System.out.println(Arrays.toString(arr));  // Output: [5, 6, 1, 2, 3, 4]
        System.out.println(Arrays.toString(arr1)); // Output: [3, 4, 5, 6, 1, 2]
    }
}

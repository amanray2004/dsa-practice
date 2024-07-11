package longest_consecutive_sequence_p128.sortedarray;
import java.util.*;
public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int arr[]=a.clone();
        Arrays.sort(arr);
        boolean b=Arrays.equals(a,arr);
        if(b==true){
            return 1;

        }
        return 0;
    }
}

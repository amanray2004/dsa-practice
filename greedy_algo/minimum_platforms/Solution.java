// package greedy_algo.minimum_platforms;

// import java.util.Comparator;
// import java.util.*;
// public class Solution {
//     static int findPlatform(int arr[], int dep[], int n)
//     {
//         int a=1;
//         int arr2[][]=new int[n][2];
//         for (int i=0;i<n;i++){
//             arr2[i][0]=arr[i];
//             arr2[i][1]=dep[i];
//         }
//         Arrays.sort(arr2,new com());
//         int start=arr2[0][0];
//         int end=arr2[0][1];
//         for (int i=1;i<n;i++){
//             if (arr2[i][0]<=end){
//                 a++;
//                 end=Math.min(end,arr2[i][1]);
//             }
//             else{
//                 start =arr2[i][0];
//                 end=arr2[i][1];
//             }
//         }
//         return a;
//     }



//    private static class com implements Comparator<int[]>{
//         @Override
//         public int compare(int[] a, int[] b) {
//             return Integer.compare(a[1], b[1]);
//         }
//    }
// }












package greedy_algo.minimum_platforms;

import java.util.*;
public class Solution {
    public static int findPlatform(int arr[], int dep[], int n) {
    
        Arrays.sort(arr);
        Arrays.sort(dep);

        // Initialize the variables
        int platformsNeeded = 1;
        int maxPlatforms = 1;
        int i = 1;
        int j = 0;

        // Iterate through the sorted array
        while (i < n && j < n) {
            // If next train arrives before the last one departs, increase platform count
            if (arr[i] <= dep[j]) {
                platformsNeeded++;
                i++;
            } 
            // Otherwise, decrease the platform count and move to the next departure
            else {
                platformsNeeded--;
                j++;
            }
            // Track the maximum number of platforms needed
            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
        }

        return maxPlatforms;
    }




   
}

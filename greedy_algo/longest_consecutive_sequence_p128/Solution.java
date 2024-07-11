//brute approach

package longest_consecutive_sequence_p128;


//import java.util.Arrays;
    


public class Solution {
    static boolean ispresent(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return true;
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        int largeststreak=0;
        for (int i=0;i<nums.length;i++){
            int currentnumber=nums[i];
            int currentstreak=1;
            while(ispresent(nums,currentnumber+1)){
                currentnumber+=1;
                currentstreak+=1;
            }
            if(currentstreak>largeststreak){
                largeststreak=currentstreak;
            }
        }
        return largeststreak;
    }
}





//timecomplexity=O(n^3)


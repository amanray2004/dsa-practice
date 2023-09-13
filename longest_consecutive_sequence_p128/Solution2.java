package longest_consecutive_sequence_p128;
import java.util.Arrays;
public class Solution2 {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1]+1) {
                    currentStreak += 1;
                }
                else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        return Math.max(longestStreak, currentStreak);
    }
    public static void main(String[] args) {
        int arr[]={0,3,7,2,5,8,4,6,0,1};
        int arr1[]={1,2,0,1};
        System.out.println(longestConsecutive(arr1));
    }


}




    // public static int longestConsecutive(int[] nums) {
    //     Arrays.sort(nums);
    //     System.out.println(Arrays.toString(nums));
    //     int largeststreak=0;
    //     int currentstreak=0;
    //     if(nums.length!=0){
    //         currentstreak=1;
    //     }

    //     for (int i=0;i<nums.length-1;i++){
    //         System.out.println(nums[i]);
    //         if (nums[i]==nums[i+1]-1){
    //             currentstreak+=1;
    //         }
    //         else{
    //             currentstreak=1;
    //         }
    //         if(currentstreak>largeststreak){
    //             largeststreak=currentstreak;
    //         }
    //     }
    //     if(currentstreak>largeststreak){
    //         largeststreak=currentstreak;
    //     }
    //     return largeststreak;
    //}
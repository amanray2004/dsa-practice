package longest_consecutive_sequence_p128;
import java.util.Arrays;
public class Solution2 {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int largeststreak=0;
        int currentstreak=1;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]-1){
                currentstreak+=1;
            }
            else{
                if(currentstreak>largeststreak){
                    largeststreak=currentstreak;
                }
                currentstreak=1;
            }
        }
        return largeststreak;
    }
    public static void main(String[] args) {
        int arr[]={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }


}

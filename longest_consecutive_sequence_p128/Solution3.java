package longest_consecutive_sequence_p128;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> a=new HashSet<>();
        int higheststreak=1;
        int currentstreak=1;
        for(int num:nums){
            a.add(num);

        }
        for(int i=0;i<nums.length;i++){
            if(!a.contains(nums[i]-1)){
                int b=i;
                currentstreak=1;
                while(a.contains(nums[b]+1)){
                    b+=1;
                    currentstreak+=1;
                }
                if(currentstreak>higheststreak){
                    higheststreak=currentstreak;
                }
            }
        }
        return higheststreak;
    }
}

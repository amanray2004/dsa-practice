package longest_consecutive_sequence_p128;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public static int longestConsecutive(int[] nums) {
    
        Set<Integer> a=new HashSet<>();
        int higheststreak=0;
        int currentstreak=0;
        for(int num:nums){
            a.add(num);

        }
        for(int num:nums){
            if(!a.contains(num-1)){
                currentstreak=1;
                int b=num;
                while(a.contains(b+1)){
                    b=b+1;
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

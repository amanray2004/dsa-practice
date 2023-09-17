package longest_consecutive_sequence_p128.consecutive_one's;
import java.util.*;
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        HashMap<Integer, Integer> a
            = new HashMap<>();
        int b=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a.put(b,i);
            }

         }
        int max=0;
        for(int i=0;i<b;i++){
            if(a.get(i+1)-a.get(i)>max){
                max=a.get(i+1)-a.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a={1,1,0,1,1,1};
        Solution s=new Solution();
        System.out.println("hello");
        System.out.println(s.findMaxConsecutiveOnes(a));
    }
}

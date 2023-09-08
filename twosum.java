
import java.util.*;
public class twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        int[] result=new int[2];
        for (int i=0;i<nums.length;i++){
            if(hmap.containsKey(target-nums[i])){
                result[0]=hmap.get(target-nums[i]);
                result[1]=i;
                return result;
            }
            hmap.put(nums[i],i);
        }
        return result;
    }
}

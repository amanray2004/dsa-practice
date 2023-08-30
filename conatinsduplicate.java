import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class containsDuplicate{
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<(nums.length-1);i++){
            if (nums[i]==nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //Solution sol = new Solution();
        int[] nums = {1,2,3,1};
        //System.out.println(sol.containsDuplicate(nums));
        boolean a =containsDuplicate(nums);
        System.out.println(a);
    }
}
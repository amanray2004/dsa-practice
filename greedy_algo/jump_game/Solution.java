package greedy_algo.jump_game;

public class Solution {
    public boolean canJump(int[] nums) {
        int max =nums[0];
        int i=0;
        while(i<=max){
            max =Math.max(max,i+nums[i]);
            if(max>=nums.length-1){
                return true;
            }
            i++;
            
        }
        return false;
    
    }
}

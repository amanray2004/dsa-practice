import java.util.*;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        HashMap<Integer, Integer> a = new HashMap<>();
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                a.put(b, i);
                b = 0; // Reset consecutive count of zeros
            } else {
                b++; // Increment consecutive count of zeros
            }
        }

        // Handle the case where there are no zeros
        if (a.isEmpty()) {
            return nums.length;
        }

        int max = 0;
        for (int i = 0; i < b; i++) {
            if (a.containsKey(i + 1)) {
                int consecutiveOnes = a.get(i + 1) - a.get(i) - 1;
                max = Math.max(max, consecutiveOnes);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 0, 1, 1, 1 };
        Solution s = new Solution();
        System.out.println(s.findMaxConsecutiveOnes(a));
    }
}
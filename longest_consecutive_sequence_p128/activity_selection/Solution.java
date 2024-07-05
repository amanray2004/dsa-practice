package longest_consecutive_sequence_p128.activity_selection;

import java.util.Arrays;

public class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        //int a =pairs[0][0];
        int b=pairs[0][1];
        int count =1;
        for (int i=1;i<pairs.length;i++){
            if (pairs[i][0]>b){
                //a=pairs[i][0];
                b=pairs[i][1];
                count++;
            }
        }
        return count;


    }   
}

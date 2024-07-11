package greedy_algo.insert_interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(Arrays.asList(intervals));
        int i=0;
        while (i<result.size() && result.get(i)[1]<newInterval[0]){
            i++;
        }
        while (i<result.size() && result.get(i)[0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],result.get(i)[0]);
            newInterval[1]=Math.max(newInterval[1],result.get(i)[1]);
            result.remove(i);
        }
        result.add(i,newInterval);
        return result.toArray(new int[result.size()][]);
    }
}

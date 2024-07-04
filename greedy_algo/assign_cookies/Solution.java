package greedy_algo.assign_cookies;
import java.lang.reflect.Array;
import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(j<s.length && i<g.length){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}
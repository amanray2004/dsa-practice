package twosum;
//but here you won't be able to return original indices of two operands as u sort the orignal array.
import java.util.*;
public class Solution {
    public static String read(int n, int []book, int target){
        Arrays.sort(book);
        int left=0;
        int right=n-1;
        while(left<=right){
            int sum=0;
            sum+=(book[left]+book[right]);
            if (sum<target){
                left+=1;

            }
            else if( sum>target){
                right=right-1;
            }
            else{
                return "YES";
            }
        }
        return "NO";
    }
}
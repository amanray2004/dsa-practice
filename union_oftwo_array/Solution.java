package union_oftwo_array;

import java.util.LinkedHashSet;
import java.util.*;

public class Solution {
    static List< Integer > sortedArray(int arr1[],int arr2[]){
        Set<Integer> a=new LinkedHashSet<>();


        Arrays.sort(arr1);
        Arrays.sort(arr2);


        for(int i=0;i<arr1.length;i++){
            a.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            a.add(arr2[i]);
        }
        List<Integer> b = new LinkedList<>();

        for (int val:a){
            b.add(val);
        }
        return b;


    }
}

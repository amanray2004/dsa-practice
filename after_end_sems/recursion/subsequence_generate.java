package after_end_sems.recursion;

//29 may 2024


import java.util.ArrayList;
//import java.util.*;


public class subsequence_generate {

    public static void genrate_subsequence(int [] arr,int i,int n,ArrayList<Integer> temp){
        if (i==n){
            for (int ele:temp){
                System.out.print(ele+" ");
            }
            System.out.println();
            return;
        }
        temp.add(arr[i]);
        genrate_subsequence(arr, i+1, n, temp);
        temp.remove(temp.size()-1);
        genrate_subsequence(arr, i+1, n, temp);
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2};
        // for (int ele:arr){
        //     System.out.print(ele+" ");
        // }
        ArrayList<Integer> temp = new ArrayList<>();
        genrate_subsequence(arr, 0, arr.length, temp);
    }
}

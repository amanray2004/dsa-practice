package rotation_in_array;
import java.util.*;
//reversal theorem
public class Solution {
    static void reverse(int arr[],int start,int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void lrotate(int arr[],int d,int n){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    static void rrotate(int arr[],int d,int n){
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr1[]=arr.clone();
        int k=2;
        lrotate(arr,k,arr.length);
        rrotate(arr1,k,arr.length);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}

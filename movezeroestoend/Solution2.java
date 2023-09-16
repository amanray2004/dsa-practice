package movezeroestoend;

import java.util.Arrays;

public class Solution2 {
    static int firstzero(int arr[]){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                return i;
            }
        }
        return -1;
    }
    static void move(int arr[]){
        int i=firstzero(arr);;
        int j=i+1;;
         for(j=1;j<arr.length;j++){
            if(arr[j]!=0){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }


         }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,3,0,4,0,1};
    
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package union_oftwo_array;

import java.util.*;

public class Solution2 {

    static List<Integer> sortedArray(int arr1[], int arr2[]) {
        int a = 0, b = 0;
        List<Integer> temp = new ArrayList<>();

        while (a < arr1.length && b < arr2.length) {
            if (arr1[a] < arr2[b]) {
                temp.add(arr1[a]);
                a++;
            } else {
                temp.add(arr2[b]);
                b++;
            }
        }

        while (a < arr1.length) {
            temp.add(arr1[a]);
            a++;
        }

        while (b < arr2.length) {
            temp.add(arr2[b]);
            b++;
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        List<Integer> result = sortedArray(arr1, arr2);

        System.out.println(result);
    }
}

package twosum;

public class quicksort {

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right;

        System.out.println("yes");
        System.out.println("before");
        for(int a=0;a<right;a++){
            System.out.print(arr[a]+" ");
        }
        while (i < j) {
            while (i < right && arr[i] <= pivot) {
                i++;
            }
    
            while (j > left && arr[j] > pivot) {
                j--;
            }
    
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    
        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;
    
        return j;
    }
    
    public static void quicksort(int []arr, int left, int right){
        if(left<right){
            int pivot=partition(arr, left, right);
            quicksort(arr, left, pivot-1);
            quicksort(arr, pivot+1, right);
        }
    }

    public static void main(String[] args) {
        int []arr={45,-56,78,90,-3,-6,45};
        quicksort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.Arrays;

public class test {
    static void func(int arr[]){
        arr[1]=100;    }
    public static void main(String[] args) {
        // String a = "hello";
        // char b = a.charAt(0); // Use charAt() method to access characters

        // System.out.println((int) b);
        // System.out.println('a'>'c');'
        int arr[]={1,2,3,4};
        func(arr);
        System.out.println(Arrays.toString(arr));
    }
}
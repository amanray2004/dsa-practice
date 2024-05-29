package graphs(algo);
import java.util.ArrayList;
import java.utils.Scanner;
public class store {
    public static void main(String[] args) {
        int m,n;
        Scanner input = new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        System.out.println("Enter the number of nodes");
        n = input.nextInt();
        System.out.println("Enter the number of edges");
        m = input.nextInt();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<m;i++){
            int u,v;
            System.out.println("Enter the source and destination of the edge");
            u = input.nextInt();
            v = input.nextInt();
            arr.get(u).add(v);
            arr.get(v).add(u);
        }



    }
}

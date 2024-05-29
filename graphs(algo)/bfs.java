package graphs(algo);

public class bfs {
    public static void bfstraversal(ArrayList<ArrayList<Integer>> arr,int n,int m){
        int visited[]=new int[n+1];
        for(int i=0;i<n;i++){
            visited[i]=0;
        }
        Queue <Integer> q= new LinkedList<>();
        q.add(1);
        vis[1]=1;
        while (!q.isEmpty()){
            int node= q.poll();
            System.out.println(node + " ");
            for (int i=0;i<arr.get(node).size();i++){
        
            }
        }
    }
}

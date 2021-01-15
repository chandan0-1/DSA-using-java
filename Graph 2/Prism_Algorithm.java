import java.util.Scanner;
import java.util.Arrays;

class Edge implements Comparable<Edge>{
    int v1;
    int v2;
    int wt;
    Edge(int v1,int v2,int wt){
        this.v1 = v1;
        this.v2 = v2;
        this.wt = wt;
    }
    @Override
    public int compareTo(Edge O){
        return this.wt - O.wt;
    }
}

public class Solution {
    public static int findMinVertex(boolean vis[],int[] weight){
        int min = -1;
        for(int i= 0; i < vis.length; i++){
            if(!vis[i] && (min == -1 || weight[i] < weight[min])){
                min = i;
            }
        }
        return min;
    }

    public static void prism(int[][] adj, int v){
        boolean vis[] = new boolean[v];
        int parent[] = new int[v];
        int weight[] = new int[v];
        
        parent[0] = -1;
        weight[0] = 0;
        
        for (int i = 1; i < v; i++){
            weight[i] = Integer.MAX_VALUE;
        }
        
        
        for (int i = 0; i < v; i++){
            int minVertex = findMinVertex(vis, weight);
            vis[minVertex] = true;
            
            for (int j=0; j<v; j++){
                if(adj[minVertex][j] > 0 && !vis[j]){
                    if (weight[j] > adj[minVertex][j]){
                        
                        weight[j] = adj[minVertex][j];
                        parent[j] = minVertex;
                        
                    }
                }
            }
        }
        
        for(int i = 1; i < v; i++){
            if (i < parent[i]){
                System.out.println(i +" "+ parent[i]+" "+weight[i]);
            }
            else{
                System.out.println(parent[i] +" "+ i+" "+weight[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int[][] adj = new int[V][V];

        for(int i = 0; i < E; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int wt = sc.nextInt();
            adj[v1][v2] = wt;
            adj[v2][v1] = wt;
        }
        prism(adj,V);


    }
}

import java.util.Scanner;

public class Solution {

    public static int findMinVertex(boolean[] vis,int[] dist){

        int minVertex = -1;

        for (int i = 0; i< vis.length; i++){
            if(!vis[i] && ( minVertex == -1 || dist[i] < dist[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void dijkstra(int[][] adj, int v){

        boolean vis[] = new boolean[v];
        int dist[] = new int[v];
        dist[0] = 0;

        for (int i = 1; i<v; i++){
            dist[i] = Integer.MAX_VALUE;
        }


        for (int i = 0; i < v-1; i++ ){
            int minVertex = findMinVertex(vis,dist);

            vis[minVertex] = true;

            for (int j = 0; j<v; j++){
                if (adj[minVertex][j] >0 && !vis[j] && adj[minVertex][j] < Integer.MAX_VALUE){
                    int newDist = dist[minVertex] + adj[minVertex][j];

                    if (newDist < dist[j]){
                        dist[j] = newDist;
                    }
                }
            }


        }
        for (int k = 0; k<v; k++){
            System.out.println(k+" "+dist[k]);
        }


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        int[][] adj = new int[V][V];

        for (int i = 0; i<E; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int w = s.nextInt();
            adj[a][b] = w;
            adj[b][a] = w;
        }

        dijkstra(adj,V);
    }
}

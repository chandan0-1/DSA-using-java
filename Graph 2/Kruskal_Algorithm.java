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
    public static int Parent(int v,int[] parent){
        if (v==parent[v]){
            return v;
        }
        return Parent(parent[v],parent);
    }

    public static Edge[] kruskalAlgorithm(Edge[] edge, int V){
        Arrays.sort(edge);

        Edge[] mst = new Edge[V-1];
        int[] parent = new int[V];
        for (int j = 0; j<V; j++){
            parent[j] = j;
        }

        int count = 0;
        int i = 0;
        while (count != V-1){
            Edge e = edge[i];
            int V1 = Parent(e.v1,parent);
            int V2 = Parent(e.v2,parent);

            if (V1 != V2){
                mst[count] = e;
                count++;
                parent[V1] = V2;   
            }
            i++;
        }
        return mst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        Edge[] edgeList = new Edge[E];

        for(int i = 0; i < E; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int wt = sc.nextInt();
            Edge e = new Edge(v1,v2,wt);
            edgeList[i] = e;
        }

        Edge mst[] = kruskalAlgorithm(edgeList,V);
        for (int i = 0;i<V-1; i++){
            int a = mst[i].v1;
            int b = mst[i].v2;
            if (a<b){
                System.out.println(a+" "+b+" "+mst[i].wt);
            }
            else{
                System.out.println(b+" "+a+" "+mst[i].wt);
            }
        }
    }
}

public class Solution {

    public static void helper(int[][] adj, int j,int n,boolean vis[]) {
        
        vis[j] =true;
        
        for (int i = 0;i<n;i++){
            if (vis[i]==false && adj[i][j]==1){
                helper(adj,i,n,vis);
            }
        }
    }
	public static int numConnected(int[][] edges, int n) {
        boolean[] vis = new boolean[n];
		int count = 0;
        for (int i=0;i<n;i++){
            if (vis[i] == false){
                count+=1;
                helper(edges,i,n,vis);
            }
        }
        return count;
	}
}

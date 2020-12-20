import java.util.*;

public class Solution {

    boolean helper(String[] board,int n,int m, int i,int j,int fi,int fj, int c,boolean vis[][],char ch){
        if (i==-1 || j==-1 || i>=n || j>=m){
            return false;
        }
        if (i==fi && j==fj && c>=4){
            return true;
        }
        
        if (i==fi && fj==j && c<4 && vis[i][j]){
            return false;
        }
        
        if (vis[i][j] || board[i].charAt(j) != ch){
            return false;
        }
        vis[i][j] = true;
        return helper(board,n,m,i-1,j,fi,fj,c+1,vis,ch) || helper(board,n,m,i+1,j,fi,fj,c+1,vis,ch) || helper(board,n,m,i,j+1,fi,fj,c+1,vis,ch) || helper(board,n,m,i,j-1,fi,fj,c+1,vis,ch);
        
        
        
        
    }
    int solve(String[] board , int n, int m)
	{
        // int c = 0;
        for(int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
		boolean vis[][] = new boolean[n][m];
                int c=0;
                if (helper(board,n,m,i,j,i,j,c,vis,board[i].charAt(j))){
                    // if (c>=4){
                        return 1;
                    // }
                }
            }
        }
        return 0;
	}
	
	
}




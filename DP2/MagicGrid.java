// Problem Link:-  https://www.youtube.com/watch?v=lSOsKhQc_VI

public class Solution{
    public static int helper(int[][] arr,int i, int j,int[][] dp){
        if (i>=arr.length || j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        int ans;

        if (dp[i][j] == 0){
            int right = helper(arr,i,j+1, dp);
            int down = helper(arr,i+1,j,dp);

            int health = Math.min(right,down);

            if (health == Integer.MAX_VALUE){
                health = 1;
            }

            if (health-arr[i][j] > 0){
                ans = health - arr[i][j];
            }
            else{
                ans = 1;
            }
            dp[i][j] = ans;
        }
        else{
            ans = dp[i][j];
        }
        return ans;
    }

    public static int getMinimumStrength(int[][] grid) {

        if (grid.length==0 || grid[0].length==0){
            return 0;
        }
        int[][] dp = new int[grid.length][grid[0].length];
        return helper(grid,0,0,dp);

    }
}

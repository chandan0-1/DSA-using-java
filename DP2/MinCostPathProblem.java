
public class Solution {

    public static int minCostPath(int[][] input) {
        int row = input.length;
        int col = input[0].length;
        int dp[][] = new int[row+1][col+1]; 
        for (int i=0;i<row+1;i++){
            for (int j=0;j < col+1; j++){
                dp[i][j] = Integer.MAX_VALUE;

            }
        }
        dp[1][1] = input[0][0];
        
        for (int i=1; i<row+1; i++){
            for(int j=1; j<=col; j++){
                
                if(i==1 && j==1){
                    continue;
                }
                
                int ans1 = dp[i-1][j];
                int ans2 = dp[i-1][j-1];
                int ans3 = dp[i][j-1];
                
                dp[i][j] = input[i-1][j-1] + Math.min(ans1,Math.min(ans2,ans3));
            }
        }
        
        return dp[row][col];
    }
}

//         Recursive Version
// public class Solution {
//     public static int helper(int[][] arr,int[][] dp,int i,int j) {
//         int m = arr.length;
//         int n = arr[0].length;

//         if (i== m-1 && j==n-1){
//             return arr[i][j];
//         }

//         if (i>=m || j>=n){
//             return Integer.MAX_VALUE;
//         }

//         int f = Integer.MAX_VALUE;
//         int s = Integer.MAX_VALUE;
//         int t= Integer.MAX_VALUE;

//         if (dp[i+1][j] == Integer.MAX_VALUE){

//             f = helper(arr,dp,i+1,j);
//             dp[i+1][j] = f;
//         }
//         else{
//             f = dp[i+1][j];
//         }


//         if (dp[i][j+1] == Integer.MAX_VALUE){

//             s = helper(arr,dp,i,j+1);
//             dp[i][j+1] = s;
//         }
//         else{
//             s = dp[i][j+1];
//         }


//         if (dp[i+1][j+1] == Integer.MAX_VALUE){

//             t = helper(arr,dp,i+1,j+1);
//             dp[i+1][j+1] = t;
//         }
//         else{
//             t = dp[i+1][j+1];
//         }


//         // int s = helper(arr,dp,i,j+1);
//         // int t = helper(arr,dp,i+1,j+1);

//         int myAns = arr[i][j] + Math.min(f,Math.min(s,t));
//         // dp[i]

//         return myAns;


//     }

//     public static int minCostPath(int[][] input) {

//         int row = input.length;
//         int col = input[0].length;
//         int dp[][] = new int[row+1][col+1]; 
//         for (int i=0;i<row+1;i++){
//             for (int j=0;j < col+1; j++){
//                 dp[i][j] = Integer.MAX_VALUE;

//             }
//         }
//         return helper(input,dp,0,0);
//     }
// }

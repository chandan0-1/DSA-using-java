
public class Solution {
    // Recursive Function with memoization
    public static int helperdp(String s, String t,int i,int j,int[][] dp) {
        if (i== s.length() || j==t.length()){
            return 0;
        } 
        int ans;

        if ((s.charAt(i))==t.charAt(j)){
            int myans;
            if (dp[i+1][j+1] == -1){
                myans = helperdp(s,t,i+1,j+1,dp);
                dp[i+1][j+1] = myans;
            }
            else{
                myans = dp[i+1][j+1];
            }

            ans = myans+1;
        }
        else{
            int ans1;
            int ans2;

            if(dp[i+1][j] == -1){
                ans1 = helperdp(s,t,i+1,j,dp);
                dp[i+1][j] = ans1;
            }
            else{
                ans1 = dp[i+1][j];
            }
            // Second function call
            if(dp[i][j+1] == -1){
                ans2 = helperdp(s,t,i,j+1,dp);
                dp[i][j+1] = ans2;
            }
            else{
                ans2 = dp[i][j+1];
            }

            ans = Math.max(ans1,ans2);


        }
        return ans;


    }
    // Recursive Function 
    public static int helper(String s, String t,int i,int j) {
        if (i== s.length() || j==t.length()){
            return 0;
        }
        char a = s.charAt(i);
        char b = t.charAt(j);
        if (a == b){
            return 1 + helper(s,t,i+1,j+1);
        }
        else{
            int ans1 = helper(s,t,i+1,j);
            int ans2 = helper(s,t,i,j+1);

            return Math.max(ans1,ans2);
        }


    }

    public static int lcs(String s, String t) {
        int dp[][] = new int[s.length()+1][t.length()+1];
        for (int i=0; i<s.length()+1; i++){
            for (int j = 0; j<t.length()+1; j++){
                dp[i][j] = -1;
            }
        }
        // return helper(s,t,0,0);
        return helperdp(s,t,0,0,dp);
    }

}

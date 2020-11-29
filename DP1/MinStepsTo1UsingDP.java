public class Solution {

    public static int helper(int n,int[] dp) {
        if (n==1){
            return 0;
        }
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for (int i=3 ;i<dp.length; i++){
            int ans1 = dp[i-1];
            int ans2 = Integer.MAX_VALUE;
            int ans3 = Integer.MAX_VALUE;

            if (i%2==0){
                ans2= dp[i/2];    
            }
            if (i%3==0){
                ans3 = dp[i/3];
            }
            dp[i] = Math.min(dp[i-1],Math.min(ans2, ans3)) + 1;
        }
        return dp[n];

    }

    public static int countMinStepsToOne(int n) {
        int dp[] = new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        return helper(n,dp);
    }

}

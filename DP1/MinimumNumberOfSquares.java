public class Solution {

    public static int helper(int n,int[] dp) {
        if (n==0){
            return 0;
        }

        int ans=Integer.MAX_VALUE;
        for(int i=1; i*i<=n;  i++){
            int cur_ans;
            if (dp[n-(i*i)] == -1){
                cur_ans = helper(n-(i*i),dp);
                dp[n-(i*i)] = cur_ans;
            }
            else{
                cur_ans = dp[n-(i*i)]; 
            }
            
            
            if (cur_ans<ans){
                ans = cur_ans;
            }

        }
        return ans+1;
    }
    public static int minCount(int n) {
        int dp[] = new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i] = -1;
        }
        return helper(n,dp);
    }

}

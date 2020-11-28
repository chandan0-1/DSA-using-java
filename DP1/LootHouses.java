public class Solution {

    public static int maxMoneyLooted(int[] arr) {
        if (arr.length==0){
            return 0;
        }
        if (arr.length==1){
            return arr[0];
        }
        int dp[] = new int[arr.length];
        for (int i=0;i<dp.length;i++){
            dp[i] = 0;
        }

        dp[0] = arr[0];
        dp[1] = Math.max(arr[1],arr[0]);

        for (int i=2;i<arr.length;i++){
            dp[i] = Math.max(dp[i-1], arr[i] + dp[i-2]);
        }
        return dp[arr.length-1];
    }

}

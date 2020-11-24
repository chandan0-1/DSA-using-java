public class Solution {

    public static int helper(int[] arr,int k,int i,int n){
        if (k==0 && i==n){
            return 1;
        }
        if (i>=n){
            return 0;
        }
            return helper(arr,k,i+1,n) + helper(arr,k-arr[i],i+1,n) + helper(arr,k+arr[i],i+1,n);
    }

    public static int numberOfWays(int[] input, int sum) {
        if (sum==0){
            return helper(input,sum,0,input.length) -1 ;
        }
        return helper(input,sum,0,input.length);
    }
}

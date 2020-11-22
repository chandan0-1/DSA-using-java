public class Solution {
    
    public static int helper(int rev, int n){
        if (n<10){
            return rev*10+n;
        }
        rev=rev*10 + n%10;
        return helper(rev,n/10);
    }

	public static int reverseInteger(int n) {
		if (n<0){
            return -1*helper(0,n*-1);
        }
        return helper(0,n);
	}

}

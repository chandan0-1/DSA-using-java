	
public class Solution {
    public static int helper(String s, String t,int i,int j) {
        if(i==s.length() ){
            return t.length()- j;
        }
        if (j==t.length()){
            return s.length()-i;
        }
        
        int ans;
        if (s.charAt(i) == t.charAt(j)){
            ans = helper(s,t,i+1,j+1);
        }
        else{
            int ans1 =  helper(s,t,i+1,j+1);
            int ans2 =  helper(s,t,i+1,j);
            int ans3 =  helper(s,t,i,j+1);
            
            ans = 1+Math.min(ans1,Math.min(ans2,ans3));
        }
        return ans;
    }
	public static int editDistance(String s, String t) {
		return helper(s,t,0,0);
    }

}

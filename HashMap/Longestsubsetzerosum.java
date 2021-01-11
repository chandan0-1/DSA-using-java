import java.util.HashMap;
public class Solution {

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        int sumsofar = 0;
        int maxlen = 0;
        HashMap<Integer,Integer> d= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            sumsofar += arr[i];

            if (sumsofar==0){
                maxlen = i + 1;                
            }
            else if (d.containsKey(sumsofar)){
                maxlen = Math.max(maxlen, i - d.get(sumsofar));
            }

            else{
                d.put(sumsofar,i);
            }


        }
        return maxlen;
    }
}

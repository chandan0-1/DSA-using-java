import java.util.*;

public class Solution {
    public static int PairSum(int[] input, int size) {

        HashMap<Integer,Integer> d=new HashMap<>();
        int count  = 0;


        for(Integer i:input){
            d.put(i,d.getOrDefault(i,0)+1);
        }

        for (Integer i: d.keySet()){
            if (i==0){
                count+=(d.get(i)*(d.get(i)-1))/2;
            }
            if (i>0 && d.containsKey(-i)){
                count+= d.get(i)*d.get(-i);

            }
        }
        return count;
    }
}


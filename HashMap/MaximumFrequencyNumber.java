import java.util.HashMap;
public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		HashMap<Integer,Integer> map =  new HashMap<>();
        int n = 0;
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            
        }
        
        for (Integer key : map.keySet()) {
            if(count < map.get(key)){
                count = map.get(key);
                n = key;
            }
            
        }
        
        return n;
    }
}


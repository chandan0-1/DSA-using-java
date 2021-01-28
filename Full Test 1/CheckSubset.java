import java.util.*;
public class solution {

    public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {


        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i:arr1){
            map1.put(i,map1.getOrDefault(i,0) + 1);
        }

        for (int i:arr2){
            map2.put(i,map2.getOrDefault(i,0) + 1);
        }
        Set<Integer> keys = map2.keySet();
        for(int i:keys){
            if (!map1.containsKey(i) || map1.get(i) < map2.get(i)){
                return false;
            }
        }
        return true;
    }
}
                


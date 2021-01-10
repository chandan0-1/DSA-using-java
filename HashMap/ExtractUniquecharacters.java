import java.util.HashMap;

public class Solution {

    public static String uniqueChar(String str){
        HashMap<Character,Integer> d=new HashMap<>();


        for(int i=0; i<str.length(); i++){
            d.put(str.charAt(i),d.getOrDefault(str.charAt(i),0)+1);
        }
        String ans = "";
        for(int i=0; i<str.length(); i++){
            if (d.get(str.charAt(i))!=-1){
                ans+=str.charAt(i);
                d.put(str.charAt(i),-1);
            }


        }
        return ans;

    }
}

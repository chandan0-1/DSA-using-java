import java.util.*;
public class Solution {
    public static String backspace(String s){
        String ans = "";
        int c = 0;
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) == '#'){
                c++;
                continue;
            }
            
            else if (s.charAt(i) != '#' && c > 0){
                c--;
            }
            
            else if (s.charAt(i) != '#' && c == 0){
                ans = s.charAt(i) + ans;
            }
        }      
        return ans;
        
    }
}



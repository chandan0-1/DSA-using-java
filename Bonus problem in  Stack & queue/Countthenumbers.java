import java.util.*;

class Solution {
    public static int permutations(int n) {
    int result = 0; 
  
        // Pushing 1 to 9 because all number from 1 
        // to 9 have this property. 
        for (int i = 1; i <= 9; i++) { 
            Stack<Integer> s = new Stack<>(); 
            if (i <= n) { 
                s.push(i); 
                result++; 
            } 
  
            // take a number from stack and add 
            // a digit smaller than last digit 
            // of it. 
            while (!s.empty()) { 
                int tp = s.peek(); 
                s.pop(); 
                for (int j = tp % 10; j <= 9; j++) { 
                    int x = tp * 10 + j; 
                    if (x <= n) { 
                        s.push(x); 
                        result++; 
                    } 
                } 
            } 
        } 
  
        return result; 
    } 
}

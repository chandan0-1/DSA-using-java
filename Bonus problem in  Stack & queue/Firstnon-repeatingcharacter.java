import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public static void nonrep(String str) {
        int[] arr=new int[256];
        Queue<Character> q=new LinkedList<Character>();
        for (int i=0;i<str.length();i++){
            arr[str.charAt(i)]+=1;
            q.add(str.charAt(i));
            while (q.size()>0 && arr[q.peek()]>1){
                q.poll();
            }
            if(q.size()==0){
                System.out.print(-1);
                // q.poll();
            }
            else if(arr[q.peek()]==1){
                System.out.print(q.peek());
            }
        }
    }
}

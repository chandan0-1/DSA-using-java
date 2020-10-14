import java.util.*;

class Solution {
    public static int celebrity(int[][] arr, int n) {
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<arr.length;i++){
            st.push(i);
        }
        while(st.size()>=2){
            int i=st.pop();
            int j =st.pop();

            if(arr[i][j]==1){
                st.push(j);
            }
            else{
                st.push(i);
            }

        }

        int last=st.pop();
        for(int i=0;i<arr.length;i++){
            if (last!=i){
                if(arr[last][i]==1 || arr[i][last]==0){
                    return -1;
                }
            }
        }
        return last;
    }
}

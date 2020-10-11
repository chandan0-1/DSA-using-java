import java.util.Stack;
public class Solution {

	public static int[] stockSpan(int[] price) {
		//Your code goes here
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[price.length];
        st.push(0);
        arr[0]=1;
        for(int i=1;i<price.length;i++){
            while (st.size()>0 && price[i]>price[st.peek()]){
                st.pop();
            }
            if (st.size()==0){
                arr[i]=i+1;
            }
            else{
                arr[i]=i-st.peek();
            }
            st.push(i);
        }
        return arr;
	}

}

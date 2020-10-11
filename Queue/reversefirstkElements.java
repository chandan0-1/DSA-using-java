import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void reverseQueue(Queue<Integer> input,int k) {
		if (k==0){
            return ;
        }
        int data=input.poll();
        reverseQueue(input,k-1);
        input.add(data);
	}

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        // if (k>0){
        //     return ;
        // }
        // int data=input.poll();
        // reverseKElements(input,k--);
        // input.add(data);
        
        reverseQueue(input,k);
        int temp=input.size()-k;
        while (temp>0){
            input.add(input.poll());
            temp--;
                
        } 
        return input;
	}

}

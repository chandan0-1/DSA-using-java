import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
		if (input.size()==0){
            return ;
        }
        int data=input.poll();
        reverseQueue(input);
        input.add(data);
	}

}

import java.util.Stack;
public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		if (input.size()<=1){
            return ;
        }
        while(input.size()!=1){
            extra.push(input.pop());
        }
        int temp=input.pop();
        
        while(extra.size()>0){
            input.push(extra.pop());
        }
        reverseStack(input,extra);
        input.push(temp);
	}
}

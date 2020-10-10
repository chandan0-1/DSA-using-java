import java.util.Stack;
public class Solution {

    public static boolean isBalanced(String s) {
        //Your code goes here
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            // System.out.println(s.charAt(i));
            
            // if (){
            if(stack.size()>0 && s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        
        return stack.size()==0;
    }
}

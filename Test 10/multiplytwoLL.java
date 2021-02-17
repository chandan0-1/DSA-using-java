/*Linked List Node Class

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

*/

public class Solution {

    public static void multiply(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        int num1 = 0, num2 = 0;  
 
        while (first != null || second != null)  
        {  
            if (first != null)  
            {  
                num1 = num1*10 + first.data;  
                first = first.next;  
            }  
            if (second != null)  
            {  
                num2 = num2*10 + second.data;  
                second = second.next;  
            }  
        }  

        String s= String.valueOf(num1*num2);
        for (int i= 0 ;i< s.length();i++){
            System.out.print(s.charAt(i));
        }
    }

}

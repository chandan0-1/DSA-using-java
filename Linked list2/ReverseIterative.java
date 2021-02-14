/*************** 
     * Following is the Node class already written 
            class LinkedListNode<T> {
                T data;
                LinkedListNode<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

public class Solution {

    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){

        LinkedListNode<Integer> cur = head;
        LinkedListNode<Integer> prev = null;

        while (cur != null){
            LinkedListNode<Integer> next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}

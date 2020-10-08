/*
Structure of Linked List Node we have used.

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> right;
	LinkedListNode<T> down;

	LinkedListNode(T data) {
		this.data = data;
	    this.right = null;
	    this.down = null;
	}
}
*/

public class Solution {
    public static LinkedListNode<Integer> Merge(LinkedListNode<Integer> h1,LinkedListNode<Integer> h2){
        LinkedListNode<Integer> cur=null;
        if(h1==null){
            return h2;
        }
        if (h2==null){
            return h1;
        }
        if (h1.data<h2.data){
            cur=h1;
            cur.down=Merge(h1.down,h2);
        }
        else{
            cur=h2;
            cur.down=Merge(h1,h2.down);
        }
        return cur;
    }

    public static LinkedListNode<Integer> flat(LinkedListNode<Integer> head) {
        // LinkedListNode<Integer> h=null;
        // LinkedListNode<Integer> t=head;
        // LinkedListNode<Integer> x=null;
        LinkedListNode<Integer> cur=null;
        if (head==null || head.right==null ){
            return head;
        }
        if(head.right==null){
            return cur;
        }
        head.right=flat(head.right);
        cur=Merge(head,head.right);
        return cur;

    }

}

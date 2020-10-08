/*
Structure of Linked List Node we have used.

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}*/

public class Solution {
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        if (head==null){
            return head;
        }
        if (head.next==null){
            return head;
        }
        LinkedListNode<Integer> s=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return s;
    }

    public static LinkedListNode<Integer> addNumbers(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {  

        if (head1==null){
            return head2 ;
        }

        if (head2==null){
            return head1;
        } 
        LinkedListNode<Integer> h1=reverse(head1);
        LinkedListNode<Integer> h2=reverse(head2);
        LinkedListNode<Integer> cur=null,tail=null;
        int val=0,carry=0;
        while(h1!=null && h2!=null){
            val=(h1.data+h2.data+carry);
            carry=val/10;
            // int tmp=val%10
            LinkedListNode<Integer> t=new LinkedListNode<Integer>(val%10); 
            if (cur==null){
                cur=t;
                tail=t;
            }
            else{
                tail.next=t;
                tail=tail.next;
            }
            h1=h1.next;
            h2=h2.next;
        }

        while(h1!=null){
            val=(h1.data+carry);
            carry=val/10;
            // int tmp=val%10
            LinkedListNode<Integer> t=new LinkedListNode<Integer>(val%10); 
            tail.next=t;
            tail=tail.next;
            h1=h1.next;

        }

        while(h2!=null){
            val=(h2.data+carry);
            carry=val/10;
            // int tmp=val%10
            LinkedListNode<Integer> t=new LinkedListNode<Integer>(val%10); 
            tail.next=t;
            tail=tail.next;
            h2=h2.next;

        }
        if (carry>0){
            LinkedListNode<Integer> t=new LinkedListNode<Integer>(carry); 
            tail.next=t;
            tail=tail.next;
        }
        tail.next=null;
        cur=reverse(cur);
        return cur;

    }
}

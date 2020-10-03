public class Solution {
    public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
        }

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		//Your code goes here
        if(pos==0){
            return head.next;
        }
        int l=length(head);
        int c=0;
        LinkedListNode<Integer> cur = head;
        LinkedListNode<Integer> prev =null;
        while((cur.next!=null)){
            if (pos==c){
                prev.next=cur.next;
                c++;
                return head;
            }
            c++;
            prev=cur;
            cur=cur.next;
        }
        if (pos==l-1){
        prev.next=null;}
        return head;
	}
}



public class Solution {

        public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if (head==null){
            return head;
        }
        LinkedListNode<Integer> prev=head;
        LinkedListNode<Integer> cur=head;
        cur=cur.next;

        while (cur!=null){
            if (!prev.data.equals(cur.data)){
                prev.next=cur;
                prev=prev.next;}
            cur=cur.next;
        }
            prev.next=null;
        return head;

    }

}

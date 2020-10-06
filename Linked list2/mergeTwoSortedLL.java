/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
        LinkedListNode<Integer> h=null;
        LinkedListNode<Integer> t=null;
        if (head1.data<head2.data){
            h=head1;
            t=head1;
            head1=head1.next;
        }
        else{
            h=head2;
            t=head2;
            head2=head2.next;
        }
        while (head1!=null && head2!=null){
            if (head1.data<head2.data){
                // h=head1;
                t.next=head1;
                t=t.next;
                head1=head1.next;
            }
            else{
                // h=head2;
                t.next=head2;
                t=t.next;
                head2=head2.next;
            }
        }
        if(head1!=null){
            t.next=head1;
        }
        if (head2!=null){
            t.next=head2; 
        }
        return h;
    }

}


public class Solution {
    public static DoublyLinkedListNode<Integer> Merge(DoublyLinkedListNode<Integer> h1,DoublyLinkedListNode<Integer> h2){
        DoublyLinkedListNode<Integer> cur=null;
        if(h1==null){
            return h2;
        }
        if (h2==null){
            return h1;
        }
        if (h1.data<h2.data){
            cur=h1;
            cur.next=Merge(h1.next,h2);
        }
        else{
            cur=h2;
            cur.next=Merge(h1,h2.next);
        }
        return cur;
    }
    public static DoublyLinkedListNode<Integer> reverse(DoublyLinkedListNode<Integer> head){
        if (head==null){
            return head;
        }
        if (head.next==null){
            return head;
        }
        DoublyLinkedListNode<Integer> smallhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return smallhead;
    }
    public static DoublyLinkedListNode<Integer> sorting(DoublyLinkedListNode<Integer> head) {
        if (head==null){
            return null;
        }
        DoublyLinkedListNode<Integer> cur = head;
        while (cur!=null && cur.next!=null){
            if (cur.data>cur.next.data){
                break;
            }
            cur=cur.next;
                
        }
        DoublyLinkedListNode<Integer> nex=cur.next;
        cur.next=null;
        DoublyLinkedListNode<Integer> ne = reverse(nex);
        DoublyLinkedListNode<Integer> n = Merge(ne,head);
    
    return n; 
    }
}

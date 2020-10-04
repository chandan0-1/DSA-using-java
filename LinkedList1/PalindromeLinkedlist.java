

public class Solution {
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        if (head==null){
            return head;
        }
        if (head.next==null){
            return head;
        }
        LinkedListNode<Integer> smallhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return smallhead;
    }
    public static int len(LinkedListNode<Integer> head){
        if (head==null){
            return 0;
            
        }
        return 1+len(head.next);
    }
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if (head==null){
            return true;
            
        }
        if (head.next==null){
            return true;
            
        }
		int l=len(head);
        l=l/2;
        // if (l%2==0){
        //     l=l/2;
        // }
        // else{
        //     l=l/2;
        //     // l--;
        // }
        LinkedListNode<Integer>  cur=head;
        LinkedListNode<Integer> prev=null;
        while(l>0){
            prev=cur;
            cur=cur.next;
            l--;
        }
        prev.next=null;
        if (l%2==0){
            
            cur=reverse(cur);
        }
        else{
            cur=reverse(cur.next);
        }
        while(head!=null){
            if(!head.data.equals(cur.data)){
                return false;
            }
            head=head.next;
            cur=cur.next;
        }
        // System.out.println(cur.data);
        return true;
	}
    

}

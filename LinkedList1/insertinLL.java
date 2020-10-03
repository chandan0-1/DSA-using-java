
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

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
        int l=length(head);
        LinkedListNode<Integer> cur=head;
        LinkedListNode<Integer> prev=null;
        int c=0;
        if (pos==0){
            LinkedListNode<Integer> t=new LinkedListNode<Integer>(data);
            t.next=head;
            // head=t;
            return t;
        }
        while(cur.next!=null){
            if (c==pos){
                LinkedListNode<Integer> t=new LinkedListNode<Integer>(data);
                prev.next=t;
                t.next=cur;
                return head;
            }
            c++;
            prev=cur;
            cur=cur.next;
        }
        if(pos==l){
            LinkedListNode<Integer> t=new LinkedListNode<Integer>(data);
            cur.next=t;
            // head=t;
            return head; 
        }
        return head;
    }

    //     public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
    //         if(head==null && pos>0){
    //             return head;
    //         }
    //         if(pos==0){
    //             LinkedListNode<Integer> node= new LinkedListNode<Integer>(data);
    //             node.next=head;
    //             return node;
    //         }
    //         head.next=insert(head.next,pos-1,data);
    //         return head;

    //     }
}

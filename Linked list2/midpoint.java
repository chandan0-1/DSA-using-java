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
    public static int length(LinkedListNode<Integer> head){
        // int slow=0;
        // int fast=0;
        // while(head!=null)
    if (head==null){
        return 0;}
    return 1+ length(head.next);
    // }
            
        }
//     }
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        if (head==null){
            return null;
        }
        //Your code goes here
        // int l=length(head);
        // if(l%2==0){
        //     l=l/2;
        //     l--;
        // }
        // else{
        //     l=l/2;
        // }
         LinkedListNode<Integer> slow=head;
         LinkedListNode<Integer> fast=head;
        while(fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
            // while (head!=null){
            //     if (l==0){
            //         return head;
            //     }
            //     else{
            //         l--;
            //         head=head.next;
            //     }
            // }
        // return head;
    }

}

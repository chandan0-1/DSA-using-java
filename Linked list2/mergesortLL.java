// /*

//     Following is the Node class already written for the Linked List

//     class LinkedListNode<T> {
//         T data;
//         LinkedListNode<T> next;
    
//         public LinkedListNode(T data) {
//             this.data = data;
//         }
//     }

// */

// public class Solution {
//     public static LinkedListNode<Integer> merge(LinkedListNode<Integer> h1,LinkedListNode<Integer> h2){
//         LinkedListNode<Integer> cur=null;
//         if(h1==null){
//             return h2;
//         }
//         if (h2==null){
//             return h1;
//         }
//         if (h1.data<h2.data){
//             cur=h1;
//             cur.next=merge(h1.next,h2);
//         }
//         else{
//             cur=h2;
//             cur.next=merge(h1,h2.next);
//         }
//         return cur;
//     }
    
//     public static LinkedListNode<Integer> Mid(LinkedListNode<Integer> head){
//         LinkedListNode<Integer> s=head;
//         LinkedListNode<Integer> f=head;
//         while(f.next!=null && f.next.next!=null){
//             s=s.next;
//             f=f.next.next;
//         }
//         LinkedListNode<Integer> mid=s.next;
//         s.next=null;
//         return mid;
//     }
// 	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
// 		if (head==null || head.next==null){
//             return head;
//         }
//         LinkedListNode<Integer> mid=Mid(head);
//         // mid.next=null;
//         LinkedListNode<Integer> L1=mergeSort(head);
//         LinkedListNode<Integer> L2=mergeSort(mid);
//         LinkedListNode<Integer> l=merge(L1,L2);
//         return l;
// 	}

// }

// ------------------------------------------   OR    -------------------------------------------------------

public class Solution {

    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2) {
        if (head1 == null){
            return head2;
        }

        if (head2 == null){
            return head1;
        }
        LinkedListNode<Integer> cur = null;

        if (head1.data < head2.data){
            cur = head1;
            cur.next = merge(head1.next,head2);
        }
        else{
            cur = head2;
            cur.next = merge(head1, head2.next);

        }
        return cur;

    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        if (head == null){
            return head;
        }
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if (head ==null || head.next == null){
            return head;
        }
        LinkedListNode<Integer> middle = midPoint(head);
        LinkedListNode<Integer> second = middle.next;
        middle.next = null;

        LinkedListNode<Integer> first = mergeSort(head);
        LinkedListNode<Integer> sec = mergeSort(second);
        return merge(first,sec);

    }

}

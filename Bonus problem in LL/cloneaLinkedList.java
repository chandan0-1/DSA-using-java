public class Solution {

    static Node<Integer> manipulateList(Node<Integer> head) {
        
        Node<Integer> curr = head;
        
        while (curr != null) {
            
            Node<Integer> newNode = new Node<>(curr.data);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
            
        }
        
        return head;
    }
    
    static void allocatepointer(Node<Integer> head) {
        
        Node<Integer> curr = head;
        
        while (curr != null) {
            if (curr.arb != null) {
                curr.next.arb = curr.arb.next;
            }
            curr = curr.next.next;
        }
        
    }
    
    public static Node<Integer> clone(Node<Integer> head) {
        
        if (head == null) {
            return null;
        }
        
        head = manipulateList(head);
        allocatepointer(head);
        Node<Integer> newHead = null, tail = null, curr = head;
        
        while (curr != null) {
            
            if (newHead == null) {
                newHead = tail = curr.next;
            } else {
                tail.next = curr.next;
                tail = tail.next;
            }
            curr.next = curr.next.next;
            curr = curr.next;
        }
        
        return newHead;
    }
}

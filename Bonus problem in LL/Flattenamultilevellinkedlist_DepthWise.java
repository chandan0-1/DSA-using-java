

public class Solution {

    
    static LinkedListNode<Integer> newHead, tail;
    
    static void Helper(LinkedListNode<Integer> head) {
        
        if (head == null) {
           return;   
        }
        
        if (newHead == null) {
            newHead = tail = head;
        } else {
            tail.next = head;
            tail = tail.next;
        }
        
        LinkedListNode<Integer> next = head.next;
        Helper(head.down);
        Helper(next);
    }
    
    public static LinkedListNode<Integer> flattenList(LinkedListNode<Integer> head) { 
        Helper(head);
        return newHead;
    } 
}

//                            OR



public class Solution {
    static LinkedListNode<Integer> last; 
    public static LinkedListNode<Integer> flattenList(LinkedListNode<Integer> node) { 
   // public static Node flattenList(Node node) 
    // { 
        if(node==null)  
            return null;  
    
        // To keep track of last visited node  
        // (NOTE: This is static)   
        last = node;  
    
        // Store next pointer  
        LinkedListNode<Integer> next = node.next;  
    
        // If down list exists, process it first  
        // Add down list as next of current node  
        if(node.down!=null)  
            node.next = flattenList(node.down);  
    
        // If next exists, add it after the next  
        // of last added node  
        if(next!=null)  
            last.next = flattenList(next);  
    
        return node;  
    } 
}

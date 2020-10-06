import java.util.LinkedList;
public class Solution {
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        if(M==0){
            return null;
        }
        if (head==null || N<=0 || M<0){
            return head;
        }
		LinkedListNode<Integer> Head=head;
        LinkedListNode<Integer> newhead=null;
        LinkedListNode<Integer> tail=null;
        
        
        while(Head!=null){
            int m=M;
            while(Head!=null && m>0){
                if (newhead==null){
                    newhead=head;
                    tail=head;
                }
                else{
                    tail.next=Head;
                    tail=tail.next;
                }
                Head=Head.next;
                m--;
            }
            
            
            int n=N;
            while(Head!=null && n>0){
                Head=Head.next;
                n--;
            }
            
        }
        tail.next=null;
        return newhead;
	}
}

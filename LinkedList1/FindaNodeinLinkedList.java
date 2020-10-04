
public class Solution {

	public static int findNode(LinkedListNode<Integer> head, int n) {
        int c=0;
		//Your code goes here
        while(head!=null){
            if(head.data==n){
                return c;
            
            }
            c++;
            head=head.next;
        }
        return -1;
	}
}

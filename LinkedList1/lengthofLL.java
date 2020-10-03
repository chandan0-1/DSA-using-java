
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
}

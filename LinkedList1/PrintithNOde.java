public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
         int c=0;
        while(head!=null){
            if (c==i){
                System.out.println(head.data);
                return;
            }
            c++;
            head=head.next;
        }
	}
}


public class Solution {

	public static void printReverse(LinkedListNode<Integer> head) {
		if (head==null){
            return;
        }
        printReverse(head.next);
        System.out.print(head.data+" ");
	}

}

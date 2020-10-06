public class Solution {
    public static int helper(LinkedListNode<Integer> head,int n,int i){
        if(head==null){
            return -1;
        }
        if (head.data==n){
            return i;
        }
        return helper(head.next,n,i+1);
        
    }

	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
        return helper(head,n,0);
	}

}

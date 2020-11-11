import java.util.*;

public class Solution {

    /* Structure of BinaryTreeNode class is:

        class BinaryTreeNode<T> {
		    T data;
		    BinaryTreeNode<T> left;
		    BinaryTreeNode<T> right;

		    public BinaryTreeNode(T data) {
			    this.data = data;
		    }
	    }
    
    */

    public static int minDiff(BinaryTreeNode<Integer> root, int k) {
        int res=root.data;
        while(root!=null){
            if( Math.abs(root.data-k) < Math.abs(res-k)){
                res=root.data;
            }
            
            root=k<root.data ? root.left:root.right;
        }
        return res;
        //Write your code here
    }
        
}
    

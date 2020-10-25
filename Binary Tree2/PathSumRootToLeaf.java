/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/
import java.util.*;
public class Solution {
    public static void helper(BinaryTreeNode<Integer> root, int k,ArrayList<Integer> arr){
        if (root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            if (root.data==k){
                for(int i=0;i<arr.size();i++){
                    System.out.print(arr.get(i)+" ");

                }
                System.out.println(root.data);
                return;
            }

        }
        arr.add(root.data);
        helper(root.left,k-root.data,arr);
        helper(root.right,k-root.data,arr);
        arr.remove(arr.size()-1);
    }

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        helper(root,k,arr);
    }

}

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

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if (root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>0){
            BinaryTreeNode<Integer> temp=q.poll();
            if (temp!=null){
                System.out.print(temp.data+" ");
            }
            else{
                System.out.println();
                if (q.size()!=0){
                    q.add(null);}
            }
            if (temp!=null && temp.left!=null){
                q.add(temp.left);
            }
            if (temp!=null && temp.right!=null){
                q.add(temp.right);
            }
        }
    }

}

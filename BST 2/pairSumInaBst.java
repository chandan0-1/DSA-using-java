import java.util.*;
public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static void TargetPair(BinaryTreeNode<Integer> node, int tar) 
    { 
  
        // LeftList which stores the left side values 
        ArrayList<BinaryTreeNode<Integer>> LeftList = new ArrayList<>(); 
  
        // RightList which stores the right side values 
        ArrayList<BinaryTreeNode<Integer>> RightList = new ArrayList<>(); 
  
        // curr_left pointer is used for left side execution and 
        // curr_right pointer is used for right side execution 
        BinaryTreeNode<Integer> curr_left = node; 
        BinaryTreeNode<Integer> curr_right = node; 
  
        while (curr_left != null || curr_right != null
               || LeftList.size() > 0 && RightList.size() > 0) { 
  
            // Storing the left side values into LeftList 
            // till leaf node not found 
            while (curr_left != null) { 
                LeftList.add(curr_left); 
                curr_left = curr_left.left; 
            } 
  
            // Storing the right side values into RightList 
            // till leaf node not found 
            while (curr_right != null) { 
                RightList.add(curr_right); 
                curr_right = curr_right.right; 
            } 
  
            // Last node of LeftList 
            BinaryTreeNode<Integer> LeftNode = LeftList.get(LeftList.size() - 1); 
  
            // Last node of RightList 
            BinaryTreeNode<Integer> RightNode = RightList.get(RightList.size() - 1); 
  
            int leftVal = LeftNode.data; 
            int rightVal = RightNode.data; 
  
            // To prevent repetition like 2, 6 and 6, 2 
            if (leftVal >= rightVal) 
                break; 
  
            // Delete the last value of LeftList and make 
            // the execution to the right side 
            if (leftVal + rightVal < tar) { 
                LeftList.remove(LeftList.size() - 1); 
                curr_left = LeftNode.right; 
            } 
  
            // Delete the last value of RightList and make 
            // the execution to the left side 
            else if (leftVal + rightVal > tar) { 
                RightList.remove(RightList.size() - 1); 
                curr_right = RightNode.left; 
            } 
  
            // (left value + right value) = target 
            // then print the left value and right value 
            // Delete the last value of left and right list 
            // and make the left execution to right side 
            // and right side execution to left side 
            else { 
                System.out.println(LeftNode.data + " " + RightNode.data); 
  
                RightList.remove(RightList.size() - 1); 
                LeftList.remove(LeftList.size() - 1); 
                curr_left = LeftNode.right; 
                curr_right = RightNode.left; 
            } 
        } 
    }
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
        TargetPair(root,s);
	}

}

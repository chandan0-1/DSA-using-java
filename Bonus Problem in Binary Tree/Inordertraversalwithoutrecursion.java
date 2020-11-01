public class Solution {

    /*	Binary Tree Node class
     * 
     * class BinaryTreeNode<T> {
            T data;
            BinaryTreeNode<T> left;
            BinaryTreeNode<T> right;
            BinaryTreeNode<T> random;
            public BinaryTreeNode(T data) {
                this.data = data;
            }
        }
        */
    public static BinaryTreeNode<Integer> helper(BinaryTreeNode<Integer> root){
        if (root==null){
            return;
        }
        BinaryTreeNode<Integer> l= helper(root.left);
        BinaryTreeNode<Integer> r= helper(root.right);
        BinaryTreeNode<Integer> temp =new BinaryTreeNode<Integer>(root.data);
        temp.left=l;
        root.left=temp;
        root.right=r;
        return root;
    }
        public static BinaryTreeNode<Integer> clonedTree(BinaryTreeNode<Integer> root) {
            //Write your code here
            BinaryTreeNode<Integer> Root=helper(root);
        }
        
    }
    

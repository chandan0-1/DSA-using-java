
public class Solution {

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        if (root==null){
            return ;
        }
        // if (root.left!=null || root.right!=null){
        BinaryTreeNode<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;
        // }
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
    }

}

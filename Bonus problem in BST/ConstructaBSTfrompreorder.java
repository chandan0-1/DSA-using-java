
public class Solution {
    public static BinaryTreeNode<Integer> helper(BinaryTreeNode<Integer> root,int data) {
        if (root==null){
            return new BinaryTreeNode<Integer>(data);
            // return root;
        }

        if (data<=root.data){
            root.left=helper(root.left,data);
        }
        else{
            root.right=helper(root.right,data);
        }
        return root;
    }
    public static BinaryTreeNode<Integer> constructBST(int[] preorder) {
        BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(preorder[0]);
        for( int i=1;i<preorder.length;i++){
            helper(node,preorder[i]);
        }
        return node;
    }
}

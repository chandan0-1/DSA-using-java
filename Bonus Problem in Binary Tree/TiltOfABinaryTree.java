public class Solution {

    /*	Binary Tree Node class
     * 
     * class BinaryTreeNode<T> {
            T data;
            BinaryTreeNode<T> left;
            BinaryTreeNode<T> right;

            public BinaryTreeNode(T data) {
                this.data = data;
            }
        }
        */
    static int Tilt=0;
        public static int tilt(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int ls=tilt(root.left);
        int rs=tilt(root.right);

        int localtilt=Math.abs(ls-rs);
        Tilt+=localtilt;

        int ts=ls+rs+root.data;
        return ts;
    }
    public static int getTilt(BinaryTreeNode<Integer> root) {
        tilt(root);
        return Tilt;
    }

}


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
    public static void preOrder(BinaryTreeNode<Integer> root) {
        while(root!=null){
            if (root.left==null){
                System.out.print(root.data+" ");
                root=root.right;
            }
            else{
                BinaryTreeNode<Integer> predeshelper=root.left;
                while(predeshelper.right!=root && predeshelper.right!=null){
                    predeshelper=predeshelper.right;
                }
                if (predeshelper.right==null){
                    predeshelper.right=root;
                    System.out.print(root.data+" ");
                    root=root.left;

                }
                else{
                    predeshelper.right=null;
                    
                    root=root.right;
                }
            }
        }
    }

}


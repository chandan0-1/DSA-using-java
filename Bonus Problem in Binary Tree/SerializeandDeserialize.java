import java.util.*;

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
    public static void serialize(BinaryTreeNode<Integer> root, ArrayList<Integer> tree) {
        if (root==null){
            tree.add(-1);
        }
        else{
            tree.add(root.data);
            serialize(root.left,tree);
            serialize(root.right,tree);

        }
    }

    public static BinaryTreeNode<Integer> deSerialize(ArrayList<Integer> tree) {
        BinaryTreeNode<Integer> root;
        if(tree.get(0)==-1){
            tree.remove(0);
            return null;
        }
        
        else{
             root= new BinaryTreeNode<Integer>(tree.get(0));
            tree.remove(0);
            root.left=deSerialize(tree);
            root.right=deSerialize(tree);
        }
        return root;
    }

}


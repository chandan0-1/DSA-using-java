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


    //       1
    //      / \
    //     1   3
    //    /    /
    //   2    3
    //  /  / /
    // 2 /
    //   cloned-2-random    cloned-3-random
    //   root.left.random = root.random.left
    //           2 - > 3
    public static void clone(BinaryTreeNode<Integer> root){
        if(root==null){
            return ;
        }
        if(root.random!=null){
            root.left.random=root.random.left;
        }
        clone(root.left.left);
        clone(root.right);
    }
    
     public static void seperate(BinaryTreeNode<Integer> root,BinaryTreeNode<Integer> clone){
          if(root==null || clone==null)
              return;
          
          root.left = clone.left;
          
          if (clone.left != null) {
              clone.left = clone.left.left;
          }
          
          if (clone.right != null) {
              clone.right = clone.right.left;
          }
          
          seperate(root.left,clone.left);
          seperate(root.right,clone.right);
      }
    
    public static BinaryTreeNode<Integer> helper(BinaryTreeNode<Integer> root){
        if (root==null){
            return null;
        }
        BinaryTreeNode<Integer> l= helper(root.left);
        BinaryTreeNode<Integer> r= helper(root.right);
        BinaryTreeNode<Integer> temp =new BinaryTreeNode<Integer>(root.data);
        temp.left=l;
        temp.right=root.right;
        root.left=temp;
        root.right=r;
        return root;
    }
    public static void print(BinaryTreeNode<Integer> root){
        if (root==null){
            return ;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
    public static BinaryTreeNode<Integer> clonedTree(BinaryTreeNode<Integer> root) {
        if (root==null){
            return null;
        }
        //Write your code here
        BinaryTreeNode<Integer> Root=helper(root);
        clone(Root);
        BinaryTreeNode<Integer> rootleft=root.left;
        seperate(Root,rootleft);
        return rootleft;
    }

}


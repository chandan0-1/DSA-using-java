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
        public static void inOrder(BinaryTreeNode<Integer> root) {
            Stack<BinaryTreeNode<Integer>> st=new Stack<>();
            while(true){
                if (root!=null){
                    st.push(root);
                    root=root.left;
                }
                else{
                    if (st.size()==0){
                        break;
                    }
                    BinaryTreeNode<Integer> node=st.pop();
                    System.out.print(node.data+" ");
                    root=node.right;
                }
            }
        }
        
    }
    

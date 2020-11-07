class 	Largest{
    int min;
    int max;
    boolean isBST;
    int size;
    public Largest(){
        this.min=Integer.MAX_VALUE;
        this.max=Integer.MIN_VALUE;
        this.isBST=true;
        this.size=0;
    }

}
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
    private static Largest BSThelper(BinaryTreeNode<Integer> root){
        if(root==null){
            return new Largest();
        }
        Largest leftBST=BSThelper(root.left);
        Largest rightBST=BSThelper(root.right);


        Largest obj=new Largest();

        if (leftBST.isBST==false || rightBST.isBST==false || (leftBST.max>root.data || rightBST.min<root.data)){
            obj.isBST=false;
            obj.size=Math.max(leftBST.size,rightBST.size);
            return obj;
        }
        else{
            obj.isBST=true;
            obj.size=Math.max(leftBST.size,rightBST.size)+1;

            //             obj.min = root.left != null ? leftBST.min : root.data;

            //             obj.max = root.right != null ? rightBST.max : root.data;
            if (root.left==null){
                obj.min=root.data;

            }
            else{
                obj.min=leftBST.min;
            }

            if (root.right==null){
                obj.max=root.data;

            }
            else{
                obj.max=rightBST.max;
            }

        }
        return obj;


    }


    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        Largest o=BSThelper(root);
        return o.size;
    }

}

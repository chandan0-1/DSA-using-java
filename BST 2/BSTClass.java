/*
 * Binary Tree Node class
 * 
 * class BinaryTreeNode<T> { 
 * 		T data; 
 * 		BinaryTreeNode<T> left; 
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data) 
 * 		{ 
 * 			this.data = data; 
 * 		}
 * }
 */

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */




public class BinarySearchTree {
    private static BinaryTreeNode<Integer> root;
    private int size=0;
    
    private static BinaryTreeNode<Integer> inserthelper(BinaryTreeNode<Integer> node,int data){
        if (node==null){
           BinaryTreeNode<Integer> Node=new BinaryTreeNode<Integer>(data);
            return Node;
        }
        if(node.data<data){
            node.right=inserthelper(node.right,data);
        }
        else{
            node.left=inserthelper(node.left,data);
        }
        return node;
    }
    
	public void insert(int data) {
		size++;
        root=inserthelper(root,data);
	}
	
    
    private static  int minm(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        
        int minleft=minm(root.left);
        int minright=minm(root.right);
        return Math.min(root.data,Math.min(minleft,minright));
    }
    private static BSTHelper removehelper(BinaryTreeNode<Integer> root,int data){
        if(root==null){
            return new BSTHelper(null,false);
        }
        
        if (root.data<data){
            BSTHelper outputright= removehelper(root.right,data);
            root.right=outputright.root;
            outputright.root=root;
            return outputright;
        }
        
         if (root.data>data){
            BSTHelper outputleft= removehelper(root.left,data);
            root.left=outputleft.root;
            outputleft.root=root;
            return outputleft;
        }
        
        if(root.left==null && root.right==null){
            return new BSTHelper(null,true);
        }
        if(root.left!=null && root.right==null){
            return new BSTHelper(root.left,true);
        }
        if(root.left==null && root.right!=null){
            return new BSTHelper(root.right,true);
        }
        
        int rightmin=minm(root.right);
        root.data=rightmin;
        BSTHelper deleteduplicate = removehelper(root.right,rightmin);
        root.right=deleteduplicate.root;
        
        return new BSTHelper(root,true);
        
        
    }
    
    
    
    
	public void remove(int data) {
        BSTHelper output = removehelper(root,data);
        root = output.root;
        
        if(output.deleted==true){
            size--;
        }
	}
	
    
    
    private static void printhelper(BinaryTreeNode<Integer> node){
        if (node==null){
            return ;
        }
        System.out.print(node.data+":");
        if(node.left!=null){
            System.out.print("L:"+node.left.data+",");
        }
        if(node.right!=null){
            System.out.print("R:"+node.right.data);
        
        }
        System.out.println();
        printhelper(node.left);
        printhelper(node.right);
        
    }
	public void printTree() {
		printhelper(root);
	}
	
    
    private boolean helper(BinaryTreeNode<Integer> root,int data){
        if (root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        if (root.data>data){
            return helper(root.left,data);
        }
        else{
            return helper(root.right,data);
        }
    }
	public boolean search(int data) {
		return helper(root,data);
	}
	

}
class BSTHelper{
    BinaryTreeNode<Integer> root;
    boolean deleted;
    
    public BSTHelper(BinaryTreeNode<Integer> root, boolean deleted){
        this.root=root;
        this.deleted=deleted;
    }
}


import java.util.*;

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
    /*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */

    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        if (root==null){
            return null;
        }
        ArrayList<LinkedListNode<Integer>> arr= new ArrayList<LinkedListNode<Integer>>();
        LinkedListNode<Integer> head=null;
        LinkedListNode<Integer> tail=null;


        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(q.size()>0){
            BinaryTreeNode<Integer> temp=q.poll();
            if (temp!=null){
                LinkedListNode<Integer> node =  new LinkedListNode(temp.data);
                if (head==null){
                    head= node;
                    tail=node;
                }
                else{
                    tail.next=node;
                    tail=tail.next;
                }
                // System.out.print(temp.data+" ");
            }
            else{
                arr.add(head);
                head=null;
                tail=null;
                // System.out.println();
                if (q.size()!=0){
                    q.add(null);}
            }
            if (temp!=null && temp.left!=null){
                q.add(temp.left);
            }
            if (temp!=null && temp.right!=null){
                q.add(temp.right);
            }
        }
        return arr;
    }



}


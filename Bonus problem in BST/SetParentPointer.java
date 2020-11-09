import java.util.*;

/*
class Node {
	int data;
	Node left;
	Node right;
	Node parent;

	Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
*/

public class Solution {

    public static Node solve(int[] arr){
        ArrayList<Node> a=new ArrayList<Node>();
        for(int j=0;j<arr.length;j++){
            int x=arr[j];
            if (x == -1) {
                a.add(null);
                continue;
            }
            
            a.add(new Node(x,null,null));
        }


        // Node
        int i=0;
        int n=arr.length;
        Node root=null;
        while (i<=arr.length-1){
            if (arr[i]!=-1){

                // Node node =new Node(arr[i],null,null);


                int leftchild=(2*i)+1;
                int  rightchild=(2*i)+2;
                Node L=null;
                Node R=null;
                if (leftchild<n){
                    // node.left=new Node();
                    L=a.get(leftchild);
                }
                if (rightchild<n){
                    // node.right=new Node(arr[rightchild]);
                    R=a.get(rightchild);
                }
                a.get(i).left = L;
                a.get(i).right = R;
                if(i==0){
                    root=a.get(i);
                }
                
                
                int p=0;
                if(i%2==0){                
                    p=(i-2)/2;
                }
                else{
                    p=(i-1)/2;
                }
                if (p<0 || p>arr.length-1 ){
                    a.get(i).parent=null;
                }
                else{
                    a.get(i).parent=a.get(p);
                }

            }
            i+=1;
        }
        return root;
    }

}

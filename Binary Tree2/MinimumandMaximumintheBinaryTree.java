/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        if (root==null){
            return new Pair<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Pair<Integer,Integer> leftpair=getMinAndMax(root.left);
        Pair<Integer,Integer> rightpair=getMinAndMax(root.right);
        int min=Math.min(root.data,Math.min(leftpair.minimum,rightpair.minimum));
        int max=Math.max(root.data,Math.max(leftpair.maximum,rightpair.maximum));
        return new Pair<>(min,max);

    }

}

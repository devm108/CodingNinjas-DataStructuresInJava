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

	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
		// Write your code here
        if (root == null) {
			return 0;
		}
        if (root.data == a || root.data == b) {
        	return root.data;
        }
        int leftLCA = lcaInBST(root.left, a, b);
        int rightLCA = lcaInBST(root.right, a, b);
        if (leftLCA != 0 && rightLCA != 0) {
        	return root.data;
        }
        return (leftLCA != 0) ? leftLCA : rightLCA;

	}
}

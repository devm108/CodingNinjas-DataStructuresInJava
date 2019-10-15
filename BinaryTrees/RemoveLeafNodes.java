import java.util.ArrayList;


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

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
		
		// Write your code here
        if (root == null) {
			return new BinaryTreeNode<Integer>(-1);
		} else if (root.left == null && root.right == null) {
			return null;
		}
		BinaryTreeNode<Integer> val1;
		BinaryTreeNode<Integer> val2;
		val1 = removeAllLeaves(root.left);
		val2 = removeAllLeaves(root.right);
		if (val1 == null) {
			root.left = null;
		}
		if (val2 == null) {
			root.right = null;
		}
		return root;

	}



}

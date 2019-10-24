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
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		// Write your code here
        BinaryTreeNode<Integer> oldLeft;
		if (root == null) {
			return;
		}
		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);
		oldLeft = root.left;
		root.left = new BinaryTreeNode<Integer>(root.data);
		root.left.left = oldLeft;
		
	}
}

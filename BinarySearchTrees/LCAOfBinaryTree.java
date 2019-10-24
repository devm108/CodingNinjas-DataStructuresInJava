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

	public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
		// Write your code here
        if (root == null) {
			return 0;
		}
        if (root.data == a || root.data == b) {
        	return root.data;
        }
        int leftLCA = lcaBinaryTree(root.left, a, b);
        int rightLCA = lcaBinaryTree(root.right, a, b);
        if (leftLCA != 0 && rightLCA != 0) {
        	return root.data;
        }
        return (leftLCA != 0) ? leftLCA : rightLCA;

	}
}

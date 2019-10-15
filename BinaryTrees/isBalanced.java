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
    public static int height(BinaryTreeNode<Integer> root){
		if (root == null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		if(lh > rh) {
			return lh+1;
		} else {
			return rh+1;
		}
	}
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root){
		
		// Write your code here
        if (root == null) {
			return true;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		if (checkBalanced(root.left)) {
			if (checkBalanced(root.right)) {
				if (Math.abs(lh-rh)<=1) {
					return true;
				}
			}
		}
		return false;
		
	}

	
	
}

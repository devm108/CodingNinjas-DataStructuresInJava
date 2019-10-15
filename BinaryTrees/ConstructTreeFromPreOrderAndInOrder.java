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
    public static BinaryTreeNode<Integer> helper(int[] pre, int[] in, int preSi, int preEi, int inSi, int inEi){
		if (preSi>preEi || inSi>inEi) {
			return null;
		}
		int root = pre[preSi];
		BinaryTreeNode<Integer> p = new BinaryTreeNode<>(root);
		int k = 0;
		for (int i=0; i<in.length; i++) {
			if (root == in[i]) {
				k = i;
				break;
			}
		}
		p.left = helper(pre, in, preSi+1, preSi+(k-inSi), inSi, k-1);
		p.right = helper(pre, in, preSi+(k-inSi)+1, preEi, k+1, inEi);
		return p;
	}

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in){
		
			// Write your code here
        return helper(pre, in, 0, pre.length-1, 0, in.length-1 );
		
	}

}

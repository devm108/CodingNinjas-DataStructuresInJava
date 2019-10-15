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
    public static BinaryTreeNode<Integer> helper(int[] post, int[] in, int postSi, int postEi, int inSi, int inEi){
		if (inSi>inEi || postSi>postEi) {
			return null;
		}
		int root = post[postEi];
		BinaryTreeNode<Integer> p = new BinaryTreeNode<>(root);
		int k = 0;
		for (int i=inSi; i<=inEi; i++) {
			if (in[i] == root) {
				k = i;
				break;
			}
		}
		p.left = helper(post, in, postSi, postSi+k-(inSi+1), inSi, k-1);
		p.right = helper(post, in, postSi+k-inSi, postEi-1, k+1, inEi);
		return p;
	}

	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
			int[] in){
		
			// Write your code here
        return helper(post, in, 0, post.length-1, 0, in.length-1);
		
	}

	


}

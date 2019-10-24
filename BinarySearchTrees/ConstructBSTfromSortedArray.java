public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return helper(arr, 0, arr.length-1);

	}
    public static BinaryTreeNode<Integer> helper(int[] arr, int start, int end){
		if (start>end) {
			return null;
		}
		int mid = (start+end)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
		root.left = helper(arr, start, mid-1);
		root.right = helper(arr, mid+1, end);
		return root;
	}
}	

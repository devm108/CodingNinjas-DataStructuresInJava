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

/* LinkedList Node Class
*
*	
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
*/

	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if (root == null) {
			return null;
		}
		BinaryTreeNode<Integer> curr = root;
		while (curr != null) {
			if (curr.left != null) {
				if (curr.right != null) {
					BinaryTreeNode<Integer> last = curr.left;
					while (last.right != null) {
						last = last.right;
					}
					last.right = curr.right;
				}
				curr.right = curr.left;
				curr.left = null;
			} else {
				curr = curr.right;
			}
		}
		LinkedListNode<Integer> list1 = curr;
		return list1;
		
	}
}	

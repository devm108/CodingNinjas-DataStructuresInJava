import java.util.ArrayList;
import java.util.*;

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

	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		
		// Write your code here
        if (root == null){
            return null;
        }
        ArrayList<Node<BinaryTreeNode<Integer>>> result = new ArrayList<Node<BinaryTreeNode<Integer>>>();
		ArrayList<Node<BinaryTreeNode<Integer>>> queue = new ArrayList<Node<BinaryTreeNode<Integer>>>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			ArrayList<Node> tempQueue = new ArrayList<Node>();
			
			for(Node tmp: queue){
				tempQueue.add(tmp);
			}
			
			queue.removeAll(queue);
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			
			for(Node n: tempQueue){
				if(n.hasLeft()){
					queue.add(n.left);
				}
				if(n.hasRight()){
					queue.add(n.right);
				}
				
				list.add(new Integer(n.value));				
			}
			result.add(list);
		}
		return result;		
	}


}

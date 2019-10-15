import java.util.ArrayList;
import java.util.Stack;

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

	public static void printZigZag(BinaryTreeNode<Integer> root) {
		

		// Write your code here	
        Stack<BinaryTreeNode<Integer>> s1 = new Stack<BinaryTreeNode<Integer>>();
        Stack<BinaryTreeNode<Integer>> s2 = new Stack<BinaryTreeNode<Integer>>();
        Stack<BinaryTreeNode<Integer>> tmp;
        s1.add(root);
        boolean leftToRight = false;
        while(!s1.isEmpty()){
            BinaryTreeNode<Integer> n = s1.pop();
            System.out.print(n.data + " ");
           
            
            if(!leftToRight){
                if(n.left != null){
                    s2.push(n.left);
                }
                if(n.right != null){
                    s2.push(n.right);
                }
            }else{
                if(n.right != null){
                    s2.push(n.right);
                }
                if(n.left != null){
                    s2.push(n.left);
                }
            }
       
            if(s1.isEmpty()){
                leftToRight = !leftToRight;
                System.out.println();
                tmp = s1;
                s1 = s2;
                s2 = tmp;
            }
        }
    }
}

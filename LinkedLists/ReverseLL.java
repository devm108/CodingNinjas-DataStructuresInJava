package Assignments;
import java.util.Scanner;
public class ReverseLL {
	public static void printReverseRecursive(LinkedListNode<Integer> root) {
		if (root==null) {
			return;
		}
		printReverseRecursive(root.next);
		System.out.print(root.data+" ");
	}
	
	
	private static Scanner s= new Scanner(System.in);

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		ReverseLL.printReverseRecursive(input());

	}

}

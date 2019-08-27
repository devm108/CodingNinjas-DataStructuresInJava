package Assignments;
import java.util.Scanner;
public class Palindrome {
	static LinkedListNode<Integer> left= null;
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
		left=head;
		return find(head);
	}
	public static boolean find(LinkedListNode<Integer> right) {
		if (right == null) {
			return true;
		}
		boolean val= find(right.next);
		if (val == true) {
			if (left.data == right.data) {
				left= left.next;
				return true;
			}
		}
		return false;
	}
	
	private static Scanner s = new Scanner(System.in);
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
		System.out.print(Palindrome.isPalindrome_2(input()));

	}

}

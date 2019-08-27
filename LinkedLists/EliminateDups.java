package Assignments;
import java.util.Scanner;
public class EliminateDups {
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp= head;
		while (temp.next != null) {
			if (temp.data.equals((temp.next).data)) {
				temp.next= temp.next.next;
			} else {
				temp= temp.next;
			}
		}
		return head;
	}
	
	private static Scanner s = new Scanner(System.in);
	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data != -1) {
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
	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		print(EliminateDups.removeDuplicates(input()));

	}

}

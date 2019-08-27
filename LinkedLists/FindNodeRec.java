package Assignments;
import java.util.Scanner;
public class FindNodeRec {
	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
		if (head == null) {
			return -1;
		}
		if (head.data == n) {
			return 0;
		}
		int index = indexOfNRec(head.next, n);
		if (index >= 0) {
			return ++index;
		}
		return -1;
	}
	
static Scanner s = new Scanner(System.in);
	
	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		int n = s.nextInt();
		System.out.println(FindNodeRec.indexOfNRec(head, n));
	}
}

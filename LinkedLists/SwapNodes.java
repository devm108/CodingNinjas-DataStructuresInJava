package Assignments;
import java.util.Scanner;

public class SwapNodes {
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
		LinkedListNode<Integer> prev1 = null;
		LinkedListNode<Integer> prev2 = null;
		LinkedListNode<Integer> curr1 = head;
		LinkedListNode<Integer> curr2 = head;
		while (curr1 != null && i != 0) {
			prev1 = curr1;
			curr1 = curr1.next;
			i--;
		}
		while (curr2 != null && j != 0) {
			prev2 = curr2;
			curr2 = curr2.next;
			j--;
		}
		if (curr1 == null || curr2 == null) {
			return head;
		}
		if (prev1 != null) {
			prev1.next = curr2;
		} else {
			head = curr2;
		}
		if (prev2 != null) {
			prev2.next = curr1;
		} else {
			head = curr1;
		}
		LinkedListNode<Integer> temp = curr1.next;
		curr1.next = curr2.next;
		curr2.next = temp;
		return head;
		
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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		print(SwapNodes.swap_nodes(input(), s.nextInt(), s.nextInt()));

	}

}

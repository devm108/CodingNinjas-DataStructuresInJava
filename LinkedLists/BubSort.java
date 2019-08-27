package Assignments;
import java.util.Scanner;
public class BubSort {
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head){
		LinkedListNode<Integer> i = head;
		LinkedListNode<Integer> j = head.next;
		for (i=head; i.next != null; i=i.next) {
			for (j=i.next; j != null; j=j.next) {
				if (i.data > j.data) {
					int temp = i.data;
					i.data = j.data;
					j.data = temp;
				}
			}
		}
		return head;
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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		print(BubSort.bubbleSort(input()));

	}

}

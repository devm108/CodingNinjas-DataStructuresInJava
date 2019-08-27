package Assignments;
import java.util.Scanner;
public class kthRev {
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> next = null;
		LinkedListNode<Integer> prev = null;
		int count = 0;
		while (count<k && curr != null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		if (next != null) {
			head.next=kReverse(next, k);
		}
		return prev;
	}
	static Scanner s = new Scanner(System.in);
	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}

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
		print(kthRev.kReverse(input(), s.nextInt()));

	}

}

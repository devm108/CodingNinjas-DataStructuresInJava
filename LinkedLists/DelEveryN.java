package Assignments;
import java.util.Scanner;
public class DelEveryN {
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		LinkedListNode<Integer> temp=head;
		LinkedListNode<Integer> curr=null;
		while (temp != null) {
			int l = M;
			int i=1;
			while (i<l && temp != null) {
				temp=temp.next;
				i++;
			}
			if (temp==null) {
				break;
			}
			curr=temp.next;
			int j=1;
			int d=N;
			while (curr != null && j<d) {
				curr=curr.next;
				j++;
			}
			if (curr==null) {
				temp.next=curr;
				break;
			}
			temp.next=curr.next;
			temp=curr.next;
		}
		return head;
	}
	
	
	static Scanner s = new Scanner(System.in);
	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
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
		print(DelEveryN.skipMdeleteN(input(), s.nextInt(), s.nextInt()));

	}

}

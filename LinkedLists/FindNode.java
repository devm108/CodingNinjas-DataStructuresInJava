package Assignments;
import java.util.Scanner;
public class FindNode {
	public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
		
		LinkedListNode<Integer> temp= head;
		int len=0;
		while (temp != null) {
			if (temp.data == n) {
				return len;
			}
			len++;
			temp= temp.next;
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
		System.out.println(FindNode.indexOfNIter(head, n));
	}
}

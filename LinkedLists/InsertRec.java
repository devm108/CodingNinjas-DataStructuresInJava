import java.util.Scanner;
public class InsertRec {
	public static Node<Integer> insertR(Node<Integer> head, int pos, int elem){
		if (pos == 0) {
			Node<Integer> newNode = new Node<>(elem);
			newNode.next = head;
			return newNode;
		}
		head.next = insertR(head.next, pos-1, elem);
		return head;
	}
	
	static Scanner s = new Scanner(System.in);
	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
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
	
	public static void print(Node<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		int pos = s.nextInt();
		int elem = s.nextInt();
		head = insertR(head, pos, elem);
		print(head);

	}

}

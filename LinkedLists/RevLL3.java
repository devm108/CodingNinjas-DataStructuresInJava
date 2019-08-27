import java.util.Scanner;
public class RevLL3 {
	public static Node<Integer> reverse3(Node<Integer> head){
		if (head==null || head.next==null) {
			return head;
		}
		Node<Integer> reverseTail = head.next;
		Node<Integer> smallHead = reverse3(head.next);
		reverseTail.next = head;
		head.next = null;
		return smallHead;
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
		head = reverse3(head);
		print(head);

	}

}

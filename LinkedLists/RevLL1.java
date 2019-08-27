import java.util.Scanner;
public class RevLL1 {
	public static Node<Integer> reverseRec(Node<Integer> head){
		if (head.next==null || head==null) {
			return head;
		}
		Node<Integer> finalHead = reverseRec(head.next);
		Node<Integer> temp = finalHead;
		while (temp.next != null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return finalHead;
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
		head = reverseRec(head);
		print(head);

	}

}

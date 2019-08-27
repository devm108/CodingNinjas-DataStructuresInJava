import java.util.Scanner;
public class RevLL2 {
	public static DoubleNode reverse2(Node<Integer> head) {
		if (head==null || head.next==null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode smallAns = reverse2(head.next);
		smallAns.tail.next = head;
		head.next = null;
		DoubleNode ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
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
//		Node<Integer> head = takeInput();
//		DoubleNode ans = new DoubleNode();
//		ans.head = .head;
//		ans.tail = head;
//		head = reverse2(head);
//		print(head);

	}

}




import java.util.Scanner;

public class DelNode {
	public static Node<Integer> deleteIthNode(Node<Integer> head, int i){
		if (head==null) {
			return null;
		}
		Node<Integer> temp= head;
		int actualLength=0;
		while (temp != null) {
			temp=temp.next;
			actualLength++;
		}
		if (i> actualLength-1) {
			return head;
		}
		temp= head;
		if (i==0) {
			head= temp.next;
			return head;
		}
		Node<Integer> prev= null;
		int len=0;
		while (len<i) {
			prev= temp;
			temp=temp.next;
			len++;
		}
		prev.next= temp.next;
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
		head = DelNode.deleteIthNode(head, pos);
		print(head);
	}
}

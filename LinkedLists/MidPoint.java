import java.util.Scanner;
public class MidPoint {
	public static int printMiddel(Node<Integer> head) {
		Node<Integer> temp=head;
		int len=1;
		while (temp != null) {
			len++;
			temp=temp.next;
		}
		int mid= (int)Math.ceil(len/2);
		int start=1;
		temp=head;
		while (start<mid) {
			temp=temp.next;
			start++;
		}
		return temp.data;
	}
	private static Scanner s = new Scanner(System.in);
	public static Node<Integer> input() {
		int data = s.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while (data!=-1) {
			Node<Integer> newNode = new Node<Integer>(data);
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
		System.out.println(MidPoint.printMiddel(input()) + "");

	}

}

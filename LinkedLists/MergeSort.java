import java.util.Scanner;
public class MergeSort {
	public static Node<Integer> getMiddle(Node<Integer> head) {
		if (head==null) {
			return head;
		}
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static Node<Integer> sortedMerge(Node<Integer> head1, Node<Integer> head2) {
		Node<Integer> ans = null;
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		if(head1.data <= head2.data) {
			ans = head1;
			ans.next = sortedMerge(head1.next, head2);
		} else {
			ans = head2;
			ans.next = sortedMerge(head1, head2.next);
		}
		return ans;
	}
	public static Node<Integer> mergeSort(Node<Integer> head) {
		if (head==null || head.next==null) {
			return head;
		}
		Node<Integer> middle = getMiddle(head);
		Node<Integer> nextMiddle = middle.next;
		middle.next = null;
		Node<Integer> left = mergeSort(head);
		Node<Integer> right = mergeSort(nextMiddle);
		Node<Integer> sortedList = sortedMerge(left, right);
		return sortedList;
	}
	private static Scanner s = new Scanner(System.in);

	public static Node<Integer> input() {
		int data = s.nextInt();

		Node<Integer> head = null;
		Node<Integer> tail = null;
		while (data != -1) {
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

	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		print(MergeSort.mergeSort(input()));

	}

}

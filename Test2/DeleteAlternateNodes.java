/*
 class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
} */
public class Solution {
	public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
        if (head == null) {
			return;
		}
		LinkedListNode<Integer> prev = head;
		LinkedListNode<Integer> now = head.next;
		while (prev != null && now != null) {
			prev.next = now.next;
			now = null;
			prev = prev.next;
			if (prev != null) {
				now = prev.next;
			}
		}

	}
}

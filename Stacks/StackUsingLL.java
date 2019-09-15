
public class StackUsingLL<T> {
	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	public boolean isEmpty() {
		return size() == 0;
	}
	public T pop() throws StackEmptyException {
		if (size() == 0) {
			throw new StackEmptyException();
		}
		T tempdata = head.data;
		head = head.next;
		size--;
		return tempdata;
	}
	public T top() throws StackEmptyException {
		if (size() == 0) {
			throw new StackEmptyException();
		}
		return head.data;
	}

}

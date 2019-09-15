
public class QueueUsingLL<T> {
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size() == 0;
	}
	T front() throws QueueEmptyException {
		if (size() == 0) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	void enqueue(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.next = null;
		if (front == null) {
			front=newNode;
            rear=newNode;
            size++;
            return;
		}
		rear.next=newNode;
        rear=newNode;
        size++;
	}
	T dequeue() throws QueueEmptyException {
		if (size() == 0) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		size--;
		return temp;
	}
	

}

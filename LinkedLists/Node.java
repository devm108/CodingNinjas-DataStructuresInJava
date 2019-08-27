
public class Node<T> {
	T data;
	Node<T> next;
	
	Node(T data) {
		this.data= data;
		next=null;
	}
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

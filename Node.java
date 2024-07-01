public class Node<T> {
	//תכונות המחלקה
	private T value;
	private Node<T> next;
	//פעולות בונות
	public Node(T value) {
		this.value=value;
		this.next=null;
	}
	public Node(T value,Node<T> next) {
		this.value=value;
		this.next=next;
	}
	public Node(int x) {
		// TODO Auto-generated constructor stub
	}
	//פעולות מאחזרות
	public T getValue() {
		return this.value;
	}
	public Node<T> getNext(){
		return this.next;
	}
	//פעולות משנות ערך
	public void setValue(T value) {
		this.value=value;
	}
	public void setNext(Node<T> next) {
		this.next=next;
	}
	//פעולה שבודקת אם יש עוד חוליה אחרי
	public boolean hasNext() {
		return (this.next!=null);
	}
	

}

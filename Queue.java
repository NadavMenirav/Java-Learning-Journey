public class Queue<T> {
	private Node<T> first;
	private Node<T> last;
	
	public Queue() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public T head() {
		return this.first.getValue();
	}
	
	public T remove() {
		T x = this.first.getValue();
		this.first = this.first.getNext();
		if (this.first == null)
			this.last = null;
		return x;
	}
	
	public void insert(T x) {
		if (this.last == null) {
			this.first = new Node<T>(x);
			this.last = this.first;
		}
		else {
			this.last.setNext(new Node<T>(x));
			this.last = this.last.getNext();
		}
	}
	
	public String toString() {
		if (this.isEmpty()) return "[]";
		this.insert(null);
		String s = "[";
		T temp = this.remove();
		while (temp != null) {
			s = s + temp + ",";
			this.insert(temp);
			temp = this.remove();
		}
		s = s.substring(0, s.length() - 1) + "]";
		return s;
	}
}	


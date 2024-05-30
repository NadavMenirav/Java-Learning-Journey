import java.util.*;
public class check {
	public static int qLengthRec(Queue<Integer> q) {
		int count = 0, x = 0;
		if (q.isEmpty())
			return 0;
		x = q.remove();
		count = 1 + qLengthRec(q);
		q.insert(x);
		flipQ(q);
		return count;  
	}
	
	public static void flipQ(Queue<Integer> q) {
		int x = 0;
		if (q.isEmpty())
			return;
		
		x = q.remove();
		flipQ(q);
		q.insert(x);
	}
	
	public static boolean isXInQ(Queue<Integer> q, int x) {
		Queue<Integer> temp = new Queue<Integer>();
		int check = 0;
		boolean isFound = false;
		while(!q.isEmpty()) {
			check = q.remove();
			if (check == x)
				isFound = true;
			temp.insert(check);
		}
		while(!temp.isEmpty()) {
			q.insert(temp.remove());
		}
		return isFound;
	}
	
	public static void noDupes(Queue<Integer> q) {
		Queue<Integer> temp = new Queue<Integer>();
		int x = 0;
		
		while(!q.isEmpty()) {
			x = q.remove();
			if (!isXInQ(temp, x))
				temp.insert(x);
		}
		while(!temp.isEmpty()) 
			q.insert(temp.remove());
	}
	
	public static void mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {
		Queue<Integer> newQ = new Queue<Integer>();
		int i = 0;
		while(!q1.isEmpty() || !q2.isEmpty()) {
			i++;
			if (q1.isEmpty())
				newQ.insert(q2.remove());
			else if (q2.isEmpty())
				newQ.insert(q1.remove());
			else {
				if (i % 2 == 0) 
					newQ.insert(q1.remove());
				else
					newQ.insert(q2.remove());
			}
		}
		while(!newQ.isEmpty()) {
			q2.insert(newQ.remove());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Queue<Integer> q =new Queue<Integer>();
		q.insert(8);
		q.insert(7);
		q.insert(6);
		q.insert(8);
		q.insert(6);
		q.insert(-3);
		q.insert(7);
		
		Queue<Integer> q2 = new Queue<Integer>( );
		q2.insert(22);
		q2.insert(430);
		q2.insert(0);
	
		System.out.println(q.toString());
		System.out.println(q2.toString());
		mergeQueues(q, q2);
		System.out.println(q2.toString());
	}

}

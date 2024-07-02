import java.util.*;
public class QuFir {
	public static int qLength(Queue<Character> q) {
		Queue<Character> temp = new Queue<Character>();	
		int count = 0;
		while (!q.isEmpty()) {
			temp.insert(q.remove());
			count++;
		}
		while(!temp.isEmpty()) {
			q.insert(temp.remove());
		}
		return count;
	}
	
	public static int qLengthRec(Queue<Integer> q) {
		int count = 0, x = 0;
		if (q.isEmpty())
			return 0;
		x = q.remove();
		count = 1 + qLengthRec(q);
		q.insert(x);
		return count;  
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
	
	/*public static boolean isXInQRec(Queue<Integer> q, int x) {
		if (q.isEmpty())
			return false;
		
		
	}*/
	
	public static void main(String[] args) {
		Queue<Integer> q =new Queue<Integer>();
		q.insert(8);
		q.insert(7);
		q.insert(6);
		System.out.println(q.toString());
		System.out.println(qLengthRec(q) + q.toString());
	}
	
}

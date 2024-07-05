import java.util.*;
public class Reshimot {
	public static int listLength(Node<Integer> list) {
		int count=0;
		Node<Integer> p=list;
		while (p!=null) {
			count++;
			p=p.getNext();
		}
		return count;
	}
	public static boolean isNumOnList(Node<Integer> list, int num) {
		Node<Integer> p=list;
		while(p!=null) {
			if(p.getValue()==num)
				return true;
			p=p.getNext();
		}
		return false;
	}
	public static void difSmallEvenBigOdd(Node<Integer> list) {
		int smallEven=1,bigOdd=0; //temporary values
		Node<Integer> p=list;
		//getting real values for both variables
		while(smallEven==1||bigOdd==0) {
			if(p.getValue()%2==0)
				smallEven=p.getValue();
			else
				bigOdd=p.getValue();
			p=p.getNext();
		}
		//Getting the smallest even number and biggest odd number
		p=list;
		while(p!=null) {
			if(p.getValue()%2==0&&p.getValue()<smallEven)
				smallEven=p.getValue();
			else if(p.getValue()%2!=0&&p.getValue()>bigOdd)
				bigOdd=p.getValue();
			p=p.getNext();
		}
		System.out.println(Math.abs(bigOdd-smallEven));
	}
	public static boolean isSorted(Node<Integer> list) {
		Node<Integer> p=list;
		int previous;
		
		while (p!= null) {
			
			
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Node<Integer> list=null,help=null,last=null;
		int num;
		System.out.println("Enter first integer");
		num=input.nextInt();
		list=new Node<Integer>(num);
		last=list;
		System.out.println("Enter an integer");
		num=input.nextInt();
		while(num>0) {
			help=new Node<Integer>(num);
			last.setNext(help);
			last=help;
			System.out.println("Enter an integer");
			num=input.nextInt();
		}
		System.out.println(isNumOnList(list,23));
		difSmallEvenBigOdd(list);
		
	}

}

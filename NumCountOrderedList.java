import java.util.*;
public class NumCountOrderedList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, exChoice; 
		/*
		 *עשיתי מעיין "תפריט" כדי שידפיס כל פעם רק תוצאות של סעיף מסוים, שיהיה לי 
		 *יותר נוח לעשות את דוגמאות ההרצה
		 */
		System.out.println("Choose the exercise you want, 1 or 2");
		exChoice = input.nextInt();
		
		//Components of list
		NumCount numC=new NumCount(3,9);
		NumCount numC2=new NumCount(5,1);
		NumCount numC3=new NumCount(8,2);
		
		Node<NumCount> list=new Node<NumCount>(numC);
		Node<NumCount> help=new Node<NumCount>(numC2);
		Node<NumCount> last=new Node<NumCount>(numC3);
		
		list.setNext(help);	
		help.setNext(last);
	
		OrderedList theOne=new OrderedList(list);
		
		System.out.println("Enter a number");
		x = input.nextInt();
		
		if (exChoice == 1)
			theOne.insertNum(x);
		
		Node<NumCount> p = theOne.getLst();
		while (p != null) {
			System.out.println(p.getValue().toString());
			p = p.getNext();
		}
		
		if (exChoice == 2) {
			System.out.println("x = " + x);
			System.out.println("Value function returns for " + x + " is " + theOne.valueN(x));
		}
		
	}

}

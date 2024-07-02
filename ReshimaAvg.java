import java.util.*;
public class ReshimaAvg {
	public static Node<Long> avgRound(Node<Integer> list1, Node<Integer> list2){
		Node<Integer> p1=list1,p2=list2;
		Node<Long> list3=null,help3=null,last3=null;
		int i,sum=0;
		long avg;
		for(i=0;i<p1.getValue();i++) {
			sum+=p2.getValue();
			p2=p2.getNext();
		}
		avg=Math.round((double) sum/p1.getValue());
		sum=0;
		p1=p1.getNext();
		list3=new Node<Long>(avg);
		last3=list3;
		while(p1!=null && p2!=null) {
			for(i=0;i<p1.getValue();i++) {
				sum+=p2.getValue();
				p2=p2.getNext();
			}
			avg=Math.round((double) sum/p1.getValue());
			sum=0;
			p1=p1.getNext();
			help3=new Node<Long>(avg);
			last3.setNext(help3);
			last3=help3;
		}
		return list3;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Node<Integer> list1=null,help1=null,last1=null,list2=null,help2=null,last2=null;
		int num;
		num=input.nextInt();
		list1=new Node<Integer>(num);
		last1=list1;
		num=input.nextInt();
		while(num>0) {
			help1=new Node<Integer>(num);
			last1.setNext(help1);
			last1=help1;
			num=input.nextInt();
		}
		num=input.nextInt();	
		list2=new Node<Integer>(num);
		last2=list2;
		num=input.nextInt();
		while(num>0) {
			help2=new Node<Integer>(num);
			last2.setNext(help2);
			last2=help2;
			num=input.nextInt();
		}
		Node<Long> list3=avgRound(list1,list2);
		Node<Long>p=list3;
		while(p!=null) {
			System.out.println(p.getValue());
			p=p.getNext();
		}
		
	}

}

import java.util.*;
public class E45P137 {
	// The program scans 100 real numbers and prints the smallest one out of them
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		double a,b,max1,min1;
		int x,x1=1;
		System.out.println("Enter two numbers");
		a=input.nextDouble();
		b=input.nextDouble();
		if (a>b)
			max1=a;
		else 
			max1=b;
		min1=max1;
		for (x=2;x<101;x++) {
			System.out.println("Enter two numbers");
			a=input.nextDouble();
			b=input.nextDouble();
			if (a>b)
				max1=a;
			else 
				max1=b;
			if (max1<min1) {
				min1=max1;
				x1=x;
			}
				
		}
		System.out.println("The lowest numbers among the higher ones in each pair:"+min1);
		System.out.println("In pair number:"+x1);
			

	}
}	


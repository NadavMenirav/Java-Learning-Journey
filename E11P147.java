import java.util.*;
public class E11P147 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a,b,mul,sum;
		System.out.println("Enter two numbers");
		a=input.nextDouble();
		b=input.nextDouble();
		mul=a*b;
		sum=mul;
		while (mul!=0) {
			System.out.println("Enter two numbers");
			a=input.nextDouble();
			b=input.nextDouble();
			mul=a*b;	
			sum=sum+mul;
		}
		System.out.println("The sum is:"+sum);
		if (sum>0)
			System.out.println("The sum is positive");
		if (sum<0)
			System.out.println("The sum is negative");
	}
	

}

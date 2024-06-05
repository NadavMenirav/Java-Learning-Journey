import java.util.*;
public class E6P106 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a,b,c,s;
		System.out.println("Enter 3 numbers");
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		p=a+b+c;
		System.out.println("The perimeter:"+p);
		s=Math.sqrt(0.5*p*(0.5*p-a)*(0.5*p-b)*(0.5*p-c));
		System.out.println("Area:"+s);
	}

}

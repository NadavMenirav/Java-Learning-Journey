import java.util.*;
public class MyFirstProgram {
//Scans from user the length of an edge of an equilateral triangle, and prints its area and its perimeter
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double a,h,p,s;
		System.out.println("Please Enter the Length ");
		a=input.nextDouble();
		System.out.println("Please Enter the Height ");
		h=input.nextDouble();
		p=3*a;
		s=a*h;
		System.out.println("Perimeter:"+p+" Area:"+s);

	}

}

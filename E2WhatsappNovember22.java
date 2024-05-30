import java.util.*;
public class E2WhatsappNovember22 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double x,y;
		System.out.println("Enter x value ");
		x=input.nextDouble();
		while (x>=6||x<=-2) {
			y=Math.sqrt(Math.pow(x,2)-4*x-12);
			System.out.println("y="+y);
			System.out.println("Enter x value");
			x=input.nextDouble();
			
		}

		

	}

}

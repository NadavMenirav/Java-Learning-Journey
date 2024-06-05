import java.util.*;
public class ForLoop1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int adults,kids,people,x;
		String fname;
		people=0;
		for (x=1;x<5;x++) {
			System.out.println("Enter the family name, number of adults, and number of kids");
			fname=input.next();
			adults=input.nextInt();
			kids=input.nextInt();
			people=people+adults+kids;
			if (kids==0)
				System.out.println(fname);
		}
		System.out.println(people);
	}

}

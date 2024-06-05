import java.util.*;
public class ForLoop2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name;
		int grade,max,x;
		max=62;
		for (x=1; x<5;x++) {
			System.out.println("Enter your name and grade ");
			name=input.next();
			grade=input.nextInt();
			if (grade>=88)
				System.out.println("Going to 5 points");
			if (grade<63)
				System.out.println("Going to 3 point");
			if (grade<83 && grade>=63) {
				if (grade>max)
					max=grade;
		}
		System.out.println("Highest grade from those who stay in 4 points: "+max);

	}

}

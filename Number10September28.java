import java.util.*;
public class Number10September28 {
//קולטת מספר שלם קטן מ10000 ומדפיסה את מספר הספרות בו.
//דוגמה: קלט : 453, פלט: 3
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		System.out.println("Enter a whole number lower than 10000");
		num=input.nextInt();
		if (num/1000>0)
			System.out.println("4 digit number");
		else {
			if(num/100>0)
				System.out.println("3 digit number");
			else {
				if(num/10>0)
					System.out.println("2 digit number");
				else
					System.out.println("1 digit number");
			}
		}
	

	}

}

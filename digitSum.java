import java.util.*;
public class digitSum {
	//Gets from user 21 integers and puts the into an array. It then
	//prints each number and its digits sum.
	public static void digitSum(int x1) {
		//Prints the sum of a number's digits.
		x1=Math.abs(x1);
		int sum=0;
		while (x1>0) {
			sum+=x1%10;
			x1=x1/10;
		}
		System.out.println("The sum is:"+sum);
	}
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int i;
		int[] numbers= new int[21];
		for(i=0;i<numbers.length;i++) {
			System.out.println("Enter an integer");
			numbers[i]=input.nextInt();
		}
		for(i=0;i<numbers.length;i++) {
			System.out.println("The number is:"+numbers[i]);
			digitSum(numbers[i]);
		}
	}

}

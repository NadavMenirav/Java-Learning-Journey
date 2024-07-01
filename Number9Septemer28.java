import java.util.*;
public class Number9Septemer28 {
//התכנית קולטת שני מספרים ומדפיסה מי גדול ממי או שווים
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double num1,num2;
		System.out.println("Enter Two numbers");
		num1=input.nextDouble();
		num2=input.nextDouble();
		if(num1>num2) 
			System.out.println(num1+" is bigger");
		else {
			if(num2>num1)
				System.out.println(num2+" is bigger");
			else
				System.out.println("Equal");
		}
		
	}
}

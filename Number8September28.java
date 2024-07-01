import java.util.*;
public class Number8September28 {
//התכנית קולטת מספר שלם דו ספרתי
//אם הוא זוגי תיצור מספר חדש שערך כל אחת מספרותיו קטנה ב1 מהמספר המקורי
//אם הוא אי זוגי, היא תיצור מספר שערך כל אחת מספרותיו גדולה ב1 מהמספר המקוריS
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num, tens, ones, newTens,newOnes,newNum;
	System.out.println("Enter a Two-Digit Number");
	num=input.nextInt();
	tens=num/10;
	ones=num%10;
	if (num%2==0) {
		newTens=tens-1;
		newOnes=ones-1;
	}
	else {
		newTens=tens+1;
		newOnes=ones+1;
	}
	newNum=newTens*10+newOnes;
	System.out.println(newNum);

	}

}

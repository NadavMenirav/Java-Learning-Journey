import java.util.*;
public class S1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Student x1,x2;
		//בניית עצם עם נתונים באופן ישיר 
		x1=new Student("Gad","1234",72.8);
		x2=new Student("Shira","5555",97.6);
		//בניית עצם עם נתונים על ידי קל
		Student x3;
		String name1,id1;
		double avg1;
		System.out.println("Enter the name, id, and average");
		name1=input.next();
		id1=input.next();
		avg1=input.nextDouble();
		x3=new Student(name1,id1,avg1);
		//שימוש בפעולות גט
		System.out.println(x3.getName());
		System.out.println(x1.getName());
		System.out.println(x2.getName()+" "+x2.getAvg());
		//הדפס את שם הסטודנט עם הממוצע הנמוך יותר מבין x1 ו x2
		if(x1.getAvg()>x2.getAvg())
			System.out.println(x1.getName());
		else if (x1.getAvg()<x2.getAvg())
			System.out.println(x2.getName());
		else
			System.out.println(x1.getName()+" has the same grade as "+x2.getName());
		//שימוש בפעולות סט בשביל להעלות את הממוצע של 3 ב5 נקודות ושינוי השם של 2
		x3.setAvg(x3.getAvg()+5);
		x2.setName("Shir Levy");
	}

}

import java.util.*;
public class E3T1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String fname;
		int fMembers,room,roomLeft,price;
		System.out.println("Enter how many people can be in the trip");
		room=input.nextInt();
		roomLeft=room;
		while (roomLeft>0) {
			System.out.println("Enter your family name");
			fname=input.next();
			System.out.println("Enter how many family members going to the trip");
			fMembers=input.nextInt();
			price=200*fMembers;
			if (roomLeft>=fMembers) {
				System.out.println("your family name is:"+fname);
				System.out.println("your price:"+price);
				roomLeft=roomLeft-fMembers;
			}
			else 
				System.out.println("no room for you");
		}
	}
}


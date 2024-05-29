import java.util.*;
public class Archer {
	public static boolean success(int num) {
		Scanner input=new Scanner(System.in);
		int i,score,sum=0,count6=0;
		double avg;
		for(i=0;i<num;i++) {
			System.out.println("Enter score for arrow "+(i+1));
			score=input.nextInt();
			if(score==10)
				return true;
			if(score>=6)
				count6++;
			sum+=score;
		}
		if(count6*2>num)
			return true;
		avg= (double) sum/num;
		if(avg>5.0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(success(3));
	}
}
	

import java.util.*;
public class IsPrime {
	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		return isPrime(num, 2);
	}
	public static boolean isPrime(int num, int i) {
		if (i == num)
			return true;
		if (num % i == 0)
			return false;
		return isPrime(num, i + 1);
		
	}
	public static void main(String[] args) {
		System.out.println(isPrime(4));

	}

}  

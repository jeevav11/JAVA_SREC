import java.util.*;
public class factorial {
	static int fact(int n) {
		if(n<=1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
	    System.out.print("Enter a number: ");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		System.out.println("Factorial of the number is: "+fact(n));
	}
}

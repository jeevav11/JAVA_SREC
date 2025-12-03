import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=obj.nextInt();
		if(a%5==0) {
			System.out.println("True and it's a multiple of 5");
		}
		else {
			System.out.println("False and it's not a multiple of 5");
		}
	}
}

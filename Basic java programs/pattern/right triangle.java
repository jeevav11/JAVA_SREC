import java.util.*;

public class Main {
	public static void printRightTriangle(int rows) {
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		if(sc.hasNextInt()) {
			int rows=sc.nextInt();
			printRightTriangle(rows);

		}
	}
}

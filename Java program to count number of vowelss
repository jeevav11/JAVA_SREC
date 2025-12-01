import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a name:");
		String a=obj.next();
		String b="aeiou";
		int count=0;
		for(int i=0; i<a.length(); i++) {
			for(int j=0; j<b.length(); j++) {
				if(a.charAt(i)==b.charAt(j)) {
	                count++;
					System.out.println(a.charAt(i)+"-"+b.charAt(j));
				}
			}
		}
		System.out.println("Total number of vowels:"+count);
	}
}


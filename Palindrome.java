import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a name:");
    String s=sc.next();
        String rev = new StringBuilder(s).reverse().toString();
        if (s.equals(rev)) {
            System.out.println("yes it is a palindrome.");
        } else {
            System.out.println("No it is not a palindrome.");
        }
    }
}
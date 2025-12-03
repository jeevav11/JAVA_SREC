import java.util.*;

public class Main {

	static void generate(int n) {
		helper("", n, '0');
	}

	static void helper(String s, int n, char last) {
		if (s.length() == n) {
			System.out.println(s);
			return;
		}
		helper(s + "0", n, '0');
		if (last != '1') helper(s + "1", n, '1');
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		generate(n);
	}
}

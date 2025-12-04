import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean f=true;
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                if(f){
                System.out.print(i); 
                f=false;
                    }
                else {
                System.out.print(" "+i);
            }
        }
        }
    }
}

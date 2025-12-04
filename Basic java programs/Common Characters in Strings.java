import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       String a=sc.next();
       String b=sc.nextLine();
       boolean found=false;
       for(int i=0;i<a.length();i++){
             for(int j=0;j<b.length();j++){
             if(a.charAt(i)==b.charAt(j)){
                found=true;
             }
          }
        }
    if(found){
         System.out.println("yes");
    }
     else{
         System.out.println("no");
     }
   }
}

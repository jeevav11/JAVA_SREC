import java.util.*;
public class Main {
    private static List<List<String>> all=new ArrayList<>();
 private static void solve(int r, int n,int[] queens,boolean[] cols,boolean[] diag1,boolean[] diag2){
     if(r==n){
         printsolution(queens,n);
         all.add(printsolution(queens,n));
         return;
     }
     for(int c=0;c<n;c++){
         int d1=r+c;
         int d2=r-c+(n-1);
         if(cols[c]||diag1[d1]||diag2[d2])
         continue;
         queens[r]=c;
         cols[c]=diag1[d1]=diag2[d2]=true;
         solve(r+1,n,queens,cols,diag1,diag2);
         cols[c]=diag1[d1]=diag2[d2]=false;
     }
 }
 private static List<String> printsolution(int[] queens,int n){
     
         List<String> board=new ArrayList<>();
         for(int r=0;r<n;r++){
             char[] rarr=new char[n];
             Arrays.fill(rarr,'.');
             rarr[queens[r]]='Q';
             board.add(new String(rarr));
         }
                return board;
     }
    

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       if(!sc.hasNextInt())
       return;
       int n=sc.nextInt();
       if(n<=0)
       return;
       int[] queens=new int[n];
       boolean[] cols=new boolean[n];
        boolean[] diag1=new boolean[2*n-1];
         boolean[] diag2=new boolean[2*n-1];
         solve(0,n,queens,cols,diag1,diag2);
         for(int i=0;i<all.size();i++){
             List<String>solution=all.get(i);
             for(String r:solution){
                 System.out.println(r);
             }
             if(i<all.size()-1){
                 System.out.println();
             }
         }
}
}

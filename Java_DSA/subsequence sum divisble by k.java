import java.util.*;
public class Main
{
    public static int get(int n,int[] arr,int k){
        int c=0;
            int sum=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            map.put(0,1);
           
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                int r=sum%k;
                if(r<0){
                   r+=k; 
                }
                if(map.containsKey(r)){
                    c+=map.get(r);
                }
                 
            map.put(r,map.getOrDefault(r,0)+1);
    }
        return c;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
			int k=sc.nextInt();
			System.out.println(get(n,arr,k));
	}
}

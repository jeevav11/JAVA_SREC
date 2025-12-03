
public class HollowPyramid{
	public static void main(String[] args) {
		System.out.println("Hello World");
		for(int i=1;i<=5;i++){
        for(int k=5;k>i;k--){
            System.out.print("  ");
        }
    for(int j=0;j<i;j++){
        if((i==3&&j==1)||(i==4&&(j==1||j==2)))
         System.out.print("    "); 
    else
         System.out.print("  * ");
    }
     System.out.println();
    }

	}
}

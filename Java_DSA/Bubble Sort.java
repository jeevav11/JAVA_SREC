import java.util.Arrays;
import java.util.Scanner;
public class Main{
	    static void bubbleSort(int arr[], int n){
	        int i, j, temp;
	        for (i = 0; i < n - 1; i++) {
	            for (j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	    static void printArray(int arr[], int size){
	        System.out.println(Arrays.toString(arr));
	    }
	    public static void main(String args[]){
	        Scanner ob = new Scanner(System.in);
			System.out.print("Enter the size of array:");
            int N=ob.nextInt();
            int [] arr= new int[N];
            for(int i=0;i<arr.length;i++){
                arr[i]=ob.nextInt();
            }
	        int n = arr.length;
	        bubbleSort(arr, n);
	        System.out.println("Sorted array : ");
	        printArray(arr, n);
	    }
	}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void reorder(List<Integer> list ) {
		int left=0;
		int right=list.size()-1;
		while(left<right) {
			int temp=list.get(left);
			list.set(left,list.get(right));
			list.set(right,temp);
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(6);
		list.add(3);
		System.out.println("Original List: " + list);
		reorder(list);
		System.out.println("reversed list: "+list);
	}
}

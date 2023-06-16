package solveProOfArraybyUsingColl;

import java.util.ArrayList;
import java.util.List;

public class merge {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		List<Integer> list2=new ArrayList<Integer>();
		list2.add(60);
		list2.add(70);
		list2.add(80);
		list2.add(90);
		list2.add(100);
		
		list2.addAll(list);
		System.out.println(list2);

		
	}

}

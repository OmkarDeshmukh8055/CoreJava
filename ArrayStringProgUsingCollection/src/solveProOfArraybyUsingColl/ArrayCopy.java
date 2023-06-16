package solveProOfArraybyUsingColl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ArrayCopy {

	public static void main(String[] args) {

		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(60);
		list.add(30);
		list.add(40);
		list.add(20);
		
		System.out.println(list);
		
		System.out.println("--ArrayList--");
		List<Integer> list2=new ArrayList<Integer>(list);
		System.out.println(list2);
		
		System.out.println("--LinkedList--");
		
		List<Integer> list3=new LinkedList<Integer>(list);
		System.out.println(list3);
		
	System.out.println("-Hashset-");
		
		HashSet<Integer> list4=new HashSet<Integer>(list);
		System.out.println(list4);
	
	System.out.println("-LinkedHashset-");
		
		LinkedHashSet<Integer> list5=new LinkedHashSet<Integer>(list);
		System.out.println(list5);

	}

}

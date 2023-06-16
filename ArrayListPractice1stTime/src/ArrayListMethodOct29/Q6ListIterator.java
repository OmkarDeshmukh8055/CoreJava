package ArrayListMethodOct29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Q6ListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		ListIterator<Integer> it=list.listIterator(list.size());
		  
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}

	}

}

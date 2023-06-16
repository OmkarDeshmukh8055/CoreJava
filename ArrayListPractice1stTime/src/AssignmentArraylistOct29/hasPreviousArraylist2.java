package AssignmentArraylistOct29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class hasPreviousArraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer> list=new ArrayList<>();
 list.add(10);
 list.add(20);
 list.add(30);
 list.add(40);

 list.add(50);
 list.add(60);

 ListIterator<Integer> it=list. listIterator(list.size()) ;
 
if( it.hasPrevious()) 
{
	System.out.println(it .previous());
}
	}

}

package AssignmentArraylistOct29;

import java.util.ArrayList;
import java.util.Iterator;



public class hasNextArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer> list=new ArrayList<>();
 list.add(10);
 list.add(20);
 list.add(30);
 list.add(40);

 list.add(50);
 list.add(60);

 Iterator<Integer> it=list. iterator() ;
 
 while(it.hasNext())
 {
	 System.out.println(it.next());
 }
 
	}

}

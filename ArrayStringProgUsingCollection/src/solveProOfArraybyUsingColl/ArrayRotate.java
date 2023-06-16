package solveProOfArraybyUsingColl;


import java.util.ArrayList;
import java.util.List;



public class ArrayRotate {

	public static void main(String[] args) {

List<Integer> list=new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
System.out.println(list);
System.out.println("--Right side Shift--");
list.add(0,list.remove(list.size()-1));
System.out.println(list);
System.out.println();


System.out.println("--left side Shift--");
list.add((list.size()-1),list.remove(0));
System.out.println(list);
System.out.println();

//System.out.println("3 time right shift");
//for (int i = 0; i < list.size(); i++) {
//	
//
//list.add(0,list.remove(list.size()-1));
//System.out.println(list);
//}
	}

}

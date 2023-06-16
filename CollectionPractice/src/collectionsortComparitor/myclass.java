package collectionsortComparitor;
import java.util.Collections;


import java.util.ArrayList;

import java.util.Collections;



public class myclass {

	public static void main(String[] args) {
		ArrayList<student1> list=new ArrayList<student1>();
		
	list.add(new student1(1,"somu",41));
	list.add(new student1(2,"gomu",41));
	list.add(new student1(3,"omu",40));
	list.add(new student1(4,"namu",41));
	
	
		abcd abcd=new abcd();
		
		Collections.sort(list,abcd);
		 
System.out.println(list);		
		
	
	}

}

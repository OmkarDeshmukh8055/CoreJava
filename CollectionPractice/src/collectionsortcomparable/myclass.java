package collectionsortcomparable;

import java.util.ArrayList;
import java.util.Collections;

public class myclass {

	public static void main(String[] args) {
		ArrayList<student> s=new ArrayList<>();
		s.add(new student(5,"somu"));
		s.add(new student(2,"omu"));
		s.add(new student(1,"gomu"));
		s.add(new student(4,"namu"));
		s.add(new student(3,"ramu"));
		
		Collections.sort(s);
		System.out.println(s);
		
		
	}

}

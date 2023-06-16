package ComparableImplimentation;
import java.util.ArrayList;
import java.util.Collections;

public class myList {

	public static void main(String[] args) 
	{
		ArrayList<Student> l=new ArrayList<>();
		l.add(new Student(1,"om",40.3));	
		l.add(new Student(2,"naru",50.5));	
		l.add(new Student(3,"avi",80.11));	
		l.add(new Student(4,"pavan",90.18));	
		l.add(new Student(5,"akash",35.38));	
		l.add(new Student(6,"gaju",44.85));	
		l.add(new Student(7,"nana",58.88));	
		l.add(new Student(8,"nagu",56.28));	
		l.add(new Student(9,"abhi",35.84));	
		Collections.sort(l);
		System.out.println(l);

	}
	
}

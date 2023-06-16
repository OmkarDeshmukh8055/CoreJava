package Comparator;

import java.util.Comparator;

public class ComparatorImplimentation implements Comparator<Student>{


	public int compare(Student s1, Student s2)
	{
		if(s1.marks<s2.marks)
			return -1;
		if(s1.marks>s2.marks)
			return 1;
		else
		return 0;
	}

}

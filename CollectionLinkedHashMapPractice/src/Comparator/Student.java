package Comparator;

public class Student{

	int rn;
	String name;
	float marks;
	public Student(int rn, String name, float d) {
		super();
		this.rn = rn;
		this.name = name;
		this.marks = d;
	}
	
	public String toString() 
	{
		return "Student [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
	}

		
}

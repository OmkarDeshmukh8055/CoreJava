package ComparableImplimentation;

public class Student implements Comparable<Student> {

	int rn;
	String name;
	Double marks;
	public Student(int rn, String name, Double marks) {
		super();
		this.rn = rn;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) 
	{
		if(marks<s.marks)
		return -1;
		if(marks>s.marks)
			return 1;
			
		else
		return 0;
	}
	
}

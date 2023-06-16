package Comparator;

public class Student{

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
	
}

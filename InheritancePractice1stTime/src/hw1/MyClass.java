package hw1;

public class MyClass {

	public static void main(String[] args) 
	{
		Manager m=new Manager("0m", 22, 327673420, "pune", 22000, "branchMnager", "management");
		Employee e=new Employee("abhi", 35, 39383830, "pune", 10000, "dev", "testing");
		m.DisplaySalary();
		e.DisplaySalary();
	}

}

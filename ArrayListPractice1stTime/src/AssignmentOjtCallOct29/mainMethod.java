package AssignmentOjtCallOct29;

public class mainMethod {

	public static void main(String[] args) {

mymethod<student> s=new mymethod<student>();

s.add(new student(1,"somu",40));
s.add(new student(2,"gomu",40));
s.add(new student(3,"omu",40));
s.add(new student(4,"namu",40));

s.print();
System.out.println("After");
s.remove(2);
s.print();
	}

}

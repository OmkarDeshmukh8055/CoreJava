package AssignmentAddAndRemoveOct29;

public class mainClass {

	public static void main(String[] args) {
mymethod m=new mymethod();
m.add(10);
m.add(20);
m.add(30);
m.add(40);
m.add(50);
m.add(60);
m.print();

System.out.println("after");
m.remove(2);
m.print();
	}

}

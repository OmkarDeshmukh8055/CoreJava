package AssignmentGenricsOct29;

public class mainMethod3 {

	public static void main(String[] args) {

 myMethod <Integer> m=new  myMethod <Integer>();
 
 m.add(20);
 m.add(30);
 m.print();
 System.out.println("After");
 m.remove(1);
 m.print();
	}

}

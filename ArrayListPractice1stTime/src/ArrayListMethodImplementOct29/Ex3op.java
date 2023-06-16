package ArrayListMethodImplementOct29;

public class Ex3op {

	public static void main(String[] args) {

Ex3<Ex3p1> list=new Ex3 <Ex3p1> ();
list.add(new Ex3p1(1,"somu",40));
list.add(new Ex3p1(2,"gomu",50));

list.add(new Ex3p1(3,"omu",60));
list.add(new Ex3p1(4,"golu",50));
list.print();

System.out.println("After remove");
list.remove(2);
list.print();


	}

}

package AssignmentDeadlockChovanSir;

public class my_class {

	public static void main(String[] args) {

Abcd abcd1=new Abcd();
Abcd abcd2=new Abcd();
Thread1 ab1=new Thread1(abcd1,abcd2);
Thread1 ab2=new Thread1 (abcd2,abcd1);

ab1.start();
ab2.start();
}

}

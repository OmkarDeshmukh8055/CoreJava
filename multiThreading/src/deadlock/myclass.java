package deadlock;

public class myclass {

	public static void main(String[] args) throws Exception {

Class1 class1=new Class1();
Class2 class2=new Class2();
Thread1 t1=new Thread1(class1, class2);
Thread2 t2=new Thread2(class1, class2);
t1.start();
t2.start();
	}

}

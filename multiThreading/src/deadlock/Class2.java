package deadlock;

public class Class2 {

public synchronized void method1(Class1 class1)
{
	System.out.println("i am in class2 method1");
	try {Thread.sleep(100);}catch(Exception e){}
	
	//Class1 class1 = new Class1();
	class1.method2();
	

	}
public synchronized void method2()
{
	System.out.println("i am in class2 method2"); 
}
}

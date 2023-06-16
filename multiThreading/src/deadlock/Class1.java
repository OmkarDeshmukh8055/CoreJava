package deadlock;

public class Class1 {

public synchronized void method1 (Class2 class2)
{
	System.out.println(" i am in class method1");
	try {} catch(Exception e) {}
	class2.method2();
}

public synchronized void method2()
{
	System.out.println("i am in class1 method2 "); 
}
}

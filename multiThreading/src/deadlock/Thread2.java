package deadlock;

public class Thread2 extends Thread {
	Class1 class1;
	Class2 class2;
	
	public Thread2(Class1 class1,Class2 class2)
	{
		this.class1=class1;
		this.class2=class2;
	}
public void run()
{
	class2.method1(class1);
}

}

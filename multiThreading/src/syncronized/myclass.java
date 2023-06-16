package syncronized;

public class myclass {

	public static void main (String []args) throws InterruptedException
	{
		thread1 t1=new thread1();
		thread2  t2=new thread2();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		abcd obj=abcd.a;
		System.out.println(obj.i);
	}
}

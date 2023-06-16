package Q2TestPracticeOct28;

public class output {

	public static void main (String []args)
	{
		
thread1 t1=new thread1();
thread2 t2=new thread2();
thread3 t3=new thread3();

Thread T1=new Thread(t1);
Thread T2=new Thread(t2);
Thread T3=new Thread(t3);

T1.start();
T2.start();
T3.start();

	}

}

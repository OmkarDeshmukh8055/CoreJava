package multiThreadingOct27;

public class thread2 extends Thread{

Abcd abcd;

	
public thread2 (Abcd abcd)
{
	this.abcd=abcd;

}
public void run()

{
	for (int i = 0; i < 10000; i++) 
	{
		abcd.add();
	}
}
}

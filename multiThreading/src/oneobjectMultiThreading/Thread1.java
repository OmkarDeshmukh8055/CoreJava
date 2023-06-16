package oneobjectMultiThreading;

public class Thread1 extends Thread{

public void run()
{
	for (int i = 0; i < 100000; i++)
	{
	  Abcd.add();	
	}
	}

}

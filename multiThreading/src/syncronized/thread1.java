package syncronized;

public class thread1 extends Thread {

abcd b=abcd.a;
public void run()
{
	for (int i = 0; i < 1000000; i++) 
	{
		b.add();
	}
	}

}

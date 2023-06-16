package syncronized;

public class thread2  extends Thread{

abcd c=abcd.a;
public void run()
{
	for (int i = 0; i < 1000000; i++) 
	{ 
		 c.add();
	}
	}

}

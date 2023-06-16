package multiThreadingOct26;

import java.util.Iterator;

public class mythread extends Thread {

	
public void run()
{
	for (int i = 0; i < 100; i++)
	{
		try
		{
			Thread.sleep(500);
			System.out.println("hi");

		}catch(Exception e)
		{
			
		}
	}
	}

}

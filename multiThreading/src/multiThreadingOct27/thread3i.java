package multiThreadingOct27;

public class thread3i extends Thread {
public void run()
{
	Abcd abcdkaobjforT1=Abcd.abcdkaobjforT1;
	for (int i = 0; i < 10000; i++) 
	{
		abcdkaobjforT1.add();	
	}
}

}

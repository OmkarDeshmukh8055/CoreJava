package multiThreadingOct26;

public class Q6p1 {


	public void run()
	{
		for (int i = 0; i < 100;i++) {
			
		Thread.yield();  // always print last when both are at a time execute 
		System.out.println("gomu");
		}
	}

}

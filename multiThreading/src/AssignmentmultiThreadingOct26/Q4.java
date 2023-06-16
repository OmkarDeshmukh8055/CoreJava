package AssignmentmultiThreadingOct26;

public class Q4 extends Thread  {
	
	public void run() 
	{
  for (int i = 0; i <200; i++) 
  {
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 System.out.println("hi");
  }
	}

}

package AssignmentmultiThreadingOct26;

public class Q2  implements Runnable {

	public void run()
	{
          for (int i = 0; i < 50; i++) 
          {
			System.out.println("shri");
		 }
	}

} class Q2p1 implements Runnable

{
	public void run ()
	{
		for (int i = 0; i < 50; i++) {
			System.out.println("jai");
		}
	}
}
 class Q2p2 implements Runnable
 {
	 
	 public void run ()
	 {
		 for (int i = 0; i < 50; i++) 
		 {
		  System.out.println("vijuu");	
		}
	 }
 }

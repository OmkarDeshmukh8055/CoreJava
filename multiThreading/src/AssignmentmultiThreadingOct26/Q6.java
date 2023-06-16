package AssignmentmultiThreadingOct26;

public class Q6 extends Thread {

	@Override
	public void run() {
        Thread.yield();
      for (int i = 0; i < 10; i++) {
    	  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	  System.out.println("hii");
		
	}
	


	}

}

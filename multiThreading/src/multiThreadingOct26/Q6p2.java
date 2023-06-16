package multiThreadingOct26;

public class Q6p2 {

	public static void main(String[] args) throws InterruptedException {
		Q3 a=new Q3();
		Q3p1 b=new Q3p1();
		a.start();
	  b.start();
	  
	  // join method is used for hold the main method and execute the main method at the end of all methods
	 a.join();
	 b.join();
	 System.out.println("finally work is done");
	 
	}

}

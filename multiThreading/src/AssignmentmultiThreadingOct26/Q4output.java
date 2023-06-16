package AssignmentmultiThreadingOct26;

public class Q4output {

	public static void main(String[] args) throws InterruptedException {
		
		   Q4 one =new Q4();
            one.start();
   
 for (int i = 0; i < 50; i++) 
 {
	Thread.sleep(1000);
	System.out.println("hello");
}
	}

}

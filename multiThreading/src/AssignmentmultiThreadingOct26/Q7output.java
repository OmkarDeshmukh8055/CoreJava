package AssignmentmultiThreadingOct26;

public class Q7output {

	public static void main(String[] args) throws InterruptedException {
 Q7 a=new Q7();
 Q71 b=new Q71();
 a.start();
 b.start();
  a.join();
   b.join();
   System.out.println();
	  System.out.println("hello brother");

 
	}

}

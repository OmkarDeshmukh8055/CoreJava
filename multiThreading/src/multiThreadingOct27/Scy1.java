package multiThreadingOct27;

public class Scy1 extends Thread{
 static int count;
 
 public  synchronized static void add() 
 {
	 for (int i = 0; i < 10000; i++) {
		
	
 
 count=count+1;
	 }
 }

}

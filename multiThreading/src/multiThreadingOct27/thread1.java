package multiThreadingOct27;

public class thread1  extends Thread{

Abcd abcd;

public thread1(Abcd abcd2) {
 
}
public void thrad1(Abcd abcd)
{
	this.abcd=abcd;

	}
public void run()
{
	for (int i = 0; i < 10000; i++) {
		
			abcd.add();
		}
		
	
}

}

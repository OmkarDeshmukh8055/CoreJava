package Q3TestPracticeOct28;

public class thread1 extends Thread{

public void run()
{
	for (int i = 0; i < 100; i++) {
		System.out.println("dada");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
	
		}
		System.out.println("Sachin ");
	}
}

}

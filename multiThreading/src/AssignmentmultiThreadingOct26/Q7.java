package AssignmentmultiThreadingOct26;

public class Q7 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);

			} catch (Exception e) {

			}
			System.out.println("sachin dada");

		}
	}

}
 class Q71 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);

			} catch (Exception e) {

			}
			System.out.println("vinod dada");

		}
	}

}



package multiThreadingOct27;

public class scy2 extends Thread {

static int counter;

public static void add()
{
	for (int i = 0; i < 100000; i++) {
		
	
	counter=counter+1;
	}
	}

}

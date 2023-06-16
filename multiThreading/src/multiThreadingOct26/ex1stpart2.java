package multiThreadingOct26;

public class ex1stpart2 {

	public static void main(String[] args) {
mythread mythread=new mythread();
mythread.start();
for (int i = 0; i <100; i++)
{
	System.out.println("hello");

	try
	{
		Thread.sleep(500);

	}catch(Exception e)
	{
		
	}
}
	}

}

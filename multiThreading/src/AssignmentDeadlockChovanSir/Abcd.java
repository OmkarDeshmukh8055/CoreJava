package AssignmentDeadlockChovanSir;

public class Abcd {

	public synchronized void m1(Abcd abcd1)
	{
		System.out.println("in m1");
		abcd1.m2();
	}

	public synchronized void m2() 
	{
		System.out.println("in m2");
		
	}

	

}

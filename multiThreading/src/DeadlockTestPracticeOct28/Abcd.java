package DeadlockTestPracticeOct28;

public class Abcd {

public synchronized void m1(Abcd abcd)
{
	System.out.println("in m1");
	abcd.m2();
	
	
	}
public synchronized void m2()
{
	System.out.println("in m2");
}

}

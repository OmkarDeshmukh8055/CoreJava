package AssignmentDeadlockChovanSir;
	
public class Thread1 extends Thread{
Abcd abcd1;
Abcd abcd2;

public Thread1(Abcd abcd1,Abcd abcd2)
{
	 super();
	 this.abcd1=abcd1;
	 this.abcd2=abcd2;
	 
}

public void run()
{
  abcd1.m1(abcd2);
}
public void run1()
{
	abcd2.m1(abcd1);
}

}

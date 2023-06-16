package day8oopsstart;
import java.util.Scanner;
public class diwali {
int basicsalary;
int numOfExp;

public void bonus()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("salary");
	basicsalary=sc.nextInt();
	System.out.println("number of exp");
	numOfExp=sc.nextInt();
	double totalsalary;
	if(numOfExp>5)
		totalsalary=1.35*basicsalary;
	else
		totalsalary=1.15*basicsalary;
	System.out.println(+totalsalary);
	

	
	}

}

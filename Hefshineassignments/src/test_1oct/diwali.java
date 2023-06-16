package test_1oct;
import java.util.Scanner;
public class diwali {

double totalsalary;
int numOfExp;

void emp()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter salary");
	double salary=sc.nextInt();
	System.out.println("enter Exp");
	int noOfExp=sc.nextInt();
	this.totalsalary=salary;
	this.numOfExp=numOfExp;

	if(numOfExp>5)
	{
		totalsalary=salary*1.35;
		System.out.println( "salary "+totalsalary);
	}
		else {
		totalsalary=salary*1.15;	
		System.out.println("salary "+totalsalary);
		
}}
}

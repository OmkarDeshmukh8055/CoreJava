package day8oopsstart;

import java.util.Scanner;

public class hw1 {

int basicsalary;
int exp;
double salary;
public void diwali() 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("salary");
	basicsalary=sc.nextInt();
			 			System.out.println("number of exp.");
			 				 exp=sc.nextInt();
	
			if(5<exp) {
			salary=basicsalary*1.35;
		System.out.println("salary+bonus "+salary);
			}
		else {
			salary=basicsalary*1.15;
		System.out.println("salary+bonus "+salary);
		}
}}
	

/*/public void bonus()
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
	System.out.println(+totalsalary);*/

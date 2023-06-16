package sep25oopsQue;
import java.util.Scanner;
public class diwali{
	Scanner sc=new Scanner(System.in);
	void bonus() {
		System.out.println("enter basicsalary");
		int basicsalary=sc.nextInt();
		System.out.println("enter no of exp");

		int numberOfExp=sc.nextInt();
		double salary;
		
	if	(numberOfExp<=5) {
				
	salary=basicsalary+basicsalary*0.15;
		System.out.println(salary);}
		else {
			salary=basicsalary+basicsalary*0.35;
	System.out.println(salary);
	}}
	}



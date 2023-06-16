package day10sep27;

public class employee {
int bsalary;
String name;
int accountno;
public employee()
{
	this.bsalary=bsalary;
	this.name=name;
	this.accountno=accountno;

	}


public employee(String name,int accountno,int bsalary)
{
this.bsalary=bsalary;
this.name=name;
this.accountno=accountno;

	}

int employee(int salary)
{
	bsalary=bsalary+salary;
	System.out.println(bsalary);
	System.out.println(name+" "+accountno+" "+bsalary);
	return bsalary;
	
}


 void  employeedata()
{
	System.out.println(name+" "+accountno+" "+bsalary);
}
}

package day12;

public class college  {

	String collegename;
	String clgaddress;
	
	staff s=new staff("employeeName="+"gomu"," employeeadd="+"satara");
	
	college(String collegename,	String clgaddress)
	{
		this.collegename=collegename;
		this.clgaddress=clgaddress;
		
	}
	void displayclgDetails()
	{
		System.out.println("clgName="+"clgaddress=");
	}

}

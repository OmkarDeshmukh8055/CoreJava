package testpractice1Oct;

public class departnemnt {

	String deptname;
	String HODName;
	
	departnemnt (String deptname,	String HODName)
	{
		
	}
	boolean departmentdetails()
	{
		this.deptname=deptname;
		this.HODName=HODName;
		System.out.println(deptname+HODName);
		return  departmentdetails() ;
	}

}

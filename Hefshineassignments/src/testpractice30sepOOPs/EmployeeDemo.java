package testpractice30sepOOPs;

public class EmployeeDemo {
	
	
	
	
	protected	String empId ;
		public  String empName;
		private int empSalary;
	 String empDept;
	
	  public void emp (String  empId)
	{
	this.empId=empId;
	System.out.println("empId "+empId);
	}
	  
	  void emp1 (String empName)
	  {
		  this.empName=empName;
		  System.out.println("name "+empName);
	  }
	  
	  private void emp2(int empSalary)
	  {
		  this.empSalary=empSalary;
		  System.out.println("salary"+empSalary);
		  
	  }
	  
	  protected void emp3(String empDept)
	  {
		  this.empDept=empDept;
	  }

}
package hw1;

public class Worker {

		String Sname;
		int Sage;
		int SphoneNo;
		String Saddress;
		int Ssalary;
		
		public Worker(String sname, int sage, int sphoneNo, String saddress, int ssalary) {
			super();
			Sname = sname;
			Sage = sage;
			SphoneNo = sphoneNo;
			Saddress = saddress;
			Ssalary = ssalary;
		}

		public void DisplaySalary()
		{
			System.out.println("Worker [Sname=" + Sname + ", Ssalary=" + Ssalary + "]");
		}
				
}

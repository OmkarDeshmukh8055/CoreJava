package ObjectCreate;

import java.util.Scanner;

public class DiwaliBonus {
	double totalSalary;
	
	public void calculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		int salary=sc.nextInt();

		System.out.println("Enter numOfExp");
		int numOfExp=sc.nextInt();

		if(numOfExp<5)
		{
			totalSalary=salary*1.15;
		} 
		else
			totalSalary=salary*1.35;
		System.out.println("totalSalary with bonus "+totalSalary);

			
	}

	public static void main(String[] args) {
		DiwaliBonus d=new DiwaliBonus();
		d.calculateSalary();

	}

}

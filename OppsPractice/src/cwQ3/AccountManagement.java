package cwQ3;

import java.util.Scanner;

public class AccountManagement {
	Scanner sc=new Scanner(System.in);

	int AccountNo;
	String name;
	int password;
	int accountBalance;
	public void inserData()
	{
		System.out.println("Account Number");
		AccountNo=sc.nextInt();
		System.out.println(" Your name");
		name=sc.next();
		System.out.println("password");
		password=sc.nextInt();
	}
	public void deposit()
	{ 
		System.out.println("Enter deposit Amount");

		int amount=sc.nextInt();
		accountBalance=accountBalance+amount;
		System.out.println("Deposit Successfully "+amount);

		System.out.println(" Total Balance "+accountBalance);
	}
	public void withdrow()
	{ 
		System.out.println("Enter withdrow Amount");
		int amount=sc.nextInt();
		if(amount<accountBalance && amount>0)
		{
		accountBalance=accountBalance-amount;
		System.out.println("withdrow Successfully "+amount);
		System.out.println(" Total Balance "+accountBalance);

		}
		else
			System.out.println("please check your bank balance");
		
	}
	public void display()
	{ 
		
		System.out.println("WELOME IN FROUD BANK"+"\nAccountNo "+AccountNo +"\n name "+name +"\nBalance "+accountBalance);
		
	}
	
	
	
	
}

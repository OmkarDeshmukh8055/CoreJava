package cw6;

import java.util.Scanner;

public class user extends books {
	Scanner sc=new Scanner(System.in);
	public void myAccount()
	{
		System.out.println("Enter ID Num");
		int AccountNo=sc.nextInt();
  int num=200;
		System.out.println("your remaining fee is 200 : ");
		System.out.println("pay remaining Fee");
		
		int amount=sc.nextInt();
		while(num!=amount)
		{
			amount=sc.nextInt();
		}
		System.out.println("WELCOME");

		System.out.println("Account is Unblocked");
		//String name=sc.next();
		
		System.out.println("Enter Book name");
		String Bookname=sc.next();
		System.out.println("Done");
		

	}

	
}

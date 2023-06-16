package ObjectCreate;

import java.util.Scanner;

public class noParameterWithReturn {

	public static void main(String[] args) 
	{
		addition1();
		 System.out.println();
		int num=addition2();
		System.out.println("addition2 "+num);

	}
	
	public static void addition1 ()
	{  
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2 number1");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("addition1 "+c);
	}
	public static int addition2 ()
	{
		int a=10;
		int b=10;
		int c=a+b;
		return c;
	}

}

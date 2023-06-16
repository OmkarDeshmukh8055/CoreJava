package ObjectCreate;

import java.util.Scanner;

public class hwQ2 {
	
	int a;
	int b;
	int result;
	hwQ2(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void add()
	{    
		result=a+b;

		System.out.println("add "+result);
	}
	public void sub()
	{   
		result=a-b;

		System.out.println("sub "+ result);
	}

	public void mul()
	{   
		result=a*b;

		System.out.println("multi "+result);
	}

	public void div()
	{   
		result=a/b;

		System.out.println("div "+result);
	}

	public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		int a=sc.nextInt();
		int b=sc.nextInt();
	hwQ2 cal=new hwQ2(a,b);
	cal.add();
	cal.sub();
	cal.mul();
	cal.div();

	}

}

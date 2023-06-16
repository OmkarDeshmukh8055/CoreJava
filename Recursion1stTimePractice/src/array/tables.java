package array;

import java.util.Scanner;

public class tables {
	static int num=0;
	static int counter=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		num=sc.nextInt();
		System.out.println("table of "+num);

		m1();

	}
	private static void m1() {
		counter++;
		System.out.println(counter*num);

		if(counter<10)
		{
			m1();
		}
		
	}

}

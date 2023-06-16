package ObjectCreate;

import java.util.Scanner;

public class parameterWithReturnAndNoReturn {
	
	public static int addition2 (int a,int b,int c, int d)
	{
		int sum=a+b+c+d;
		return sum;
	}
	
	public static void addition1(int a ,int b)
	{
		int result=a+b;
		System.out.println("addition1 "+result);
	}

	public static void main(String[] args) 
	{           Scanner sc=new Scanner (System.in);
                 System.out.println("enter four num for Additon");
             int sum= addition2(sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt());
             System.out.println("addition2 "+sum);
             
             
             System.out.println();
             
             //first Method
             addition1(10,2);

	}

}

package day8oopsstart;
import java.util.Scanner;
public class qq2 {

int num;
int num1;
int result;

	 
	public void add()
	{
	
		Scanner sc=new Scanner(System.in);
	System.out.println("num");
		num=sc.nextInt();
		System.out.println("num1");
		num1=sc.nextInt();

		result=num+num1;
		System.out.println("add "+result);
	}
	public void sub()
	{
		result=num-num1;
		System.out.println("sub "+result);
	}
	public void mul()
	{
		result=num*num1;
		System.out.println("mul "+result);
	}
	public void div()
	{
		result=num/num1;
		System.out.println("div "+result);
	}

}

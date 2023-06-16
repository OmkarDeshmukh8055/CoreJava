package sep25oopsQue;
import java.util.Scanner;
public class laptop {
Scanner sc=new Scanner(System.in);	
	int num;
	int num2;

	int choice=sc.nextInt();
	public void cal() {
		
	
		for(int i=0;i<6;i++)
		{
			System.out.println("enter option");
		if(choice==5)
			System.out.println();
		
	if(choice==1)
	{
		System.out.println("add"+(num+num2));
	}
	else if(choice==2)
	{
		System.out.println("sub"+(num-num2));
	}
	else if(choice==3)
	{
		System.out.println("mul"+(num*num2));
	}
	else if(choice==4)
	{
	System.out.println("div"+(num/num2));
	}
	else if(choice==5) {
		System.out.println("quit");
	}
		else
			System.out.println("sorry");
	}}}


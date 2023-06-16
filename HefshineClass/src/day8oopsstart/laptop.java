package day8oopsstart;
import java.util.Scanner; 
public class laptop {

laptop()
{
	Scanner sc=new Scanner (System.in);
	
	System.out.println("welcome");
	System.out.println("Enter option");
	int choice=sc.nextInt();
	System.out.println("enter num1");
	int num1=sc.nextInt();
	System.out.println("enter num2");
	int num2=sc.nextInt();

	for (int i = 1; i < 5; i++) {
		
		
	}
	
	if(choice==4)
		System.out.println("quit");
	if(choice==1)
		System.out.println(num1+num2);
	if(choice==2)
		System.out.println(num1-num2);
	if(choice==3)
		System.out.println(num1*num2);
	else
		System.out.println("you enter invalid  option");
}
}

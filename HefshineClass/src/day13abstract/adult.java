package day13abstract;
import java.util.Scanner;
public class adult implements votingApp {
	int age;
	public void adult() {
		
	}
	
public void registeruser()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your age");
	int age=sc.nextInt();

	this.age=age;
	if(age>12)
		System.out.println( "You have  successfully registered under Adult");
	
}



public void votigNumber() {
	
	this.age=age;
	if(age>12)
		System.out.println("your voting id generated within a day");
	else
		System.out.println("oops, you are not");

}


	
}


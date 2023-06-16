package day13abstract;
import java.util.Scanner;
public class kid implements votingApp {
int age;



public void registeruser() {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your age");
	int age=sc.nextInt();

	
	if(age<12)
		System.out.println("successfully registered under kid");
	else
		System.out.println("you have not successfully registered under kid");

}
@Override
public void votigNumber() {
	// TODO Auto-generated method stub
	if(age<12)
		System.out.println("sorry cannot go for vote");

}

}

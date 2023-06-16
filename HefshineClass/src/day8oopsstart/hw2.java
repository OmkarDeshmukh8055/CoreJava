package day8oopsstart;
import java.util.Scanner;
public class hw2 {
int num;
int num1;
int choice;
	public void laptop(){
		System.out.println("welcome");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two value");
		num=sc.nextInt();
		num1=sc.nextInt();
		System.out.println("enter choice 1=add  2=sub  3=mul  4=quit");
		if(choice==1)
		System.out.println("Add"+(num+num1));
		else if(choice==2)
		System.out.println("sub"+(num-num1));
		else if(choice==3)
		System.out.println("mul"+(num*num1));
		if(choice==4)
		System.out.println("quit");
		else
			System.out.println("error");
		


	}

}

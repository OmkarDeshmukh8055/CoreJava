package day3;
import java.util.Scanner;
public class hw9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 value");
		int num=sc.nextInt();
int num2 =sc.nextInt();
System.out.println("enter choice 1-add 2-sub 3-mul 4-div");
int choice=sc.nextInt();

if(choice ==1) 
	System.out.println("addition "+(num+num2));
	

else if(choice==2) 
	System.out.println("sub "+(num-num2));
	

else if(choice==3) 
	System.out.println("mul "+(num*num2));

else if(choice==4) 
	System.out.println("div "+num/num2);


	}

}

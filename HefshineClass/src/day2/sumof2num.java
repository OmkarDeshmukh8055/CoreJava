package day2;

import java.util.Scanner;
public class sumof2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc =new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a =Sc.nextInt();
		
		System.out.println("Enter value of b");
		int b=Sc.nextInt();
		int addition=a+b;
		System.out.println("addition ="+addition);
		
		System.out.println("sub ="+(a-b));
		
		System.out.println("mul ="+(a*b));
		int div=a/b;
		System.out.println("div ="+div);
		int mod=a%b;
		System.out.println("mod ="+mod);
		
		
		

	}

}

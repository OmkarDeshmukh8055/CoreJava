package day2;
import java.util.Scanner;


public class swap {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter value of a =");
		int a=Sc.nextInt();
		
		System.out.println("enter value of b =");
		int b=Sc.nextInt();
		System.out.println(a+" "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println(a+" "+b);
		
		
	}

}

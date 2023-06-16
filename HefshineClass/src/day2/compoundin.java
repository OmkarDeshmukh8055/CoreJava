package day2;
import java.util.Scanner;
public class compoundin {

	public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter value");
 double p=Sc.nextDouble();
 System.out.println("enter rate");
  double r=Sc.nextDouble();
  System.out.println("years");
  double n=Sc.nextDouble();
  System.out.println("elapsed period");
  int t=Sc.nextInt();
  double a= 1+r/n;
  double b=n*t;
  double amount=p*Math.pow(a, b);
  System.out.println("amount = "+amount);
  
	}

}

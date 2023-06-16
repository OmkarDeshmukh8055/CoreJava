package test114sep6q;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("p=");
		 double p=sc.nextDouble();
		   System.out.println("r=");
		       double r=sc.nextDouble();
		
		           System.out.println("n=");
		  double n=sc.nextDouble();
		System.out.println("t=");
		    double t=sc.nextDouble();
		double a =1+r/n;
		   double b =n*t;
	
		
	System.out.println(p*Math.pow(a, b));
		
		
		

	}

}

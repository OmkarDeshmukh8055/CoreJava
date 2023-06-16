package day2;
import java.util.Scanner;
public class varitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter celsius");
		float c =Sc.nextFloat();
		float f=32+c*9/5;
		System.out.println("fahrenheit = "+f);
	
		System.out.println("enter fahrenheit = ");
		float F =Sc.nextFloat();
		float C=(32-f)*5/9;
		System.out.println("celsius = "+C);
		 
		

	}

}

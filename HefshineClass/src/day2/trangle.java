package day2;

import java.util.Scanner;

public class trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the side = "); 
		double side=Sc.nextDouble();
	double area=Math.sqrt(3)/4*side*side;
			
		System.out.println("area of trangle ="+area); 
		Sc.close();
		
	
	}

}

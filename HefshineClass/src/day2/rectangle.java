package day2;
import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner(System.in);
			System.out.println("l = "); 
		double l=Sc.nextDouble();
		System.out.println("w =");
		double w=Sc.nextDouble();
	double area=l*w;
			
		System.out.println("area of rectangle ="+area); 
		double perimeter=2*(l+w);
		System.out.println("perimeter of rectangle ="+perimeter);
	
		

	}

}

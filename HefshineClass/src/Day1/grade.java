package Day1;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("marks");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int c=Sc.nextInt();
		int d=Sc.nextInt();
		int e=Sc.nextInt();
		int f=Sc.nextInt();
	double total=a+b+c+d+e+f;
		System.out.println("total marks  "+total);
		
		double avr=total/6;
		System.out.println("percentage"+avr);
		
		if(avr>=90)
			System.out.println("A grade");
		else if(avr>=80)
			System.out.println("B grade");
		else if(avr>=60)
			System.out.println("C grade");
		else if(avr>=50)
			System.out.println("D grade");
		else if(avr>=35)
			System.out.println("PASS grade");
		else
			System.out.println("Fill");
		
			

	}

}

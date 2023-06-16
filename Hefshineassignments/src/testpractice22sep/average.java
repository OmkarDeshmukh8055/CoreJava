package testpractice22sep;
import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  6 subject marks");
		
		int s1=sc.nextInt();//s1=20,s2=34,s3=43,s4=44,s5=43,s6=90;
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		int s5=sc.nextInt();
		int s6=sc.nextInt();
		
		int total =s1+s2+s3+s4+s5+s6;
		System.out.println(total);
		int avr=total/6;
		System.out.println(avr);
	}

}

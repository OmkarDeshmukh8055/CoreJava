package testpractice22sep;
import java.util.*;
public class salary {
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double grossalary;
		System.out.println("Enter sallery");
		double basicsalary=sc.nextDouble();
		if( basicsalary<=10000) {
			grossalary=basicsalary+basicsalary*0.2+basicsalary*0.8;
		System.out.println(+grossalary);
		
		}
		else if(basicsalary<=20000) {
		grossalary=basicsalary+basicsalary*0.25+basicsalary*0.9;
		System.out.println(+grossalary);
		}
		else if(basicsalary<=30000) {
			grossalary=basicsalary+basicsalary*0.3+basicsalary*0.95;
		
		System.out.println(+grossalary);
		}
		else {
			System.out.println("it is large salary than 30000");
			
	}}

}

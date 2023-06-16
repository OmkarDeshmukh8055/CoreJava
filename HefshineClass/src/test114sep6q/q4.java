package test114sep6q;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter days");
		int days=Sc.nextInt();
		int year=days/365;
		int week=days/365%7;
		int day=days/365%7;
		System.out.println("year ="+year);
		System.out.println("week ="+week);
		System.out.println("day"+day);
		

	}

}

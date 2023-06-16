package day2;
import java.util.Scanner;

public class convert {
	public static void main(String args[]) {
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("enter days");
		 int day=Sc.nextInt();
		 int year=day/365;
		 System.out.println("year= "+year);
		 
		 int week=day/365%7;
		 System.out.println("week=" +week);
		 int  days=day/7;
		 System.out.println("day ="+days);
		 
	}
}

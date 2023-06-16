package day3;

public class hwq7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s1=4;
		int s2=4;
		int s3=4;
		if(s1==s2 && s2==s3 && s3==s1)
		{
			System.out.println("trangle equilateral");
		}
		else if(s1==s2 || s2==s3 || s3==s1)
		{
			System.out.println("trangle isoscelse");
		}
		else {
			System.out.println("trangle scalene");
		}
			
	}

}

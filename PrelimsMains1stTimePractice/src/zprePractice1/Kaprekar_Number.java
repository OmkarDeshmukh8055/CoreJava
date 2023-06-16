package zprePractice1;

public class Kaprekar_Number {

	public static void main(String[] args)
	{
		int num=9;
		int sq=num*num;
		int temp=num;
		int DigitCnt=0;
		int newN=0;
		while(temp>0)
		{
			int r=temp%10;
			newN=newN*10+r;
			temp=temp/10;
			DigitCnt++;			
		}
		int n=(int)Math.pow(10, DigitCnt);
		if((sq%n)+(sq/n)==num)
			System.out.println("yes");
		else
		System.out.println("no");
	}

}

package zprePractice2;

public class Palindrome_Number {

	public static void main(String[] args) {
		int num=121;
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			sum=sum*10+temp%10;
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}

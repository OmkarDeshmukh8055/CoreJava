package zprePractice1;

public class Palindrome_Num {

	public static void main(String[] args) {
		int num=121;
		
		int temp=num;
		int n=0;
		int sum=0;
		while(temp>0)
		{
			sum=sum*10+temp%10;
			temp=temp/10;
	
		}
		System.out.println(sum);
		
		System.out.println(n);
	}

}

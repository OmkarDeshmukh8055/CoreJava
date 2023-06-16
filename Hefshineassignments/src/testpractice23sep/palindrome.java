package testpractice23sep;

public class palindrome {
	public static void main(String[] args)
	{
		int num=1234321;
		int num1=num;
		int num2=0;
	while(num1>0) {
	
		int lastdigit= num1%10;
		num2=num2*2+lastdigit;
		num1=num1/10;
	}
		if(num2==num2)
		System.out.println("palindrome num");
		else
			System.out.println("not");
		
		
		
	}
}

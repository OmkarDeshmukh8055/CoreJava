package PalenHarshadprime;

public class palendromNumber {

	public static void main(String[] args) {

int num=121;
int num1=num;
int rem=0;
int sum=0;
while(num1>0)
{
	rem=num%10;
	sum=sum*10+rem;
	num=num/10;

}
if(num1==sum)
	System.out.println("pal");
else
	System.out.println("not");
	
	}

}

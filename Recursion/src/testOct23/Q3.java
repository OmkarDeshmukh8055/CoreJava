package testOct23;

public class Q3 {

	public static void main(String[] args) {
int num=12;
int num1=num;

int count=0;
while(num1>0)
{
	count++;
	num1=num1/10;
	
}
int a=num*num;

int d=(int)Math.pow(10, num1);
int firstp=num/10;
int secoundp=num%10;
if(firstp+secoundp==num )
	System.out.println("kaprekar no");
	else
		System.out.println("not");

	}

}

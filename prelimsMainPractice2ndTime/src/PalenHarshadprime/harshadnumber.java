package PalenHarshadprime;

public class harshadnumber {

	public static void main(String[] args) {

int num=171;
int num1=num;
int sum=0;
int rem=0;
while(num>0)
{
rem=num%10;
	sum=sum+rem;
	num=num/10;
}
if(num1%sum==0)
	System.out.println("harshad number");
else
	System.out.println(" not");


	}

}

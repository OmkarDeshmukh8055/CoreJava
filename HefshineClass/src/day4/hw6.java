package day4;

public class hw6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123456;
int num1=num;
int sum=0;

while(num>0)
{
	sum=sum+num%10;
	num=num/10;
}
System.out.println(sum);

int num3=1234;
int num4=num3;
int sum1=0;
while(num3>0)
{
	sum1=sum1+num3%10;
	num3=num3/10;
	
}
System.out.println(sum1);

int num5=1234567;
int num6=num5;
int sum2=0;
while(num5>0)
{
	sum2=sum2+num5%10;
	num5=num5/10;}
	System.out.println(sum2);
	
}


	}



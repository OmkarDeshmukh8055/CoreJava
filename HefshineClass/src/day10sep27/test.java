package day10sep27;

public class test {
int num;
int fact=5;
int sum;

public test(int num)	
{
this.num=num;

if(num%2==0) 
	System.out.println("even");
else
	System.out.println("odd");

}

public void test(long b)
{
	int i=1;
	
	do 
	{
	fact=fact*i;
	i++;
	
	}while(i<5);
	System.out.println(fact);
	
	}
	public test(int a, int b)
	{
	sum=a+b;
	System.out.println(sum);
}
}


package zprePractice1;

public class Fibonacci_Series {

	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int endPoint=10;
		for (int i = 0; i <=endPoint; i++) 
		{
			int Fibonacci=a+b;
			a=b;
			b=Fibonacci;
			System.out.println(Fibonacci);
		}
	}

}

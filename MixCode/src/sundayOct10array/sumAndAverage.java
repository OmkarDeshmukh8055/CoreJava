package sundayOct10array;

public class sumAndAverage 
{

	public static void main(String[] args) 
	{
		int a[]= {78,78,78,80,80,80,78};
		
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=a[i]+sum;
		}
		System.out.println("sum "+sum);
		System.out.println("average "+sum/7);
		
	

	}

}

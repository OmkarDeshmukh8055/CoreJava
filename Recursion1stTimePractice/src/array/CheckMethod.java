package array;

public class CheckMethod {
		static int i=0;
		static int []a= {1,2,3};
		static int []b= {1,2,3};
		static int diffCnt= 0;

	public static void main(String[] args)
	{
		check();
		if(a.length==b.length)
		{
		if(diffCnt==0)
			System.out.println("same");
		else
			System.out.println("not same");
		}
		else
			System.out.println("not same");
	}

	private static void check()
	{
		if(i<a.length)
		{
			if(a[i]!=b[i])
			{
				diffCnt++;
			}
			i++;
			check();
		}
		
		
	}

}

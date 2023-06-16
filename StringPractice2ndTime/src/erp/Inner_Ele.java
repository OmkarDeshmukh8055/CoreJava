package erp;

public class Inner_Ele {

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a= {
				{1,2,3,4},
				{5,6,7,8},
				{9,4,2,5},
				{7,2,4,9}
		};
		myCode(a);
	}
	//EndOfMainMethod

	private static void myCode(int[][] a) 
	{
		//WriteCode Here
		int sum=0,c=0;
		for (int i = 1; i < a.length-1; i++)
		{
			for (int j = 1; j < a.length-1; j++)
			{
				sum=sum+a[i][j];
				c++;
			}
		}
		int av=sum/c;
		System.out.println(sum);
		System.out.println(av);
		
	}
}

package testPracticeOct19;



public class hwQ1 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int i = 0;

		print(a, i);
	}

	private static void print(int[] a, int i) 
	{

		if (a.length > i)
		{
			System.out.println(a[i]+" "+i);
			print(a,i+1);
		}
		
		}
	
}

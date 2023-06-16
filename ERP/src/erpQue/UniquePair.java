package erpQue;

public class UniquePair {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,};
		uniquePair(a,0);
//		for (int i = 0; i < a.length; i++)
//		{
//			for (int j =i+1; j < a.length; j++)
//			{
//				System.out.println(a[i]+" "+a[j]);
//			}
//		}
	}

	private static void uniquePair(int[] a, int i) 
	{
		if(i<a.length)
		{
			 int j=i+1;
			Jloop(a,i,j);
			uniquePair(a, i+1);
		}
		
	}

	private static void Jloop(int[] a, int i, int j)
	{
		if(j<a.length)
		{
			System.out.println(a[i]+" "+a[j]);
			Jloop(a, i, j+1);
		}
		
	}

}

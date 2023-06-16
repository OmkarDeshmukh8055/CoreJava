package erpQue;

public class UniquePairTriplate {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55};
		uniquePair(a,0);
//		for (int i = 0; i < a.length; i++)
//		{
//			for (int j =i+1; j < a.length; j++)
//			{
//				for (int k = j+1; k < a.length; k++) 
//				{
//					System.out.println(a[i]+" "+a[j]+" "+a[k]);
//
//				}
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
			
		int k=j+1;
		Kloop(a,i,j,k);
			Jloop(a, i, j+1);
		}
		
	}
	private static void Kloop(int[] a, int i, int j, int k) 
	{
		if(k<a.length)
		{
			System.out.println(a[i]+" "+a[j]+" "+a[k]);
			Kloop(a, i, j, k+1);
		}
	}

}

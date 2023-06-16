package erpQue;

public class UniqueTriplateAddition {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55};
		uniquePair(a,0);
//		for (int i = 0; i < a.length; i++)
//		{
//			for (int j =0; j < a.length; j++)
//			{
//				for (int k =0; k < a.length; k++) 
//				{
//					if(a[i]+a[j]+a[k]<50)
//					{
//					System.out.println(a[i]+" "+a[j]+" "+a[k]);
//					}
//
//				}
//			}
//		}
	}

	private static void uniquePair(int[] a, int i) 
	{
		if(i<a.length)
		{
			 int j=0;
			Jloop(a,i,j);
			uniquePair(a, i+1);
		}
		
	}

	private static void Jloop(int[] a, int i, int j)
	{
		if(j<a.length)
		{
			
		int k=0;
		Kloop(a,i,j,k);
			Jloop(a, i, j+1);
		}
		
	}
	private static void Kloop(int[] a, int i, int j, int k) 
	{
		if(k<a.length)
		{
			if(a[i]+a[j]+a[k]<50)
			{
			System.out.println(a[i]+" "+a[j]+" "+a[k]);
			}
			Kloop(a, i, j, k+1);
		}
	}

}

package erp;

public class lest_Of_Sub{

		//StartOfMainMethod
		public static void main(String[] args) 
		{
			int[] a= {3,7,90,20,5,50,40};
			int k=3;
			myCode(a,k);
		}
		//EndOfMainMethod

		private static void myCode(int[] a,int k) 
		{
			//WriteCode Here
			int sum=0,ii=0;
			int min=Integer.MAX_VALUE;
			for (int i = 0; i < a.length-k; i++)
			{
			for (int j = i; j <i+k; j++) 
			{
				sum=sum+a[i]+a[j];
			}	
			int av=sum/k;
			if(av<min)
			{
				min=av;
				ii=i;
			}
			}
			System.out.println(min);
			System.out.println(ii);
		}
	}

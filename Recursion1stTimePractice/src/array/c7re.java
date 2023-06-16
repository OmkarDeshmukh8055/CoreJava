package array;

import java.util.Arrays;

public class c7re {
		static int a[]= {1,2,2};
		static int cnt=0;

		public static void main(String[] args)
		{
			
			loopI(0);
		
			int b[]=new int [a.length-cnt];
			int index=0;
			loopK(b,index,0);
			
		System.out.println(Arrays.toString(b));
		print(b,0);
			
//			for (int l = 0; l < a.length; l++)
//			{
//				for (int j =0; j < a.length; j++) 
//				{	
//					System.out.println(a[l]+" "+a[j]);
//				}
//			}
	}

		private static void print(int[] b, int i)
		{
			if(i<b.length)
			{
				printJ(b,i,0);
				print(b,i+1);
			}
		}

		private static void printJ(int[] b, int i, int j)
		{
			if(j<b.length)
			{
				System.out.println(b[i]+" "+b[j]);
				printJ(b,i,j+1);
			}
		}

		private static void loopK(int[] b, int k, int index)
		{
			if(k<a.length)
			{
				boolean noDup=true;
				int j = k+1;
				noDup=loopJ(j,k,a,noDup);
				
				if(noDup)
				{
					b[index++]=a[k];
				}
			loopK(b, k+1, index);
			}
		}

	
		private static boolean loopJ(int j, int k, int[] a2, boolean noDup)
		{
			if(j<a.length)
			{
				if(a[j]==a[k])
				{
					noDup=false;
					return noDup;
				}
				return loopJ(j+1, k, a2, noDup);
			}
			else
			return noDup;
		}

		private static void loopI(int i)
		{
			if(i<a.length)
			{
				for (int j = i+1; j < a.length; j++)
				{
					if(a[i]==a[j])
					{
						cnt++;
						break;
					}
				}
				loopI(i+1);
			}
		}

}

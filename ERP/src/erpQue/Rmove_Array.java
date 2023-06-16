package erpQue;

public class Rmove_Array {
	//StartOfMainMethod
		public static void main(String[] args) 
		{
			int[] a = 
			{
				1,1,1,1,1,2,2,3,4,4,4
			}
			;
			int[] b= 
			{
				1,2,4
			}
			;
			myCode(a,b);
		}
		//EndOfMainMethod
		private static void myCode(int[] a,int[] b) 	
		{
			//WriteCode Here
			int rank=0;
			for(int i=0;i<a.length;i++)
			{
				int cnt=0;
				 for(int j=i;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						cnt++;
					}
				}
			
				int p=0;
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						p++;
					}
				}
				if(cnt>2 && p>0||p==0)
				{
					rank++;
				}
			}
			int c[]=new int[rank];
			int index=0;
			for(int i=0;i<a.length;i++)
			{
				int cnt=0;
				for(int j=i;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						cnt++;
					}
				}
			}
		}
	}


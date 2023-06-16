package ArraypracticeOCT7;

public class saddleprogram
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a=
		{
			{
				6,3,9
			}
			,
			{
				9,7,8
			}
			,
			{
				2,4,5
			}
			,
		}
		;
		sidal(a);
	}
	//EndOfMainMethod
	private static void sidal(int[][] a) 
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int small=0;
				int large=0;
				for(int k=0;k<a.length;k++)
				{
					for(int l=0;l<a.length;l++)
					{
						if(k==i)
						{
							if(a[k][l]<a[i][j])
							small++;
						}
						if(l==j)
						{
							if(a[k][l]>a[i][j])
							large++;
						}
					}
				}
				if(small==0&& large==0)
				{
					System.out.println(a[i][j]+" ");
					cnt++;
				}
			}
		}
if(cnt==0)
System.out.print("no saddle point");
	}
}

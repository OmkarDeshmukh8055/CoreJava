package erpQue;

public class HI 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,2,3
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
		}
		int b[]=new int [a.length-cnt];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt1=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt1++;
				}
			}
			if(cnt1==0)
			b[index++]=a[i];
		}
for(int i=0;i<b.length;i++)
{
	for (int j = i+1; j < b.length; j++) {
		System.out.println(b[i]+" "+b[j]);

	}
}
	}
}

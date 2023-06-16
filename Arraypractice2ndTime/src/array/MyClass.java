package array;



public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,3,5,6,2,3,4,5,97,1,23,
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
				{
					cnt++;
					break;
				}
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
				cnt1++;
			}
			if(cnt1==0)
			b[index++]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
			for (int j =i+1; j < b.length; j++) 
			{
				if(b[i]>b[j])
				{
					int tem=b[i];
					b[i]=b[j];
					b[j]=tem;
	
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}

package erpQue;


	public class oddEven {
	     //StartOfMainMethod
		public static void main(String[] args) {
			int[] a={1,2,3,4,5,6,7,8};
			int index=0;
			int[] b=new int[a.length];
			 evenodd(a,index,b);
		}//EndOfMainMethod

		private static void evenodd(int[] a, int index, int[] b) {
			
	       //code here

	for(int i=0;i<a.length;i++)
	{
	for(int j=i+1;j<a.length;j++)
	{
	if(a[i]%2==0)
	{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	break;
	}
	}
	}
	for (int i = 0; i < b.length; i++)
	{
	b[i]=a[i];
	}
	for(int i=b.length-1;i>=0;i--)
	{
	System.out.println(b[i]);
	}
		
		}
	}

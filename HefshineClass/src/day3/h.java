package day3;

public class h 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		char[] a= 
		{
			'a','b','c','d','e','f','g'
		}
		;
		char[] b= 
		{
			'w','x','y','z'
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(char[] a,char[] b) 
	{
		//WriteCode Here
		char [] c= new char[a.length+b.length];
		int index=0;
		for(int i=0; i<c.length; i++)
		{
			if(i<a.length)
			{
				c[index]=a[i];
				index++;
			}
			if(i<b.length)
			{
				c[index]=b[i];
				index++;
			}
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
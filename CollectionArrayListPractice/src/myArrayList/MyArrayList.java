package myArrayList;

public class MyArrayList {

	int a[]=new int [4];
	int index=0;
	public void add(int num)
	{
		if(index<a.length)
			a[index++]=num;
		else
		{
			int size=(int)(1.5*a.length);
			int b[]=new int [size];
			
			for (int i = 0; i < a.length; i++)
			{
				b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		}
	}
		
	public int[] toArray()
	{
		int b[]=new int [index];
		for (int i = 0; i < index; i++)
		{
			b[i]=a[i];
		}
		return b;
		
	}
	public void remove(int i)
	{
		if(i>=0)
		{
			if(i<index)
			{
				for (; i+1< a.length; i++) 
				{
					a[i]=a[i+1];
				}
				index--;
			}
		}
	}
	public int lastIndexOf(int num)
	{
		for (int i =index-1;i>=0; i--)
		{
			if(num==a[i])
				return i;
		}
		return -1;
	}
	public int  indexOf(int num)
	{
		for (int i = 0; i < index; i++)
		{
			if(num==a[i])
			return i;
		}
		return -1;
	}
	public int size()
	{
		return index;
	}
	public boolean contains(int num)
	{
		for (int i = 0; i < index; i++) 
		{
			if(a[i]==num)
				return true;
		}
		return false;
	}
	public String toString()
	{
		String s="[";
		for (int i = 0; i <index; i++) 
		{
			s=s+a[i];
			if(i+1!=index)
			{
				s=s+",";
			}
		}
		s=s+"]";
		return s;
	}
}

package jan3;

public class MyArrayList {
	int[] a;
	int index=0;
	
	public MyArrayList()
	{
		a=new int[3];
	}
	public MyArrayList(int size)
	{
		a=new int[size];
	}
	public void add(int num)
	{
		if(index==a.length)
		{
			int b[]=new int[(int) (1.75*a.length)];
			for (int i = 0; i < a.length; i++)
			{
				b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		}
			else
			{
				a[index++]=num;
			}
	}
	public void remove(int i)
	{
		if(i>=0)
		{
			if(i<index)
			{
				for (; i+1<index; i++)
				{
					a[i]=a[i+1];
					
				}
				index--;
				
			}
		}
		else
			throw new ArrayIndexOutOfBoundsException("it's me");
	}
void print()
{
	for (int i = 0; i < index; i++) 
	{
		System.out.print(a[i]+" ");
	}
}
int mySize()
{
	return index;
}
boolean contians(int num)
{
	for (int i = 0; i <index; i++)
	{
		if(a[i]==num)
			return true;
	}
	return false;
}
	
int indexOf(int num)
{
	for (int i = 0; i <index; i++)
	{
		if(a[i]==num)
			return i;
	}
	return -1;
}
int latIndexOf(int num)
{
	for (int i = index-1;i>=0; i++)
	{
		if(a[i]==num)
			return i;
	}
	return -1;
}
	
void set(int i,int num)
{
	for (int j = 0; j < index; j++)
	{
		if(i==j)
			a[i]=num;
	}
}
	int get(int i)
	{
		for (int j = 0; j<index; j++)
		{
		if(i==j)
			return a[i];
		}
	return -1;
}
	void addWithIndex(int i,int num)
	{
		if(index==a.length)
		{
			int b[]=new int[(int) (1.75*a.length)];
			for (int j = 0; j < a.length; j++)
			{
				b[j]=a[j];
			}
			a=b;
		}
			else
			{
				for (int j=index;j>=i+1; j--)
				{
					a[j]=a[j-1];
				}
				a[i]=num;
				index++;
			}
	}
	public static void main (String[]args)
	{
		MyArrayList list=new MyArrayList(5);
	//	System.out.println("Enter Array Size");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		//list.add(10);
		
		//list.set(0, 100);
	//	list.addWithIndex(2, 100);
	//	list.print();
		System.out.println();
		list.addWithIndex(3, 200);
		list.print();

		//System.out.println(list.mySize());
//		System.out.println(list.get(4));
//
//		System.out.println(list.contians(10));
//		System.out.println(list.indexOf(10));
//		System.out.println(list.latIndexOf(10));
//		list.remove(7);


	}
}

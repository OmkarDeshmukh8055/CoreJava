package ArrayListNov8;

public class Ex1 {

private int a[]=new int [5];

int index=0;

public void add(int num)
{
	if(index>=a.length)
	{
		int b[]=new int [2*a.length];
		{
			for(int i=0;i<a.length;i++)
			
			b[i]=a[i];
		}
		a=b;
	}
	a[index++]=num;
}
public void remove(int i)
{
	if(i<index)
	{
		for (int j = i; j <index-1; j++) 
		{
				a[j]=a[j+1];
		}
		index--;
	}
}
	public void print()
	{
		for (int i = 0; i < index; i++)
		{ 
			System.out.println(a[i]);
		}
	}

}

package toStringMethodOct29;

public class Ex3<E> {
	
	// remove 

private E []a= (E[]) new Object[5];
int index=0;

public void add(E num)
{
	if(index>=a.length)
	{
		E[]b=(E[])new Object[2*a.length];
		for (int i = 0; i < a.length; i++)
		{
		b[i]=a[i];	
		}
		a=b;
	}
	a[index++]=num;
}
public  String toString()
{
	String s="";

		for (int j = 0; j < index-1; j++)
		{
			s=s+a[j]+" ";
		}
   return s;
	}

public void print()
{
	for (int i = 0; i < index; i++)
	{
	   System.out.println(a[i]);	
	}
}

}

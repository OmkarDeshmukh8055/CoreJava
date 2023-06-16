package toStringObjOct29;

public class abcd<E> {
	
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
	for (int j = 0; j < index; j++)
		{
			s=s+a[j]+" ";
		}

		return s;
	}
public void remove(int i)
{
	for (int k= i; k < index-1; k++)
	{
	  a[k]=a[k+1];	
	}
}

}

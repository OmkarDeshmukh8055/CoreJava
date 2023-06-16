package ArrayListMethodImplementOct29;

public class Ex1 {
	
	// how to increase size of array for this example

private int []a=new int[5];
int index=0;

public void add(int num)
{
	if(index>=a.length)
	{
		int[]b=new int[2*a.length];
		for (int i = 0; i < a.length; i++)
		{
		b[i]=a[i];	
		}
		a=b;
	}
	a[index++]=num;
}
public void print()
{
	for (int i = 0; i < a.length; i++)
	{
	   System.out.println(a[i]);	
	}
}

}

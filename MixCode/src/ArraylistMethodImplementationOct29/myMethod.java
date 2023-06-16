package ArraylistMethodImplementationOct29;

public class myMethod {

	int a[] = new int[8];
	int index = 0;

	public void add(int num) 
	{
		if (index >= 0)
		{ int b[]=new int[a.length*2];
			for (int i = 0; i < index; i++) 
			{
				b[i]=a[i];
			}
			a=b;
		}
      a[index++]=num;
	}
	
	public void remove(int j)
	{ { if(j<index)
	{
		for (int i = j; i < index-1; i++) 
		
		{
			a[i]=a[i+1];
		}
		}
		index--;
	}
	}
	public boolean contain(int num)
	{  
		for (int i = 0; i < index; i++) {
		if(a[i]==num)
		{
		return true;
		}
		}
		return false;
		
	}
	public void empty()
	{
		for (int i = 0; i < index; i++) {
		if(a[i]==0)
		{
			System.out.println("empty");
		}
		else
			System.out.println("not empty");
		}
 	}
	
	public void print()
	{
		for (int i = 0; i < index; i++) {
			
			System.out.println(a[i]);
		}
	}

}

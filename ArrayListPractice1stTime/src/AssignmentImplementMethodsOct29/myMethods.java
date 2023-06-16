package AssignmentImplementMethodsOct29;

public class myMethods <E>{

	private E[] a = (E[]) new Object[5];

	int index;

	public void add(E num)
	{

		if (index >= a.length)
		{
			E[] b = (E[]) new Object[a.length * 2];
			for (int j = 0; j < a.length; j++)
			{
				b[j] = a[j];

			}
			a=b;
		}
		a[index++]=num;
	}
	
	public void remove(int j)
	{
		if(j<index)
		{
		for (int i = j; i < index-1; i++) {
			a[j]=a[j+1];
		}
		index--;
		}
	}
	public boolean contain(E num)
	{
		for (int i = 0; i < index; i++) {
			if(a[i]==num)
			{
				return true;
			}
		}
		return false;
	}
	public int get(int i)
	{
		if(i<index)
		{
			for (int j = 0; j < a.length; j++) {
				if(i==j)
				{
					return(int)a[j];
				}
			}
			return 0;
		}
		return 0;

	}
	public int Indexof(E num)
	{
		for (int i = 0; i < index; i++) {
			
		if(a[i]==num)
		{
		return i;
		}
		}
		return 0;
	}
	public int lastindexof(E num)
	{
		for (int i = index;i>=0; i--) {
			
		if(a[i]==num)
		{
		return i;
		}
		}
		return 0;
	}
	public boolean empty()
	{
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=" ")
			{
				return false;
			}
		}
		return true;
		
	}
	public int size()
	{
		int num=0;
		for (int i = 0; i < index; i++) {
			num++;
		}
		return num;
	}
	public String clear()
	{
for (int i = 0; i < index; i++) {
	a[i]=null;
}
return "[]";
	}
	
		public void print()
		{
			for (int i = 0; i < index; i++)
			{
				System.out.println(a[i]);
			}
	    }
}

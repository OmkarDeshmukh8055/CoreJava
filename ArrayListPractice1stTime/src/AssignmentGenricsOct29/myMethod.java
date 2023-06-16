package AssignmentGenricsOct29;

public class myMethod<E> {

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
		public void print()
		{
			for (int i = 0; i < index; i++)
			{
				System.out.println(a[i]);
			}
	    }
}

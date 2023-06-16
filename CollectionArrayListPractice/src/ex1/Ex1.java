package ex1;

public class Ex1 {
	int a[] = new int[5];
	int index = 0;

	public  void add(int num)
	{
		if(index<a.length)
		a[index++]=num;
		else
		{
			int size = (int)(a.length*1.5);
			int b[]=new int[size];
				for (int i = 0; i < a.length; i++) 
				{
					b[i]=a[i];
				}
			
				a=b;
				a[index++]=num;
			
		  }
	    }

public void print()
{
	for (int i = 0; i <index; i++) 
	{
		System.out.println(a[i]);
	}
	System.out.println();
}

}

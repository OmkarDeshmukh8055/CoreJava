package array;

public class C9 {
	static int a[]=new int [5];
	static int index=0;
	public static void main(String[] args)
	{
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		System.out.println(pop());
		System.out.println(pop());

	}
	private static void print()
	{
			for (int i = 0; i < a.length; i++)
			{
				System.out.println(a[i]);
			}
	}
	private static int pop()
	{
		if(index==0)
		{
			System.out.println("empty");
		return 0;
		}
		else
		{
		int temp=a[0];
		for (int i = 1; i < a.length; i++)
		{
			a[i-1]=a[i];
		}
		index--;
		return temp;
		}
	}


	
	private static void add(int num)
	{
		if(index<a.length)
		{
			a[index++]=num;
		}
		else
			System.out.println("Queue is full");
	}

}

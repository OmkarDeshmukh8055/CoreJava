package array;

public class C8 {
	static int a[]=new int[5];
	static int index=0;
		
	private static void print()
	{
		
		for (int i = 0; i < index; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
	public static int pop()
	{
		if(index==0)
		{
			System.out.println("stack is empty");
			return 0;
		}
		else if(index>0)
		{
		index--;
		return a[index];
		}
		return index;
		
		
	}
	public static void add(int num)
	{	
		if(index<a.length)
			a[index++]=num;
		else
			System.out.println("stack is full");
		
	}
	public static void main(String[] args)
	{
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		System.out.println("remove "+pop());
		System.out.println("remove "+pop());
		System.out.println("remove "+pop());
		System.out.println("remove "+pop());
		System.out.println("remove "+pop());
		System.out.println("remove "+pop());
		System.out.println("remove "+pop());

		print();

	}
	
		

}

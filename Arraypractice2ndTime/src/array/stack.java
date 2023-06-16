package array;


public class stack {
	static int a[]=new int [5];
	static int index=0;

	public static void main(String[] args) {

push(10);
push(20);
push(30);
push(40);
push(50);

print();
System.out.println(pop());
System.out.println(pop());
System.out.println();
push(100);
print();


	}
	
	public static void push(int num)
	{
		if(index<a.length)
		{
			 a[index++]=num;
		}
		else
			System.out.println("stack is full");
	}

	public static void print()
	{
		for (int i = 0; i < index; i++) 
		{
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
	
	public static int pop()
	{
		if(index==0)
		{
			System.out.println("stack is empty");
		return 0;
		}
		else
		{
			index--;
      return a[index];
		}
	}

}

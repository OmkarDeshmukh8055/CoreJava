package zprePractice5;

public class Stack {
	
	static int a[]=new int[5];
	static int index=0;
	static void push(int num)
	{
		if(index<a.length)
		a[index++]=num;
		else
		{
			int b[]=new int[(int)2.75*a.length];
			int index1=0;
			for (int i = 0; i < a.length; i++)
			{
				b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		}
	}
	static int pop()
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
		
//		int tmp=a[index-1];
//		index--;
//		return a[index-1];
	}
//	static void print()
//	{
//		if(index<a.length)
//		{
//			for (int i = 0; i <index; i++)
//			{
//				System.out.println(a[i]);
//			}
//		}
//			
// }
	public static void main(String[] args) 
	{
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		Stack.push(40);
		Stack.push(50);
		Stack.push(60);
		Stack.push(70);
		Stack.push(80);
		Stack.push(90);
		Stack.push(100);
		Stack.push(110);
		Stack.push(120);
		Stack.push(130);
//		Stack.pop();
//		Stack.pop();
//		Stack.pop();
		System.out.println(Stack.pop());

		
	}

}

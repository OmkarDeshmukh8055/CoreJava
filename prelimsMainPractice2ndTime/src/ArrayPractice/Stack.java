package ArrayPractice;

public class Stack {
	
	static int a[]=new int[5];
	static int index=0;
	
	public static void push (int num)
	{
		if(index<a.length)
		{
			for (int i = 0; i < a.length; i++) 
			{
				a[i]=num;
			}
			index++;
		}
			else
				throw new ArrayIndexOutOfBoundsException("stack is full");
	}
	
	
	public static int pop() 
	{
	int num=a.length-1;
	
	  if(index>0)
	  {
		  for(int i=a.length-1;i>=0;i++)
		  {
			  a[i-1]=a[i];
		  }
		index--;
	  }
	  return num;
	
	}

	public static void main(String[] args) 
	{
      push(10);
      push(20);
      push(30);
      push(40);

       System.out.println(pop());
	}

}

package AssignmenttoStringOct29;

import java.util.Arrays;

public class myMethod <E> {
int index=0;
private E[]a=(E[])new Object[5];
	public void add(E num)
	{
	 if(index>=a.length)
	 {
		 E b[]=(E[])new Object[2*a.length];
		 for (int i = 0; i < a.length; i++)
		 {
			 
			 b[i]=a[i];
		 
		 }
		 a=b;
	 }
	 a[index++]=num;
	 }
	
	public String toString()
	{
		String s="";
		
		for (int j = 0; j < a.length; j++)
		{
			s=s+a[j]+" ";		
		}
		return s;
	}
	public void remove(int i)
	{
	 if(i<a.length)
	 {
		 E b[]=(E[])new Object[2*a.length];
		 for (int j=i; j < index; j++)
		 {
			 
			 b[i]=a[i+1];
		 
		 }
		 index--;
	 }
	 	 }

	
	
	 public void print()
	 {
for (int i = 0; i < index-1; i++) 
{
	System.out.println(a[i]);
}		 
	 }

}

package ex2Genrics;


public class Ex1 <p>{
	 p [] a= (p[])new  Object[5];
	int index = 0;

	public  void add(p num)
	{
		if(index<a.length)
		a[index++]= num;
		else
		{
			int size = (int)(a.length*1.5);
			p[] b=(p[])new Object[size];
			
				for (int i = 0; i < a.length; i++) 
				{
					b[i]=a[i];
				}
			
				a=b;
				a[index++]= num;
			
		  }
	    }
	
	public void remove(int i)
	{
		if(i>=0)
		{
			if(i<index)
			{
				for (; i+1< a.length; i++)
				{
					a[i]=a[i+1];
					
				}
				index--;
				
			}
		}
	}

		int size()
		{
			return index;
		}
		
		int lastIndexOf(p data)
		{
			for (int i = index-1;i>=0; i--) 
			{
				if(a[i]==data)
					return i;
			}
			return -1;
			
		}
		int indexOf(p data)
		{
			for (int i = 0; i <index; i++) 
			{
				if(a[i]==data)
					return i;
			}
			return -1;
		}
		boolean contains(p data)
		{

			for (int i = 0; i <index; i++) 
			{
				if(a[i]==data)
					return true;
			}
				return false;
		}
		public String toString()
		{
			String s="[";

			for (int i = 0; i < index; i++)
			{
				s=s+a[i];
				if(i+1!=index)
				{
					s=s+ ", ";
				}
			}
			s=s+"] ";
			return s;
			
		}
		
		p[] toArray()
		{
			p[] b=(p[])new Object[index];
			for (int i = 0; i < index; i++)
			{
				b[i]=a[i];
			}
			return b;
		}
		p get(int i)
		{
			return a[i];
		}
}

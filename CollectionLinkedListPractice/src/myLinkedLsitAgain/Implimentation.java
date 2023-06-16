package myLinkedLsitAgain;

public class Implimentation<p> {

	Node<p> root;
	
	public void add(p data)
	{
		Node<p> obj=new  Node<p>(data);
		if(root==null)
			root=obj;
		else
		{
			Node<p> temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=obj;
		}
	}
	
	public void AddWithIndex(int i ,p data)
	{
		Node<p> temp=root;
		
		if(i==0)
		{
			Node<p> obj=new Node<p>(data);
			obj.next=root;
			root=obj;
			return;
		}
			int index=0;
		while(temp!=null)
		{
			if(index==i-1)
			{
				Node<p> obj=new Node<p>(data);
				obj.next=temp.next;
				temp.next=obj;
				return;
			}
			temp=temp.next;
			index++;
		}
		}
	
	int size()
	{
		Node<p> temp=root;
		int size=0;
		while(temp!=null)
		{
			temp=temp.next;
			size++;
		}
		return size;
		
	}
	
	void set(int i,p data)
	{
		Node temp=root;
		int index=0;
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		
		while(temp!=null)
		{
			if(index==i)
			{
				temp.data=data;
				return;
			}
			temp=temp.next;
			index++;
		}
		throw new ArrayIndexOutOfBoundsException();


	
	}

	p get(int i)
	{
		Node temp=root;
		int index=0;
		while(temp!=null)
		{
			if(index==i)
				return (p) temp.data;
			temp=temp.next;
			index++;
		}
		return (p) temp.data;
	}
	void remove(int i)
	{
		
		Node temp=root;
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		if(i==0)
		{
			root=temp.next;
		}
		int index=0;
		while(temp!=null)
		{
			if(index==i-1)
				temp.next=temp.next.next;
			temp=temp.next;
			index++;
		}			throw new ArrayIndexOutOfBoundsException();

		
	}
	Object[] toArray()
	{
		Node temp=root;
		Object [] a=new Object [size()];
		int index=0;
		while(temp!=null)
		{
			a[index++]=temp.data;
			temp=temp.next;
			
		}
		return a;
		
	}
	int lastIndexOf(p data)
	{
		Node temp=root;
		int index1=-1;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				
			     index1=index;
			}
			temp=temp.next;
			index++;
		}
      return index1;
	}
	int indexOf(p data)
	{
		Node temp=root;
		int i=0;
		while(temp!=null)
		{
			if(temp.data==data)
				return i;
			temp=temp.next;
			i++;
			
		}
		return -1;
	}
	public String mytoString()
	{
		Node temp=root;
		String s="[";
		
		while(temp!=null)
		{
			s=s+temp.data+" ";
			if(temp.next!=null)
				s=s+", ";
			temp=temp.next;
		}
		s=s+"]";
		return s;
	}
}

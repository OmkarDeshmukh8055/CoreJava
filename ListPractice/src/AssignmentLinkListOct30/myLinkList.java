package AssignmentLinkListOct30;

public class myLinkList<E> {
	Node root;
	public void add(E data) 
	{
		if (root == null) 
		{
			root = new Node(data);
		} 
		else
		{
			Node temp = root;
			while (temp.next != null) 
			{
				temp = temp.next;
			}
			temp.next = new Node((E)data);
		}
	}
	public void set(E data,int i)
	{
		if(i<0 || root==null)
		
			throw new IndexOutOfBoundsException();
			if(i==0)
			{
				root.data=data;
				
			}
			else
			{
				int index=0;
				Node temp=root;
				while(index!=i)
				{
					index++;
				if(temp.next!=null)
					temp=temp.next;
				else
					throw new  IndexOutOfBoundsException();
				
				}
				temp.data=data;
			}
			
		}
	public int myindexof(E data)
	{
		if(root==null)
			return -1;
		Node temp=root;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
			{
			return index;
			}
			else if(temp.next==null)
			{
				return-1;
			}
			else
			{
				temp=temp.next;
				index++;
			}
		}
		return -1;
	}
	public boolean myContain(E data)
	{
		if(root==null)
			return false;
		Node temp=root;
	while(temp!=null)
		{
			if(temp.data==data)
			return true;
			temp=temp.next;
		}
		return false;			
	}
	public int mylastinsexof(E data)
	{  int i=-1;
	Node temp=root;
	int index=0;
	while(temp!=null)
	{
		if(temp.data==data)
		{
			i=index;
		}
		temp=temp.next;
		index++;
		}
	return i;
	}
	public void remove(int i)
	{
	if(root!=null)
	{
		if(i==0)
		{
			root=root.next;
		}
		else
		{
			int index=0;
			Node temp=root;
			while(index+1!=i)
			{
				index++;
				if(temp.next!=null)
					temp=temp.next;
				else
					break;
			}
			if(temp.next!=null)
				temp.next=temp.next.next;
		}
	}
	}
	public int size()
	{
		if(root==null)
			return 0;
		else
		{
			int count=0;
			Node temp=root;
			while(temp!=null)
			{
				count++;
				temp=temp.next;
			}
			return count;
		}
	}
	public Object [] toArray()
	{
		Object []a=new Object[size()];
		int i=0;
		Node temp=root;
		while(temp!=null)
		{
			a[i++]=temp.data;
			temp=temp.next;
		}
		return a;
	}
	public  E get(int i)
	{
		if(root==null)
			return null;
		int index=0;
		Node temp=root;
		while(true)
		{
			if(i==index)
				return (E) temp.data;
		if(temp.next==null)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			temp=temp.next;
			index++;
		}
		}
	}
	public boolean empty()
	{
		if(root==null)
			return true;
		return false;	
	}
	public void clear()
	{
		root=null;
	}
	public void print()
	{
		Node temp = root;
		while (temp != null) 
		{
			System.out.println(temp.data);
        temp=temp.next;
		}
	}
}

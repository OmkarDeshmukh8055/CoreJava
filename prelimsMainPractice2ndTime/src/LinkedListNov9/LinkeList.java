package LinkedListNov9;


public class LinkeList {

	Node root;

	public void add(int data) 
	{
		if (root == null) 
		
			root = new Node(data);
		
		else
		{
			Node temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(data);
		}

	}
	public void set(int i,int data)
	{
		if(root==null)
			throw new IndexOutOfBoundsException();
		if(i==0)
		{
			root.data=data;
		}
		else
		{
			Node temp=root;
			int index=0;
			while(index!=i)
			{ 
					index++;
					temp=temp.next;
				
					
				}
			temp.data=data;
			}
}
	public int indexof(int data)
	{
		Node temp=root;
		int i=0;
		if(temp.data==data)
			return i;
		else
		{
		while(temp.next!=null)
		{   
			if(temp.data==data)
		return i;
				i++;
			temp=temp.next;
			
		}
		return -1;
		}
		
	}
	public int lastindexof(int data)
	{
		Node temp=root;
		int i=0;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
				i=index;
			temp=temp.next;
			index++;
		}
		
		return i;
		
		
	}
	
	public int size()
	{
		Node temp=root;
		int i=0;
		
		while(temp!=null)
		{
			temp=temp.next;
			i++;
		}
		return i;
	}
	
	public void addwithindex (int i,int data)
	{
		Node itemp=root;
		if(i==0)
		{
			root=new Node(data);
		root.next=itemp;
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
					throw new IndexOutOfBoundsException();
			}
		    Node tempn=temp.next;
			temp.next=new Node(data);
			temp.next.next=tempn;
			
			}
				
	}
	public void remove(int i)
	{
		Node temp=root;
		if(i==0)
			root=temp.next;
		else
		{   
			int index=0;
			while(index+1!=i)
			{
				index++;
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
	}
	public Object[] toarray()
	{    Node temp=root;
	int index=0;
	Object[] a=new Object [size()];
		
			while(temp!=null)
			{
				a[index++]=temp.data;
				temp=temp.next;
				
			}
			return a;
		
		
		
	}
	public void print()
	{
		Node temp=root;
		while(temp!=null)
		{
		     System.out.println(temp.data);	
		     temp=temp.next;
		}
	}
}

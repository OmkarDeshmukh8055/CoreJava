package dublyLinkedList;

public class MyDublyLinkedList<p> {

	private	Node<p> head;
	private	Node<p> tail;
	
	public int size()
	{
		Node<p> temp=head;
		int index=0;
		while(temp!=null)
		{
			temp=temp.next;
			index++;
		}
		return index;
	}
	int indexOf(p data)
	{
		Node<p> temp=head;

		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
				 return index;
			temp=temp.next;
			index++;
		}
		return -1;
	}	
	int lastIndexOf(p data)
	{
		Node<p> temp=head;
		int indexValue=0;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
				 indexValue = index;
			temp=temp.next;
			index++;
		}
		return indexValue;
	}
	void set(p data,int i)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		int index=0;
		Node<p> temp=head;
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
	boolean contains(p data)
	{
		Node<p> temp=head;
		while(temp!=null)
		{
			if(temp.data==data)
				return true;
			temp=temp.next;
		}
		return false;
	}
	p get(int i)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		int index=0;
		Node<p> temp=head;
		while(temp!=null)
		{
			if(index==i)
			{
				
				return temp.data;
			}
			temp=temp.next;
			index++;
		
		}
		throw new ArrayIndexOutOfBoundsException();
		
		
	}
	
	void remove(int i)
	{
		if(i==0)
		{
			head=head.next;
			head.prev=null;
			return;
		}
		Node temp=head;
		int index=0;
		while(temp!=null)
		{
			if(index==i-1)
			{
				if(temp.next==null)
				{	
					throw new ArrayIndexOutOfBoundsException();
				}
				if(temp.next.next==null)
				{
					temp.next=null;
					tail=temp;
						return;
				}
				else
					temp.next=temp.next.next;
				temp.next.prev=temp;
				return;
			}
			temp=temp.next;
			index++;
	}
	}
	public void addWithIndex(int i,p data)
	{

		if(i<0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		Node<p>obj=new Node<p>(data);
		if(i==0)
		{
			obj.next=head;
			head.prev=obj;
			head=obj;
			return;
		}
		
			Node temp=head;
			int index=0;
			while(temp!=null)
			{			
				if(index==i-1)
				{
					obj.next=temp.next;

					if(temp.next!=null)
					{
						temp.next.prev=obj;
					}
					else
					tail=obj;
					temp.next=obj;
					obj.prev=temp;
					return;
				}
				temp=temp.next;
				index++;
			}
			throw new ArrayIndexOutOfBoundsException();

		}
	
		//add
		public void add(p data)
		{
			if(head==null)
			{
				Node<p>obj=new Node<p>(data);
				head=obj;
				tail=obj;
				return;
			}
			
			{
				Node temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				Node<p>obj=new Node<p>(data);
				temp.next=obj;
				obj.prev=temp;
				temp=obj;
				tail=obj;
				return;
			}
		}
		public void forWord()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		public void backWord()
		{
			Node temp=tail;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.prev;
			}
			System.out.println();
		}
}

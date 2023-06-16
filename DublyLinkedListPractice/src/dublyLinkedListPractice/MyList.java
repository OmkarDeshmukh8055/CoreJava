package dublyLinkedListPractice;


public class MyList <p>
{
	private	Node head;
	private	Node tail;
	
	void add(p data)
	{if(head==null)
	{
		Node<p>obj=new Node<p>(data);
		head=obj;
		tail=obj;
		return;
	}
	
	{
		Node<p>obj=new Node<p>(data);
		tail.next=obj;
		obj.prev=tail;
		tail=obj;
		return;
	}	}
	
	void addWithIndex(int i,p data)
	{
		
		if(i<0)
			throw new ArrayIndexOutOfBoundsException("It's my");
		if(i==0)
		{
			Node temp=head;
			Node obj=new Node<p>(data);
			obj.next=temp;
			obj.prev=head;
			head=obj;
			
		}
	}
	int size()
	{
		int size=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			size++;
		}
		return size;
	}
		void remove(int i)
		{
			if(i<0)
				throw new ArrayIndexOutOfBoundsException("it's my method");
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
				if(temp.next==null)
					throw new ArrayIndexOutOfBoundsException("it's my method");
				if(index==i-1)
				{
					if(temp.next.next==null)
					{
						temp.next=null;
						temp.prev=tail;
						return;
					}
					temp.next=temp.next.next;
					temp.next.prev=temp;
					return;
				}
					temp=temp.next;
					index++;
			}
			throw new ArrayIndexOutOfBoundsException("it's my method");
		}
		
		void reverse()
		{
			Node temp=tail;
			while(temp!=null)
			{
				System.out.print(temp.data+" "); 
				temp=temp.prev;	
			}
			System.out.println();
		}
	
		
		void forWord()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" "); 
				temp=temp.next;	
			}
			System.out.println();
		}
	 String myToString()
	{
		 Node temp=head;
		String s="[";
		
		while(temp!=null)
		{
			s=s+temp.data;
			if(temp.next!=null)
				s=s+", ";
			temp=temp.next;
		}
		s=s+"]";		
				return s;
	}
}

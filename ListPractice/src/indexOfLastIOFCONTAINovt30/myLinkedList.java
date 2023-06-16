package indexOfLastIOFCONTAINovt30;

public class myLinkedList <E>
{

	Node root;
	
	public void add(E data)
	{
		
			if(root==null)
			{
				Node tempRoot=root;
				root=new Node<E>(data);
				root.next=tempRoot;
			}
			else
			{
				Node temp=root;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
					temp.next=new Node<E>(data);
		}
	}


	public void add(E data,int i)
	{
		if(i<0)
			throw new IndexOutOfBoundsException();
			if(i==0)
			{
				Node tempRoot=root;
				root=new Node<E>(data);
				root.next=tempRoot;
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
					Node newTemp=temp.next;
					temp.next=new Node<E>(data);
					temp.next.next=newTemp;
		}
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

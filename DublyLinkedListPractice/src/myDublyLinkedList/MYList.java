package myDublyLinkedList;


public class MYList<p>
{
	Node head;
	Node tail;
	
	void add(p data)
	{
		if(head==null)
		{
			head=new Node<p>(data);
			tail=head;
		}
		else
		{
			Node<p> obj=new Node(data);
			tail.next=obj;
			obj.prev=tail;
			tail=obj;
			return;
		}
			
	}
	void printFWD()
	{
			Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void printReverse()
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

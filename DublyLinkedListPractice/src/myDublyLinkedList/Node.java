package myDublyLinkedList;

public class Node<p>
{
	p data;
	Node<p> next;
	Node<p> prev;
	
	Node(p data)
	{
		this.data=data;
	}
}

package dublyLinkedList;

public class Node<p> 
{
	Node<p> head;
	Node<p> tail;
	Node<p> next;
	Node<p> prev;
	
	p data;
	
	public Node(p data)
	{
		this.data=data;
	}
}

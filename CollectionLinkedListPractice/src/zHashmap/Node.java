package zHashmap;

public class Node<k,v> 
{
	Node next;
	 k key;
	 v value;

	public Node(k key , v value) 
	{
		this.key=key;
		this.value=value;
	} 
}

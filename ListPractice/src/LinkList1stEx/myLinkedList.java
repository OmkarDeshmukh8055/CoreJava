package LinkList1stEx;

public class myLinkedList {

	Node root;
	public void add(int num)
	{
		if(root == null)
		{
			root=new Node(num);
			
		}
		else
		{
			Node temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(num);
		}
		}
	
	//next Que String and clear method impliment
	
	public String toString ()
	
	{
		String s="";
      Node temp=root;
      while(temp!=null)
      {
    	 s= s+temp.data+" ";
    	 temp=temp.next;
      }
	return s;

	}
	public void clear()
	{
		root=null;
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

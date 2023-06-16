package LinkList1stEx;

public class myLinkedList2<E> {

	Node2 root;
	public void add(E num)
	{
		if(root == null)
		{
			root=new Node2(num);
			
		}
		else
		{
			Node2 temp=root;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new Node2(num);
		}
		}
	
	public  E get(int i)
	{
		if(root==null)
		
			return null;
			int index=0;
			Node2 temp=root;
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
	
	
	
	public String toString ()
	
	{
		String s="";
      Node2 temp=root;
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
		Node2 temp=root;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	

}

package HashMap;

public class myHashmap<D1,D2> {
	

	Node<D1,D2>[] a=new Node [5];
	
	public void put(D1 key,D2 value)
	{
		int index =key.hashCode()% a.length;
		Node temp=a[index];
		if (temp==null)
			a[index]=new Node(key,value);
		
		else
		{ 
			boolean shouldweAddNewObj=true;
			
				while(temp.next!=null)
				{
					if(temp.key==key)
					{
						temp.value=value;
						shouldweAddNewObj=false;
						break;
					}
					temp=temp.next;
				}
				if(shouldweAddNewObj)
				{
				
				temp.next=new Node (key,value);
				}
			}
		}
		
	
	
	public D2 get(D1 key)
	{
		int index=key.hashCode()%a.length;
		Node temp=a[index];
		
		while(temp!=null) 
		{
			if(temp.key==key)
				return (D2) temp.value;
			temp=temp.next;
		}
		return null;
	
	}
	
	public void replace(D1 key,D2 value)
	{
		int index =key.hashCode()% a.length;
		Node temp=a[index];
			boolean shouldweAddNewObj=true;
				while(temp!=null)
				{
					if(temp.key==key)
					{
						temp.value=value;
						shouldweAddNewObj=false;
						break;
					}
					temp=temp.next;
				}
	}
	
	public void remove(D1 key)
	{
		int index =key.hashCode()% a.length;
	Node temp=a[index];
		if(temp!=null)
		{
	if(temp.key==key)
	{
		a[index]=temp.next;
	}
	else
	{
		while(true)
		{
		if(temp.next==null)
				break;
		
				if(temp.next.key==key)
				{
			temp.next=temp.next.next;
			break;
			}
			temp=temp.next;
		}
			
		}
	}
	
	}	
		
//	public int size()
//	{  
//		Node temp=a[index];
//		int index=0;
//		while(temp!=null)
//		{
//			index++;
//		}
//		return index;
//		
//	}

	
	public void print()
	{
		for (int i = 0; i < a.length; i++) 
		{ 
		    Node temp=a[i];
    while(temp!=null)
    {
		 System.out.println(temp.key+" "+temp.value);
		 temp=temp.next;
    }
			
		}
	}
}

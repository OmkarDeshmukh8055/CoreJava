package zCollectionLinkedHashMap;

public class MyLinkedHashMap {
	Node a[]=new Node [5];
	Node root;
	void put(int key,String value)
	{	
		Node obj=new Node(key, value);
		int index=key%a.length;
		if(a[index]==null)
		{
		a[index]=obj;
		}
		else
		{
			Node temp=a[index];
			while(temp.hashnext!=null)
			{
				temp=temp.hashnext;
			}
			temp.hashnext= obj;
		}
		if(root==null)
		{
			root=obj;
		}
		else
		{
			Node temp=root;
			while(temp.linknext!=null)
			{
				temp=temp.linknext;
			}
			temp.linknext=obj;
		}
		
	}
	String get(int key)
	{
		int index=key%a.length;
		Node temp=a[index];
		while(temp!=null)
		{
			if(temp.key==key)
			{
				return temp.value;
			}
			temp=temp.hashnext;
		}
		return null;
		
	} 
	void print()
	{
		Node temp=root;
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			temp=temp.linknext;
		}
	}
	public static void main(String[] args)
	{
		MyLinkedHashMap l=new MyLinkedHashMap();
		l.put(1, "Abhi");
		l.put(1, "Omkar");
		l.put(2, "sachin");
		l.put(3, "rushi");
		l.put(4, "varad");
		l.put(5, "pavan");
		l.put(6, "pooja");
		l.put(7, "vaishnavi");
		l.put(8, "akash");
		l.put(9, "swapnil");

		System.out.println("get : "+l.get(8));
		l.print();
	}
}

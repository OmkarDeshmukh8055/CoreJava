package AssiLinkListOct30;



public class Node <E>{
	
	E data;
	Node next;
	public Node(E data) {
		super();
		this.data = data;
		this.next = next;
	}
}

class mylist<E>

	{
	Node root;
	public void add(E data)
	{
		if(root == null)
		{
			root=new Node((E)data);
			
		}
		else
		{
			Node temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(data);
		}
		}
	
	
	
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

	public void print()
	{
		Node temp=root;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
mylist<String> list=new mylist();
list.add("omya");
list.add("gany");
list.add("omya");
list.add("samy");

list.toString();
list.print();

	}

}

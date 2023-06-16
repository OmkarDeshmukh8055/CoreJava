package myArrayLLinkLCombo;

public class myarrayLinkC {

	Node[] a = new Node[5];

	public void print() 
	{
		for (int i = 0; i < a.length; i++) 
		{
               Node temp=a[i];
               while(temp!=null)
               {
            	   System.out.println(temp.data);
            	   temp=temp.next;
               }
		}
	}
	public void add(int data)
	{
		int index=data%a.length;
		Node temp=a[index];
		if(temp==null)
		a[index]=new Node(data);
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(data);
		}
	}
}

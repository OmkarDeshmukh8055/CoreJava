package practicemyArrayLLinkLComb3rd;


public class combo {

	Node a[]=new Node[5];
public void add(int data)
{   
	
	int index=data%a.length;
	 Node temp=a[index];
	if(temp==null)
	a[index]= new Node(data);
	
	else
	{
		while(temp!=null)
		{
		    
			temp=temp.next;
		}
		temp.next=new Node(data);
	}
}
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
}

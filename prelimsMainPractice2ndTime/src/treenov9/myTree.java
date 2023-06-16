package treenov9;

public class myTree {
 Node root;
 static int index=0;
 int size=0;
	public void add(int data)
	{
		
		if(root==null)
		{
			root=new Node (data);
		size++;
		}
		else
		{
			Node temp=root;
			while(true)
			{ 
				if(temp.data==data)
					break;
				
			else if(data<temp.data && temp.left==null)
			{
					temp.left=new Node (data);
					size++;
				      break;
			}
				      else if(data<temp.data && temp.left!=null)
				    	  temp=temp.left;
				      else if(data>temp.data && temp.right==null)
				      {
				    	  temp.right=new Node(data);
				    	  size++;
				    	  break;
				      }
				      else if(data>temp.data && temp.right!=null)
				    	  temp=temp.right;
			}
		}
	}
	public boolean contain(int data)
	{      
		Node temp=root;
		if(root==null)
			return false;
		else
		{
			
		while(temp!=null)
		{
	
			if(temp.data==data)
				return true;
		
				else if(data<temp.data && temp.left==null)
				return false;			
			else if(data<temp.data && temp.left!=null)
				temp=temp.left;
			else if(data>temp.data && temp.right==null)
				return false;
			else if(data>temp.data && temp.right!=null)
				temp=temp.right;
		}
		return false;
		}
	
	}
	public int size()
	{
		return size;
    }
		
	
	public void print()
	{   
		
		myprint(root);
	}
	private void myprint(Node Node)
	{ 
		
		if(Node.left!=null)
			myprint(Node.left);
			System.out.println(Node.data);
		
			if(Node.right!=null)
				myprint(Node.right);
		
	}
}

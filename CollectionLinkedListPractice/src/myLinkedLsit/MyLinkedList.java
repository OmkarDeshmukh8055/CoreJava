package myLinkedLsit;

public class MyLinkedList <p>{

		Node<p> root;
		int addOflastValue=0;
		public void add(p data)
		{
			Node<p> obj=new Node<p>(data);
			
			if(root==null)
			{
				root=obj;
			}
			else
			{
				Node<p> temp=root;
								
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=obj;
			}
			
		}
		 boolean contains(p data)
		{
			Node<p>temp=root;
			while(temp!=null)
			{
				if((temp.data==data))
				{
			    return true;
				}
				temp=temp.next;
			}
			return false;
			
		}
		
		int indexOf(p data)
		 {
			int index=0;
			Node temp=root;
			while(temp!=null)
			{
				if(temp.data==data)
					return index;
				temp=temp.next;
				index++;
			}
			 return -1;
		 }
		public String mytoString()
		{
			Node temp=root;
			String s="[";
			
			while(temp!=null)
			{
				s=s+temp.data;
				if(temp.next!=null)
					s=s+", ";
				temp=temp.next;
			}
			s=s+"]";
			return s;
					
		}
//		public void print()
//		{
//			Node<p> temp=root;
//			while(temp!=null)
//			{
//				System.out.println(temp.data);
//				temp=temp.next;
//			}
//		}
}

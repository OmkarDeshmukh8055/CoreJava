package AssignmntDoublyLinkedListNov1stEx1;


public class mylinkedList <E>{
     Node head;
     Node tail;
     
  public void add(E data)
  {
	  if(head==null && tail==null)
	  {
		  Node obj=new Node<E>(data);
		  head=obj;
		  tail=obj;		  
	  } 
	  else
	  {
		  Node obj=new Node<E>(data);
		  tail.next=obj;
		  obj.prevs=tail;
		  tail=obj;
		  
	  }
  }
  public void remove(int i)
  {
	  
  }
  public void printforword ()
  
  {    Node temp=head;
	  while(temp!=null)
	  {
		  System.out.println(temp.data);
		  temp=temp.next;
	  }
  }
  public void printReverse()
  {
	  Node temp=tail;
	  while(temp!=null)
	  {
		  System.out.println(temp.data);
		  temp=temp.prevs;
		  
	  }
	  
  }
	}

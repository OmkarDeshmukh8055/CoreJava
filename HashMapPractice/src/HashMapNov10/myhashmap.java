package HashMapNov10;

public class myhashmap <D1,D2> {	
Node <D1,D2> a[]=new Node[5];
	public void put(D1 key,D2 value) 
	{  
        int index=key.hashCode()%a.length;
        Node temp=a[index];
        if(temp==null)
        a[index]= new Node(key,value);
        else
        {
          while(true)
          {
        	
        	  if(temp.key==key)
              {
           	  temp.value=value;
           	  break;
              }
        	  else if(temp.next!=null)
        	  {
        		  temp=temp.next;
            	  break;
        	  }
           	  else  
           	  {
        	  temp.next=new Node (key,value);
           	  }
        }
        }
	}
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

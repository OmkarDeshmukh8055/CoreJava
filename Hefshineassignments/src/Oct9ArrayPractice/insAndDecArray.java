package Oct9ArrayPractice;

public class insAndDecArray
{

	public static void main(String[] args) 
	{
		int []a= {5,1,3,6,8,2,9,0,10};

		int incas=0,decas=0,incn=0,decn=0;
		
		if(a[0]>a[1])
				{
			incn=a[1];decn=a[0];
				}
		else
		{
			incn=a[0];decn=a[1];	
		}
		incas++; decas++;
		for (int i = 2; i < a.length; i++)
		{
			 if(a[i]>incn)
			{
			incas++;
			incn=a[i];
			}
			 else if(a[i]<decn)
				{
					decas++;
				decn=a[i];
				}
				
			else
			{
				System.out.println("-1 ,no seq possible");
				 System.exit((0)); 
			}
		}
		int []inca=new int [incas];
		int[]deca=new int[decas];
		int incindex=0; int decindex=0;
		
		if(a[0]>a[1])
		{
			deca[decindex++]=a[0];
			inca[incindex++]=a[1];	
		incn=a[1];
		}
		
		for (int i = 2; i < a.length; i++) 
		{
          if(a[i]>incn)
          {
        	  inca[incindex++]=a[i];
          incn=a[i];
		}    
          else
          {
        	  deca[decindex++]=a[i];
        	  
          }
					
		}
		for (int i = 0; i < inca.length; i++) 
		{
		System.out.print(inca[i]+" ");	
		}System.out.println();
		for (int i = 0; i < deca.length; i++)
		{
			System.out.print(deca[i]+" ");
		}
	}
	}
	

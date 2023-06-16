package ArrayTestoct8Array;

public class q4
{

	public static void main(String[] args) 
	{
int [][]a= {{6,3,1},
		  {9,2,8},
		 {2,4,5}};

        for (int i = 0; i < a.length; i++) 
         {
	       for (int j = 0; j < a.length; j++) 
	         {
		      int smallInRow=0;
		      int largeInCol=0;
		      
		      for (int k = 0; k < a.length; k++)
		      {
		    	  for (int k2 = 0; k2 < a.length; k2++)
		    	  {
					if(k==i) {
						if(a[k][k2]>a[i][j]) 
					
							smallInRow++;
					}
					else  if(k2==j)
		    		  if(a[k][k2]<a[i][j]) 
							
		    	  largeInCol++;
		    		   
		    	  }  
				}
	         
				if(smallInRow==0 && largeInCol==0)
					System.out.println(a[i][j]);
	         
				else if(smallInRow!=0 && largeInCol!=0)
					System.out.println("n");
         }
	          }
         }
	}



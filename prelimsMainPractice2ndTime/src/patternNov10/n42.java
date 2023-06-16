package patternNov10;

public class n42 {

	public static void main(String[] args) {
 
       for (int i = 0; i <10; i++)
       {
		  for (int j = 0; j <5; j++) 
		  {
			 if(j-i>=0  || j+i>=9)
				 System.out.print(j+1+" ");
			 else
			 System.out.print(" ");
     	}
		  System.out.println();
	}
       
       for (int i = 0; i < 9; i++)
       {
		 for (int j = 0; j < 9; j++)
		 {
			if(j-i<=0)
				System.out.print(1+j);
		}
		 System.out.println();
	}
       
       
       
       
       
       
       
       
       
       for (int i = 0; i < 6; i++)
       {
           int count=0;

    	        
    	   for (int j = 0; j < 10; j++)
    	   {
    		 for (int k = 0; k <3; k++)
    			 
			System.out.print(count);   
    		 
    	   count++;
			
		}
    	   System.out.println();
		
	}
       
       for (int i = 0; i <5; i++)
       {
		for (int j = 0; j < 5; j++) 
		{
			if(j+i==4)
			System.out.print("N");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
       
       
       for (int i = 0; i <5; i++)
       {
		for (int j = 0; j <9 ; j++) 
		{
			if(j-i==0 || j+i==8 )
			System.out.print("N");
			else
				System.out.print(" ");
		}
		System.out.println();
	}

       
       for (int i = 0; i <5; i++)
       {
		for (int j = 0; j <5 ; j++) 
		{
			if(i==0 || j==0 || j+i==4 )
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}

       for (int i = 0; i <5; i++)
       {
		for (int j = 0; j <5 ; j++) 
		{
			if(i==0 || i==4 || j-i==0 || j+i==4 )
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}

      
	}

}

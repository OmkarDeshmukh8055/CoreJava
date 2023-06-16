package AllPatternNOv11;

public class pattern {

	public static void main(String[] args) {

//14
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{  
				if(j-i>=0 || j+i>=8)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		//5
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{  
				if(j+i<=4 || j-i<=-4)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// 9
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++)
			{   if(j+i>=4)
				System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		//15
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 9; j++)
			{ if(j-i>=0  &&j<=4 ||j>=4&&  j-i<=0)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		///  18
		for (int i = 0; i <9; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if(j+i>=4 && j-i>=-4)
			  System.out.print("* ");	
			  else
				  System.out.print(" ");
			}
			System.out.println();
		}
		// 20
		for (int i = 0; i <9 ; i++)
		{
		  for (int j = 0; j <10; j++)
		  {
			if(j+i<=4 || j-i<=-4 || j-i>=5 || j+i>=13)
				System.out.print("*");
			else
				System.out.print(" ");
		}	
		  System.out.println();
		}
		//78
		for (int i = 0; i <5 ; i++) 
		{
			for (int j = 0; j < 20; j++)
			{ 
				if(j-i<=0 && j<=4 || j+i<=9 &&j>=5 ||
				j>5 &&j<=14&& j-i>=10 || j+i>=19)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	//79
		for (int i = 0; i <9 ; i++)
		{
	 for (int j = 0; j <10; j++)
			{ 
		         if(j-i<=0  && j+i<=8  || j+i>=9 && j-i>=1)
				System.out.print("*");
				else 
					System.out.print(" ");
			}
	 System.out.println();
		}
		
		//113
		
		for (int i = 0; i <13; i++) 
		{
			for (int j = 0; j < 17; j++)
			{ 
	//			//ifj+i>=3 && j-i<=5 ||j+i>=11 && j-i<=13 ||j-i>=-4 )
				if(i<=4 && j+i>=3 && j-i<=5 || i<=4&& j+i>=11 && j-i<=13 ||i>=4 &&j-i>=-4 &&i>=4 && j+i<=20)
			System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		 
		//24
		for (int i = 0; i <9 ; i++)
		{
			for (int j = 0; j <9; j++) 
			{    if(j+i>=4&& j-i>=-4 && j<=4 || j>=4&&j+i<=8 ||j>=4&& j-i<=0)
				System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}//23
			for (int i = 0; i < 9; i++) 
			{
			for (int j = 0; j < 9; j++)
			{    
				if(j-i>=0 && j-i<=4 && i<=4|| j+i>=8 && j+i<=12 && i>=4)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
			//29 ch
			for (int i = 0; i <12 ; i++) 
			{
				for (int j = 0; j < 6; j++) 
				{
					if(j+i<=5 || j-i<-5)
						System.out.print((char)(j+65));
					else
						System.out.print(" ");
				}
				System.out.println();
		}
			//36
			int ic=0;
			for (int i = 0; i <6 ; i++) 
			{
				for (int j = 0; j <6; j++)
				{  
					if(j-i<=0)
					{
					System.out.print((char)(ic+65));
					ic++;
					}
					else
						System.out.print(" ");
				}
		
				System.out.println();
			}
			//36
			
			for (int i = 0; i < 6; i++) 
			{
			
				for (int j = 0; j <6; j++) 
				{       
					if(j-i<=0)
					System.out.print((char)((1-j+i)+64));
					else
						System.out.print(" ");
				}
				
				System.out.println();
			}
			//35
			int cnt=0;
			for (int i = 0; i < 6; i++) 
			{
			   for (int j = 0; j < 6; j++)
			   {
				 if(j-i<=0)
				 {
					 
					 System.out.print((char)(cnt+65));
				 
	              cnt++;
				 }
				 else
					 System.out.print(" ");
			  }	
			
	
			   System.out.println();	
			}
			//36
			for (int i = 0; i < 6; i++)
			{
				for (int j = 0; j <6; j++) 
				{
					if(j-i<=0)
					System.out.print(i-j+1);
					else
						System.out.print(" ");
				}
			}
				System.out.println(); 
				
				int a=0;
				if(a==1)
		
					System.out.println("dds");
				System.out.println("dfr");
				
				
			
	}
}

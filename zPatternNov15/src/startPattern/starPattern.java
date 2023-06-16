package startPattern;

public class starPattern {

	public static void main(String[] args) {
          System.out.println("1");
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(2);
		
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j <4; j++) 
			{
				if(j-i<=0)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
        System.out.println("3");
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if(j+i>=3)
				
					System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
		}
        System.out.println("4");
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if(j>=2)
				
					System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
		}
		System.out.println(5);
		
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(j+i<=4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
        System.out.println("6");
		for(int i=0;i<=4;i++)
		{
			for(int j=0; j<=4;j++)
			{
				if(j+i>=4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
        System.out.println("7");
		System.out.println();
		for (int i = 0; i < 5; i++) 
		{ 
		for (int j = 0; j < 5; j++)
		{   if(j-i<=0)
				System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
		System.out.println("8");
		for (int i = 0; i < 5; i++) 
		{
		   for (int j = 0; j < 5; j++) 
		   {
			   if(j-i>=0)
			System.out.print("*");
			else
				System.out.print(" ");
			
		}	
		   System.out.println();
		}
		System.out.println("9");
		for (int i = 0; i < 5; i++) 
		{
		   for (int j = 0; j < 5; j++) 
		   {
			   if(j+i<=4)
			System.out.print("*");
			else
				System.out.print(" ");
			
		}	
		   System.out.println();
		}
		System.out.println("10");
		for (int i = 0; i < 9; i++) 
		{
		   for (int j = 0; j < 5; j++) 
		   {
			   if(j+i>=4 && j-i>=-4)
			System.out.print("*");
			else
				System.out.print(" ");
			
		}	
		   System.out.println();
		}
	}
}

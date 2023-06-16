package patternNov8;

public class chaAr {

	public static void main(String[] args) {
    
		System.out.println(1);
		for (int i = 0; i < 9;i++) 
		{ 
			for (int j = 0; j < 5; j++)
			{
				if(j-i<=0 && j+i<=8)
			 System.out.print(((char)(j+65)));
			 else
				 System.out.print(" ");
			}
			System.out.println();
		} 
		System.out.println(2);
		for (int i = 0; i < 9;i++) 
		{ 
			for (int j = 0; j < 5; j++)
			{
				if(j+i>=4 && j-i>=-4)
			 System.out.print(((char)(i+65)));
			 else
				 System.out.print(" ");
			}
			System.out.println();
		} 
	System.out.println(3);
	for (int i = 0; i < 5;i++) 
	{ 
		for (int j = 0; j < 5; j++)
		{
			if(j-i<=0)
		 System.out.print((char)(i+65));
	 else
		 System.out.print(" ");
		}
		System.out.println();
	} 
	 
		System.out.println();
		
	}
	
}

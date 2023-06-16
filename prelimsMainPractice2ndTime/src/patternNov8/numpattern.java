package patternNov8;

public class numpattern {
	public static void main(String args[])
	{
		for (int i = 0; i < 5; i++)
		{ 
			for (int j = 0; j < 9; j++)
			{
			  if(j+i>=4 && j<=4 )
				  System.out.print((char)((j+i-3)+64));
			  else if(j-i<=4 && j>=4)
				  System.out.print((char)(5-(j-i)+64));
			  else
				  System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
	}

}

package AllPattern;

public class p30 {

	public static void main(String[] args) {

		for (int i = 0; i < 12; i++)
		{
			for (int j = 0; j < 6; j++) 
			{
				if (j + i <= 5 )              
					System.out.print((char) (5 - (j + i) + 65));
     
				else if( j - i <= -6)
					System.out.print((char)(-6-j+i+65));
				else
		
			System.out.print(" ");
		}
		
		System.out.println();
		}

	}

}

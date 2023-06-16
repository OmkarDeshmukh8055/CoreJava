package AllPattern;

public class p35 {

	public static void main(String[] args) {

		int counter = 0;

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++) 
			{
				if (j - i <= 0)
					System.out.print((char) (counter ++ + 65));
			}
		

			System.out.println();

		}
	}

}

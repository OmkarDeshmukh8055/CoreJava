package AllPattern;

public class hw26Pattern {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{

				if (j + i >= 4 && j - i <= 4)
				{

					if ((j + i) % 2 == 0)

						System.out.print("*");

					else
						System.out.print("-");
				}
				else
					System.out.print("-");

			}
			System.out.println();
		}
	}

}

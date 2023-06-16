package testOct23;

public class Q8 {

	public static void main(String[] args) {

		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				if(j-i>=0 &&j<=4 || j>=4 && i>4&& j-i<=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

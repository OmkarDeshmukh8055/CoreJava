package AllPattern;

public class p42 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) 
		{ 
			for (int j = 0; j < 5; j++)
			{
				if(j-i>=0 &&i<=4||i>=4&& j+i>8)
				System.out.print(j+1+"");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

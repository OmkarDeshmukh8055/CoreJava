package AllPattern;

public class p28 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) 
		{ 
			for (int j = 0; j < 9; j++)
			{
				if(j-i<=0 &&j+i<=8)
				System.out.print((char)(j+65));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

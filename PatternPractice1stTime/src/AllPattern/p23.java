package AllPattern;

public class p23 {

	public static void main(String[] args) {

for (int i = 0; i < 9; i++) 
{
	for (int j = 0; j < 9; j++) 
	{
		if( j-i>=0 && j-i<=4 && i<=4 || j+i>=8 && j+i<=12 && i>4)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}

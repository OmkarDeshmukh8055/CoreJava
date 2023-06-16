package Basic;

public class P10 {

	public static void main(String[] args) {
		printi(0);
	}

	private static void printi(int i) 
	{
		if (i <5) 
		{
			printJ(i, 0);
			System.out.println();
			printi(i + 1);
		}
	}

	private static void printJ(int i, int j)
	{
		if (j <10) 
		{
			if (j+i>=4 && j-i<=4)
				System.out.print("*");
			else
				System.out.print(" ");
			printJ(i, j + 1);
		}
	}

}

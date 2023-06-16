package Basic;

public class P1 {

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
		if (j <5) 
		{
			//if (i==0 || j==0 || j==4 || i==4)
				System.out.print("*");
//			else
//				System.out.print(" ");
			printJ(i, j + 1);
		}
	}

}

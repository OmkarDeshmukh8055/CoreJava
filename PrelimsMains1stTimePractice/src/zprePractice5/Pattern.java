package zprePractice5;

public class Pattern {

	public static void main(String[] args) 
	{
		for (int i = 0; i <10; i++)
		{
			for (int j = 0; j <17; j=j+2) 
			{
				if(j+i>=8 && j-i<=8)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

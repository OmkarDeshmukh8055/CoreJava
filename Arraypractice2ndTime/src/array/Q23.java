package array;

public class Q23 {

	public static void main(String[] args) {

		int a[][]={ {1,1,1,1,1,1},
			    {1,1,1,1,1,1},
			    {1,1,1,1,1,1},
			    {1,1,1,1,1,1},
			    {1,1,1,1,1,1},
			   {1,1,1,1,1,1}};
			for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if(i==0 || i==a.length-1 || j==0 || j==a[i].length-1)
					System.out.print(a[i][j]+" ");
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();

		}

	}

}

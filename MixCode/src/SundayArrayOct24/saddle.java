package SundayArrayOct24;

public class saddle {

	public static void main(String[] args) {
		int a[][] = { { 6, 3, 1 },
				      { 9, 7, 8 }, 
			           {3, 2, 4 }};

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				int smallinrow = 0;
				int largeincol = 0;

				for (int k = 0; k < a.length; k++)
				{
					for (int k2 = 0; k2 < a.length; k2++) 
					{
						if (k == i)
						{
							if ( a[k][k2]<a[i][j])
						
								smallinrow++;
						}
							else
								if (k2 == j)
								{
									if ( a[k][k2] >a[i][j])
						
										largeincol++;
							
								}

						}
					}
				if(smallinrow==0&& largeincol==0)
					System.out.println(a[i][j]);
			}
			
		}
	}
}
